package week07.ex00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenerateGradeReport {

    private School school = School.getInstance();
    private StringBuffer report = new StringBuffer();
    private static final String LINE = "-------------------------------\n";
    private static final String HEADER = " 수강생 학점\n";
    private static final String TITLE = "이름 | 학번 | 중점과목 | 점수\n";

    private void makeHeader(Subject subject) {
        report.append(LINE);
        report.append(subject.getSubjectName());
        report.append(HEADER);
        report.append(TITLE);
    }


    private void makeBody(Subject subject) {
        ArrayList<Student> students = subject.getStudents();
        for (Student student: students) {
            report.append(student.getStudentName());
            report.append(" | ");
            report.append(student.getStudentId());
            report.append(" | ");
            report.append(student.getMajor().getSubjectName());
            report.append(" | ");

            report.append(student.getScores().get(subject.getSubjectId()).getPoint() + ":");
            report.append(gradeCalc(subject.getSubjectId(), student) + "\n");
            report.append(LINE);
        }
    }

    private String gradeCalc(int subjectId, Student student) {
        // score 를 바로 찾는다.
        Score score = student.getScores().get(subjectId);
        String result;
        if (subjectId == Define.DANCE) {
            PFEval eval = new PFEval();
            result = eval.getGrade(score.getPoint());
        }
        else {
            GradeEval eval;
            if (student.getMajor().getSubjectId() == score.getSubject().getSubjectId()) {
                eval = new MajorEval();
            }
            else {
                eval = new BasicEval();
            }
            result = eval.getGrade(score.getPoint());
        }
        return result;
    }

    public String getReport() {
        HashMap subjects = school.getSubjects();

        // Iterator선언
        Iterator<Map.Entry<Integer, Subject>> it = subjects.entrySet().iterator();

        // key, value 취득
        while(it.hasNext()) {
            // next를 사용해 값을 취득
            Map.Entry<Integer, Subject> subject = it.next();
            makeHeader(subject.getValue());
            makeBody(subject.getValue());
            report.append("\n");
        }
        return report.toString();
    }

}
