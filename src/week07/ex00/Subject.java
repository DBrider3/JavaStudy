package week07.ex00;

import java.util.ArrayList;

public class Subject {

    private int subjectId;
    private String subjectName;
    private int gradeType;
    private ArrayList<Student> students;

    public Subject(int subjectId, String subjectName, int gradeType) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.gradeType = gradeType;
    }

    public void register(Student student) {
        students.add(student);
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }
}
