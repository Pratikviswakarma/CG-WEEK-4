package customannotation;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) {
        try {
            Method method = TaskManager.class.getMethod("completeTask");

            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Assigned To: " + taskInfo.assignedTo());
                System.out.println("Priority: " + taskInfo.priority());
            } else {
                System.out.println("No @TaskInfo annotation found.");
            }

            // Invoke method dynamically
            TaskManager taskManager = new TaskManager();
            method.invoke(taskManager);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
