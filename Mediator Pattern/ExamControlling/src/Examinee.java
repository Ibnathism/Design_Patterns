import java.util.Scanner;

public class Examinee {
    private int ID;
    private ExamScript myScript;

    public Examinee(int ID) {
        this.ID = ID;
        myScript = new ExamScript(ID);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ExamScript getMyScript() {
        return myScript;
    }

    public void recieveAfterChecking(ExamScript examScript){
        System.out.println("ExamScript received by Stdent ID : " + this.getID());
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("Do you want to re examine? (y/n)");
        choice = scanner.next();
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Re-examine request sent from student ID "+this.getID());
            sendForReexamination(examScript);
        }
    }

    public void sendForReexamination(ExamScript examScript){
        ExamController.sendForReExamine(examScript);
    }

    public void resultOfreExamine(String str) {
        System.out.println(str);
    }

    public void publishMyMark() {
        System.out.print("Student ID : " + this.getID() + "   Final Mark :"+this.getMyScript().getMark());
    }
}
