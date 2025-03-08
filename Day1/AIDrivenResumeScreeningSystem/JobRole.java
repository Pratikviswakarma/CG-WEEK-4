package Day1.AIDrivenResumeScreeningSystem;

abstract class JobRole {
    protected String jobTitle;
    protected String department;
    public JobRole(String jobTitle, String department) {
        this.jobTitle = jobTitle;
        this.department = department;
    }
    //display job-specific details
    public abstract void displayJobDetails();
 }
 