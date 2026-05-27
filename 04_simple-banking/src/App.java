import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<Account> listAccounts = new ArrayList<Account>();
        listAccounts.add(new Account("admin", 123, 0));
        listAccounts.add(new Account("admin1", 123, 0));
        listAccounts.add(new Account("admin2", 1234, 0));

        BankingManagement bankingManagement = new BankingManagement(listAccounts);
        // Select Account first
        boolean stayAtDashboard = true;
        Account currentAccount = null;

        while (stayAtDashboard) {
            System.out.println("---------------------------------");
            System.out.println("SimpleeBank");
            System.out.println("1. Login");
            System.out.println("2. Add Account");
            System.out.println("3. Remove Account");
            int adminChoice = validVal(3, 1);
            switch (adminChoice) {
                case 1:
                    System.out.print("Username: ");
                    String username = s.nextLine();
                    while (true) {
                        if (username.isEmpty()) {
                            System.out.println("Invalid input.");
                            System.out.print("Username: ");
                            username = s.nextLine();
                        } // end if
                        else {
                            System.out.print("Password: ");
                            int password = s.nextInt();
                            s.nextLine();
                            currentAccount = bankingManagement.getAccount(username);
                            while (!currentAccount.checkPassword(password)) {
                                System.out.println("Wrong password. Please retry.");
                                password = s.nextInt();
                                s.nextLine();
                            }
                            stayAtDashboard = false;
                            break;
                        } // end else
                    } // end while
                    break;
                case 2:
                    System.out.print("New username: ");
                    String newUsername = s.nextLine();
                    while (true) {
                        if (newUsername.isEmpty()) {
                            System.out.println("Invalid input.");
                            System.out.print("New username: ");
                            username = s.nextLine();
                        } // end if
                        else {
                            System.out.print("New Password: ");
                            int newPassword = s.nextInt();
                            s.nextLine();
                            listAccounts.add(new Account(newUsername, newPassword, 0));
                            break;
                        } // end else
                    } // end while
                    break;
                case 3:
                    System.out.print("Enter username: ");
                    String deletedUsername = s.nextLine();
                    listAccounts.remove(bankingManagement.getAccount(deletedUsername));
                    System.out.println("Deleted");
                    break;
                default:
                    System.out.println("Invalid option. Terminated...");
                    break;
            }
        }

        boolean notExit = true;

        while (notExit) {
            System.out.println("---------------------------------");
            System.out.println("Hello, " + currentAccount.username);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Account Info");
            System.out.println("4. Exit");

            int choice = validVal(3, 1);
            switch (choice) {
                case 1:
                    System.out.print("Enter the number u wanna deposit: ");
                    int depositNumber = s.nextInt();
                    s.nextLine();
                    currentAccount.deposit(depositNumber);
                    System.out.println("The current amount of money is: " + currentAccount.getTotalAmount());
                    break;
                case 2:
                    System.out.print("Enter the number u wanna withdraw: ");
                    int withdrawNumber = s.nextInt();
                    s.nextLine();
                    currentAccount.withdraw(withdrawNumber);
                    System.out.println("The current amount of money is: " + currentAccount.getTotalAmount());
                    break;
                case 3:
                    System.out.println("Username: " + currentAccount.getUsername());
                    System.out.println("Total Amount: " + currentAccount.getTotalAmount());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    notExit = false;
                    break;
                default:
                    System.out.println("Invalid option. Terminated...");
                    break;
            }
        }

    }

    public static int validVal(int max, int min) {

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            s.nextLine();

            if (choice >= min && choice <= max) {
                return choice;
            }

            System.out.println("Invalid input. Please enter a number between " + min + " and " + max);
            System.out.println();

        }
    }
}
