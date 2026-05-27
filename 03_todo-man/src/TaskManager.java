import java.util.ArrayList;

public class TaskManager {
    ArrayList<String> tasks;

    // Quá trình đọc dữ liệu từ tệp sẽ được xử lý riêng
    public TaskManager(ArrayList<String> tasks) {
        this.tasks = tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public ArrayList<String> listTasks() {
        return tasks;
    }

    public void removeTask(int id) {
        tasks.remove(id);
    }

}
