package customannotation;

public class TaskManager {

    @TaskInfo(assignedTo = "Alice", priority = 1)
    public void completeTask() {
        System.out.println("Task completed!");
    }
}

