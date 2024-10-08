import java.util.Scanner;

public class StringMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Input second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Merge the strings
        String mergedString = firstString + secondString;

        // Output the merged string
        System.out.println("Merged String: " + mergedString);

        scanner.close();
    }
}
