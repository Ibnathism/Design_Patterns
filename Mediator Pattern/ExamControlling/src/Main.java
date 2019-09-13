import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Examinee> students = new ArrayList<>();
        List<ExamScript> examScripts = new ArrayList<>();
        List<Examiner> teachers = new ArrayList<>();
        teachers.add(new Examiner(101));
        for (int i = 0; i < 5; i++) {
            students.add(new Examinee(i+1));
            examScripts.add(students.get(i).getMyScript());
            examScripts.get(i).setExaminerID(teachers.get(0).getExaminerId());
        }
        teachers.get(0).addScripts(examScripts);
        ExamController.setExaminees(students);
        ExamController.setExaminers(teachers);

        teachers.get(0).checkAllScripts();

        for (Examinee e: students
             ) {
            e.publishMyMark();
            System.out.println();
        }

    }
}
