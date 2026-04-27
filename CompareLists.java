package homeworks;
import java.util.Scanner;

public class CompareLists {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for number of elements
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        // Create two arrays
        int[] list1 = new int[n];
        int[] list2 = new int[n];

        // Input for list 1
        System.out.println("Enter elements for list 1:");
        for (int i = 0; i < n; i++) {
            list1[i] = input.nextInt();
        }

        // Input for list 2
        System.out.println("Enter elements for list 2:");
        for (int i = 0; i < n; i++) {
            list2[i] = input.nextInt();
        }

        // Display lists
        System.out.println("List 1:");
        display(list1);

        System.out.println("List 2:");
        display(list2);

        // Compare lists
        boolean result = equals(list1, list2);

        // Display result
        if (result) {
            System.out.println("The two lists are equal.");
        } 
        else {
            System.out.println("The two lists are NOT equal.");
        }

        input.close();
    }

    // Method to display array elements
    public static void display(int[] list) {
        for (int num = 0; num < list.length; num++) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to compare two arrays
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;
    }
}
