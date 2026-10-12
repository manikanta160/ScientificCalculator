
import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n=== SCIENTIFIC CALCULATOR ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Natural Logarithm");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid menu number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();
            double a, b;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();

                    if (b == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Result = " + (a / b));
                    }
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();

                    if (a < 0) {
                        System.out.println("Square root requires a non-negative number.");
                    } else {
                        System.out.println("Result = " + Math.sqrt(a));
                    }
                    break;

                case 6:
                    System.out.print("Enter base and exponent: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(a, b));
                    break;

                case 7:
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("Result = " +
                            Math.sin(Math.toRadians(a)));
                    break;

                case 8:
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("Result = " +
                            Math.cos(Math.toRadians(a)));
                    break;

                case 9:
                    System.out.print("Enter a positive number: ");
                    a = sc.nextDouble();

                    if (a <= 0) {
                        System.out.println("Logarithm requires a positive number.");
                    } else {
                        System.out.println("Result = " + Math.log(a));
                    }
                    break;

                case 0:
                    System.out.println("Calculator closed.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
