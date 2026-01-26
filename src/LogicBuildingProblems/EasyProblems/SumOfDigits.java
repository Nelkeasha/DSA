package LogicBuildingProblems.EasyProblems;

public class SumOfDigits {

    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumDigits(n));
    }
}
