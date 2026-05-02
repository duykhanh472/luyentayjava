import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculator");
        boolean keepGoing = true;
        Scanner sc = new Scanner(System.in);
        while (keepGoing) {
            System.out.println("Enter the first number: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid number! Please enter again:");
                sc.nextLine();
            }
            double i = sc.nextDouble();
            System.out.println("Enter the second number: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid number! Please enter again:");
                sc.nextLine();
            }
            double j = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the operator (+ - * /): ");
            String opt = sc.nextLine();
            System.out.println("The result is " + cal(i, j, opt));
            System.out.println("Wanna continue (Y/N)?");
            String keepRunning = sc.nextLine().trim().toLowerCase();
            switch (keepRunning) {
                case "y":
                    break;
                case "n":
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Invalid option. Terminated...");
                    keepGoing = false;
                    break;
            }
        }
        sc.close();
    }

    public static double cal(double first, double second, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.err.println("The second number has to be different than 0");
                    result = 0;
                }
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }
}
