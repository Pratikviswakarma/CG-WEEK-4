package repeatableannotation;

import java.lang.reflect.Method;

public class BugReportProcessor {
    public static void main(String[] args) {
        try {
            Method method = IssueTracker.class.getMethod("processData");

            // Check if the method has multiple bug reports
            if (method.isAnnotationPresent(BugReports.class)) {
                BugReports bugReports = method.getAnnotation(BugReports.class);
                for (BugReport bug : bugReports.value()) {
                    System.out.println("Bug Description: " + bug.description());
                    System.out.println("Reported By: " + bug.reportedBy());
                    System.out.println("-------------------------");
                }
            } else {
                System.out.println("No bug reports found.");
            }

            // Invoke method dynamically
            IssueTracker tracker = new IssueTracker();
            method.invoke(tracker);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
