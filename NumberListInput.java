import java.util.Scanner;

public class NumberListInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the list
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[n];

        // Input the numbers
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display the input numbers
        System.out.println("The input numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
