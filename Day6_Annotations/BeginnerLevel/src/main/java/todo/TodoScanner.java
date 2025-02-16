package todo;

import java.lang.reflect.Method;

public class TodoScanner {
    public static void main(String[] args) {
        Class<?> clazz = ProjectTasks.class;

        System.out.println("Pending Tasks:");
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Task: " + annotation.task());
                System.out.println("Assigned To: " + annotation.assignedTo());
                System.out.println("Priority: " + annotation.priority());
                System.out.println("--------------------------");
            }
        }
    }
}

