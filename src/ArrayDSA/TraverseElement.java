package ArrayDSA;

public class TraverseElement {
    public static void main(String[] args) {
        int LA[] = {1, 2, 3, 4, 5};
        int n = LA.length;

        System.out.println("Traversing array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("LA[" + i + "] = " + LA[i]);
        }
    }
}
