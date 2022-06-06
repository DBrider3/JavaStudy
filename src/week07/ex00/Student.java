package week07.ex00;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    private Subject major;
    private ArrayList<Score> scores;

    public void addScore(Score score) {
        scores.add(score);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajor() {
        return major;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }
}
