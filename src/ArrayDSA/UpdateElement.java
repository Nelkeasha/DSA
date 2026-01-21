package ArrayDSA;

public class UpdateElement {
    public static void main(String[] args) {
        int LA[] = {1, 2, 3, 4, 5};
        int n = LA.length;
        System.out.println("Array before update:");
        for (int i = 0; i < n; i++) {
            System.out.println("LA[" + i + "] = " + LA[i]);
        }

        int indexToUpdate = 2;
        int newValue = 10;
        System.out.println("\nUpdating element at index " + indexToUpdate + " to " + newValue + "...");
        LA[indexToUpdate] = newValue;

        System.out.println("Array after update:");
        for (int i = 0; i < n; i++) {
            System.out.println("LA[" + i + "] = " + LA[i]);
        }

    }
}
