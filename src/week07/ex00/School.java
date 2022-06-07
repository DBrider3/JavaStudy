package week07.ex00;

import java.util.ArrayList;
import java.util.HashMap;

public class School {

    private static School instance = new School();

    private HashMap<Integer, Subject> subjects;
    private ArrayList<Student> students;

    private School() {
        subjects = new HashMap<>();
        students = new ArrayList<>();
    }

    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }

    public HashMap<Integer, Subject> getSubjects() {
        return subjects;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addSubject(Subject subject) {
        subjects.put(subject.getSubjectId(), subject);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
