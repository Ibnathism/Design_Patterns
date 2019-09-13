public class ExamScript {
    private int studentID;
    private int examinerID;
    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }


    public ExamScript(int studentID, int examinerID) {
        this.studentID = studentID;
        this.examinerID = examinerID;
    }

    public ExamScript(int studentID) {
        this.studentID = studentID;
    }

    public int getExaminerID() {
        return examinerID;
    }

    public void setExaminerID(int examinerID) {
        this.examinerID = examinerID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
