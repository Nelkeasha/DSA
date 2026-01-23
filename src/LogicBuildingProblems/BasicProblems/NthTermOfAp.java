package LogicBuildingProblems.BasicProblems;

public class NthTermOfAp {

    public static int nthTermOfAP(int a1, int a2, int n){
        int d = a2 - a1;

        return (a1 + (n - 1) * d);
    }

    public static void main(String[] args) {
        int a1 = 2 , a2 = 3;
        int n = 4;
        System.out.println(nthTermOfAP(a1, a2, n));
    }
}
