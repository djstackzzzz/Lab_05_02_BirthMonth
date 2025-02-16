import java.util.Scanner;

class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for birth month
        System.out.print("Enter your birth month (1-12): ");

        // Validate input
        if (in.hasNextInt()) {
            int month = in.nextInt();
            in.nextLine(); // Clear input buffer

            // Check range
            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        in.close();
    }
}
