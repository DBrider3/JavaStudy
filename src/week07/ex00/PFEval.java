package week07.ex00;

public class PFEval implements GradeEval {
    @Override
    public String getGrade(int point) {
        if (point >= 70) {
            return "P";
        }
        else
            return "F";
    }
}
