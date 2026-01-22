package LogicBuildingProblems.BasicProblems;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("Before swaping two numbers: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("After swaping two numbers: ");

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping two numbers: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
