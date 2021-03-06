package week07.ex00;

import java.util.HashMap;

public class Student {

    private int studentId;
    private String studentName;
    private Subject major;
    private HashMap<Integer, Score> scores; // 초기화 순서 땜에 new를 여기서 할 수도 있으니 다시 생각해 보기

    public Student(int studentId, String studentName, Subject major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.major = major;
        scores = new HashMap<>();
    }

    public void addScore(Score score) {
        scores.put(score.getSubject().getSubjectId(), score);
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

    public HashMap<Integer, Score> getScores() {
        return scores;
    }
}
