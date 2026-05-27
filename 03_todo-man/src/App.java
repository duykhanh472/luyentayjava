import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<String> tasks = loadFromFile("todo.txt");
        TaskManager taskManager = new TaskManager(tasks);
        boolean notExit = true;

        while (notExit) {
            System.out.println("---------------------------------");
            System.out.println("Taskeer");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List All Tasks");
            System.out.println("4. Exit");
            int choice = validVal(4, 1);
            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String taskName = s.nextLine();
                    while (true) {
                        if (taskName.isEmpty()) {
                            System.out.println("Invalid input. Please enter a task.");
                            System.out.print("Enter the task: ");
                            taskName = s.nextLine();
                        } // end if
                        else {
                            taskManager.addTask(taskName);
                            break;
                        } // end else
                    } // end while
                    break;
                case 2:
                    System.out.print("Enter the task id (0/1/2/3 .etc.): ");
                    int taskId = s.nextInt();
                    s.nextLine();
                    taskManager.removeTask(taskId);
                    break;
                case 3:
                    int currentTaskNumber = 0;
                    for (String task : taskManager.listTasks()) {
                        System.out.println(currentTaskNumber + ". " + task);
                        currentTaskNumber += 1;
                    }
                    break;
                case 4:
                    saveToFile(tasks, "todo.txt");
                    System.out.println("Bye");
                    notExit = false;
                default:
                    System.out.println("Invalid option. Terminated...");
                    break;
            }
        }

    }

    public static void saveToFile(ArrayList<String> tasks, String filename) throws IOException {
        PrintWriter f = new PrintWriter(new FileWriter(filename));
        for (String task : tasks) {
            f.println(task);
        }
        f.close();
    }

    public static ArrayList<String> loadFromFile(String filename) throws IOException {
        ArrayList<String> tasks = new ArrayList<String>();
        BufferedReader f = new BufferedReader(new FileReader(filename));

        // Read from file
        String text = f.readLine();
        while (text != null) {
            tasks.add(text);
            text = f.readLine();
        }

        // Closing
        f.close();
        return tasks;
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
