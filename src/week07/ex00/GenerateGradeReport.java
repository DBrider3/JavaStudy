package week07.ex00;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenerateGradeReport {

    private School school = School.getInstance();
    private StringBuffer report = new StringBuffer();
    private static final String LINE = "------------------------\n";
    private static final String HEADER = "수강생 학점\n";
    private static final String TITLE = "이름 | 학번 | 중점과목 | 점수\n";


    private void makeHeader(int subjectId) {
        report.append(LINE);
        report.append(school.getSubjects().get(subjectId).getSubjectName());
        report.append(HEADER);
        report.append(TITLE);
    }

    private void makeBody(int subjectId) {
        ArrayList<Student> students = school.getSubjects().get(subjectId).getStudents();
        for (Student student: students) {
            report.append(student.getStudentName() + " | " + student.getStudentId() + " | " + student.getMajor().getSubjectName()
                    + "\t| " + student.getScores().get(subjectId).getPoint() + ":" + gradeCalc(subjectId, student) + " |\n");
            report.append(LINE);
        }
    }

    private String gradeCalc(int subjectId, Student student) {
        Score score = student.getScores().get(subjectId);
        String result;
        if (subjectId == Define.DANCE) {
            PFEval eval = new PFEval();
            result = eval.getGrade(score.getPoint());
        }
        else {
            if (student.getMajor().getSubjectId() == score.getSubject().getSubjectId()) {
                MajorEval eval = new MajorEval();
                result = eval.getGrade(score.getPoint());
            }
            else {
                BasicEval eval = new BasicEval();
                result = eval.getGrade(score.getPoint());
            }
        }
        return result;
    }

    public String getReport() {
        HashMap subjects = school.getSubjects();
//        Iterator<Integer, Subject> it = subjects.entrySet().iterator();
//        while (it.hasNext()) {
//            Subject subject = it.next();
//            makeHeader(subject.getSubjectId());
//            makeBody(subject.getSubjectId());
//        }

        // Iterator선언
        Iterator<Map.Entry<Integer, Subject>> it = subjects.entrySet().iterator();

        // key, value 취득
        while(it.hasNext()) {
            // next를 사용해 값을 취득
            Map.Entry<Integer, Subject> subject = it.next();
            makeHeader(subject.getValue().getSubjectId());
            makeBody(subject.getValue().getSubjectId());
        }



        return report.toString();
    }

}
