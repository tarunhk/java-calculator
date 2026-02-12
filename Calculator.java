import java.util.Scanner;

public class Calculator {

    // methods
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator ---");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + add(a, b));
                        break;
                    case 2:
                        System.out.println("Result: " + subtract(a, b));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply(a, b));
                        break;
                    case 4:
                        System.out.println("Result: " + divide(a, b));
                        break;
                }
            }

        } while (choice != 5);

        sc.close();
        System.out.println("Calculator closed.");
    }
}
