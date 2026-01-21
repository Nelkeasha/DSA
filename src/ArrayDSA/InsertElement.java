package ArrayDSA;

public class InsertElement {
    public static void main(String[] args) {
        int LA[] = new int [5];
        System.out.println("Array before insertion:");
        for (int a = 0; a < LA.length; a++) {
            System.out.println("LA[" + a + "] = " + LA[a]);
        }

        System.out.println("\nInserting element...");
        System.out.println("Array after insertion:");
        for (int a = 0; a < LA.length; a++) {
            LA[a] = a + 1;
            System.out.println("LA[" + a + "] = " + LA[a]);
        }
    }


}
