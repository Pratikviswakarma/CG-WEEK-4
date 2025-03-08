package Day1.AIDrivenResumeScreeningSystem;

class Resume<T extends JobRole> {
    private T jobRole;
    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }
    //Process resume for the specific job role
    public void processResume() {
        System.out.println("Processing resume for: ");
        jobRole.displayJobDetails();  // Display job-specific details
    }
 }
 