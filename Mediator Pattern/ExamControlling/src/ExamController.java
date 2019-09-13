import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamController {
    private static List<Examiner> examiners = new ArrayList<>();
    private static List<Examinee> examinees = new ArrayList<>();

    public static void sendForReExamine(ExamScript examScript) {
        for (Examiner e: examiners
             ) {
            if (e.getExaminerId()==examScript.getExaminerID()) e.receiveForReExamine(examScript);
        }
    }

    public static List<Examiner> getExaminers() {
        return examiners;
    }

    public static void setExaminers(List<Examiner> examiners) {
        ExamController.examiners = examiners;
    }

    public static List<Examinee> getExaminees() {
        return examinees;
    }

    public static void setExaminees(List<Examinee> examinees) {
        ExamController.examinees = examinees;
    }

    public static void addExaminees(List<Examinee> e){
        examinees = e;
    }

    public static void addExaminers(List<Examiner> e){
        examiners = e;
    }

    public static void receiveFromExaminer(List<ExamScript> examScripts){
        ExamController.scrutinize(examScripts);
        ExamController.correctMistake(examScripts);
       // ExamController.publish();
        ExamController.printMarkSheet(examScripts);
        for (ExamScript es: examScripts
             ) {
            ExamController.publish(es);
        }
    }



    public static void ifAnyChange(ExamScript examScript, boolean ifAny, int newMark){
            for (Examinee e: examinees
                 ) {
                if (e.getID() == examScript.getStudentID()){
                    if (ifAny){
                        e.resultOfreExamine("Here's your new marks after re examination  "+newMark);
                        e.getMyScript().setMark(newMark);
                    }
                    else e.resultOfreExamine("No change found after re examination");
                }
            }

    }



    private static void scrutinize(List<ExamScript> examScripts){
        System.out.println("Scrutinization complete.");
    }

    private static void correctMistake(List<ExamScript> examScripts){
        System.out.println("Mistakes corrected.");
    }

    private static void publish(ExamScript examScript){
        System.out.println("The script of Student ID : "+examScript.getStudentID()+" is getting published.");
        for (Examinee e: examinees
             ) {
            if (e.getID()==examScript.getStudentID()) e.recieveAfterChecking(examScript);
        }

    }

    private static void printMarkSheet(List<ExamScript> examScripts){
        System.out.println("MARKSHEET");
        for (ExamScript es : examScripts
             ) {
            System.out.println("Student Id : " + es.getStudentID()+"      Mark : " + es.getMark());
        }
    }



}
