package ArrayDSA;

public class SearchElement {
    public static void main(String[] args) {
        int LA[] ={1,2,3,4,5};
        int n = LA.length;
        int searchElement = 3;

        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("LA[ " + i + "] = " + LA[i]);
        }
        System.out.println("\nSearching for element " + searchElement + "...");
        System.out.println("Array search result:");

        for (int i = 0; i < n; i++) {
            if (LA[i] == searchElement) {
                System.out.println("Element " + searchElement + " found at index " + i);
                return;
            }
        }
    }
}
