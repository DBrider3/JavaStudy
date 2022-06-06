package week03.ex00;

public class Student {

    String          studentName;
    private static int      serialNum = 1000;
    int             studentID;

    public Student() {
        studentID = ++this.serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
