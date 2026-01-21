package ArrayDSA;

public class DeleteElement {
    public static void main(String[] args) {
        int LA[] = {1,2,3,4,5};
        int n = LA.length;
        System.out.println("Array before deletion:");
        for (int a = 0; a < n; a++) {
            System.out.println("LA[" + a + "] = " + LA[a]);
        }
        System.out.println("\nDeleting element at index 2...");
        System.out.println("Array after deletion:");
        for ( int i = 2; i < n-1; i++ ) {
            LA[i] = LA[i + 1];
        }
        n--;
            for (int i = 0; i < n; i++) {
                System.out.println("LA[" + i + "] = " + LA[i]);
            }

    }
}
