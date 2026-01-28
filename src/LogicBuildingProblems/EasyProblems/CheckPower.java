package LogicBuildingProblems.EasyProblems;

public class CheckPower {
    public static boolean isPower(int x, long y) {

        if(y == 1) return  x == 1;

        if (x < 1 || y < 1) return false;

        while (x > 1) {
            if (x % y != 0) return false;
            x /= y;
        }
            return true;
    }

    public static void main(String[] args) {
        int x = 27;
        int y = 3;
        System.out.println(isPower(x, y));
    }
}
