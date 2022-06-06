package week03.ex04;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjects = new ArrayList<>();

    public Student() {}

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void addSubject(String name, int score) {
        subjects.add(new Subject(name, score));
//        subject.getSubjectName().add(name);
//        subject.getScore().add(score);
    }

    public void showStudentInfo() {
        int sum = 0;
        for (Subject subject : subjects) {
            System.out.println("학생 " + studentName + "의 " + subject.getSubjectName() + " 과목 성적은 " + subject.getScore() + "입니다.");
            sum += subject.getScore();
        }
        System.out.println("학생 " + studentName + "의 총점은 " + sum + "입니다.");
    }
}
