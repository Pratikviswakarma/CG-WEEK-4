package repeatableannotation;

public class IssueTracker {

    @BugReport(description = "NullPointerException when input is null", reportedBy = "Alice")
    @BugReport(description = "Incorrect output for negative numbers", reportedBy = "Bob")
    public void processData() {
        System.out.println("Processing data...");
    }
}
