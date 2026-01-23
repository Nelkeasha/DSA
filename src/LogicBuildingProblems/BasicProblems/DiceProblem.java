package LogicBuildingProblems.BasicProblems;

public class DiceProblem {

    public int oppositeFaceOfDice(int n) {
        if (n < 1 || n > 6) {
            return -1;
        }
        return 7 - n;
    }

    public static void main(String[] args) {
        DiceProblem dp = new DiceProblem();
        int face = 6;
        System.out.println(dp.oppositeFaceOfDice(face));

    }
}
