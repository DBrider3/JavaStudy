package week03.ex04;

import java.util.ArrayList;

public class Subject {
//    private ArrayList<String> subjectName = new ArrayList<String>();
//    private ArrayList<Integer> score = new ArrayList<Integer>();
    private String subjectName;
    private int score;
    public Subject() {}

    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getScore() {
        return score;
    }
//    public ArrayList<Integer> getScore() {
//        return score;
//    }
//
//    public ArrayList<String> getSubjectName() {
//        return subjectName;
//    }
}
