import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Examiner  {
    private List<ExamScript> examScripts = new ArrayList<>();



    private int examinerId;

    public Examiner(int examinerId) {
        this.examinerId = examinerId;
    }


    public int getExaminerId() {
        return examinerId;
    }

    public void setExaminerId(int examinerId) {
        this.examinerId = examinerId;
    }



    public void addScripts(List<ExamScript> examScripts){
        this.examScripts = examScripts;
    }

    public void removeScript(ExamScript examScript){
        examScripts.remove(examScript);
    }

    public void checkAllScripts(){
        for (ExamScript es: examScripts
             ) {
            checkScript(es);
        }
        sendToController();
    }

    public void checkScript(ExamScript examScript){
        int randomNum = ThreadLocalRandom.current().nextInt(60, 90+1);
        examScript.setMark(randomNum);
        //System.out.println("The Script of Student ID : " +examScript.getStudentID()+"   Marks : "+examScript.getMark()+" checking done by the examiner");
    }

    private void sendToController(){
        System.out.println("ExamScripts checking done by the examiner.");
        System.out.print("Scripts and marks of student id ");
        for (ExamScript es: examScripts
             ) {
            System.out.print(es.getStudentID()+", ");
        }
        System.out.print("sent to exam controller office\n");
        ExamController.receiveFromExaminer(examScripts);
    }

    public void receiveForReExamine(ExamScript examScript){
        System.out.println("Re-examine request got from Student ID "+examScript.getStudentID());
        reExamine(examScript);
    }



    private void reExamine(ExamScript examScript){
        System.out.println("The script of Student ID : "+examScript.getStudentID()+" is being re-examined.");
        /*System.out.println("Is there any change after re examination? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("y")) ExamController.ifAnyChange(examScript, true);
        else ExamController.ifAnyChange(examScript, false);*/
        boolean correctMarking = new Random().nextBoolean();
        int newMark = ThreadLocalRandom.current().nextInt(1, 5+1);
        ExamController.ifAnyChange(examScript,correctMarking, examScript.getMark()+newMark);

    }
}
