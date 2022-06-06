package week07.ex00;

public class BasicEval implements GradeEval {
    @Override
    public String getGrade(int point) {
        if (point >= 90 && point <= 100) {
            return "A";
        }
        else if (point >= 80 && point <= 89) {
            return "B";
        }
        else if (point >= 70 && point <= 79) {
            return "C";
        }
        else if (point >= 55 && point <= 69) {
            return "D";
        }
        else {
            return "F";
        }
    }
}
