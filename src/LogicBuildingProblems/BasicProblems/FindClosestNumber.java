package LogicBuildingProblems.BasicProblems;

public class FindClosestNumber {

    public int closestNumber(int n, int m) {
        int q = n / m;

        int lower = q * m;
        int upper = (q + 1) * m;

        if (Math.abs(n - lower) < Math.abs(n - upper)) {
            return lower;
        } else  {
            return upper;
        }
    }

    public static void main(String[] args) {
        FindClosestNumber obj = new FindClosestNumber();
        int n = 13;
        int m = 4;
        System.out.println(obj.closestNumber(n, m));
    }
}
