import java.util.Scanner;

public class App {
    /*
    Generate random number (1-100).
    Loop: read user guess, give "too high/low" hints.
    Count attempts. End when guessed correctly. */
    public static void main(String[] args) throws Exception {
        System.out.println("Number Guessing Game");
        boolean keepGoing = true;
        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random() * 100 + 1);
        int attempts = 0;

        while (keepGoing) {
            System.out.print("Enter your guess: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid number. Please retry.");
                sc.nextLine();
            }
            int userGuess = sc.nextInt();
            attempts += 1;
            if (userGuess > random) {
                if (userGuess > (random + 10)) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Almost there! The number you guess is a little bit higher than the correct number");
                }
            } else if (userGuess < random) {
                if (userGuess < (random - 10) && (random > 10)) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Almost there! The number you guess is a little bit lower than the correct number");
                }
            } else {
                System.out.println("Correct! The generated number is: " + random);
                System.out.println("Attempt: " + attempts);
                break;
            }
        }
        sc.close();
    }
}