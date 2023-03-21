import java.util.Scanner;

public class comparing_genn {
    public static void main(String[] args) {
        int[] shopAsales = {42, 52, 46, 50, 48, 58, 49, 51, 50, 60, 58, 61};
        int[] shopBsales = {57, 70, 67, 72, 63, 67, 65, 69, 60, 73, 62, 75};

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a month number (1-12): ");
            int monthNumber = scanner.nextInt();

            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                return;
            }

            int shopASalesForMonth = shopAsales[monthNumber - 1];
            int shopBSalesForMonth = shopBsales[monthNumber - 1];

            if (shopASalesForMonth > shopBSalesForMonth) {
                System.out.println("Shop A had better sales than Shop B in month " + monthNumber);
            } else if (shopASalesForMonth < shopBSalesForMonth) {
                System.out.println("Shop B had better sales than Shop A in month " + monthNumber);
            } else {
                System.out.println("Shop A and Shop B had the same sales in month " + monthNumber);
            }
        }
    }
}

