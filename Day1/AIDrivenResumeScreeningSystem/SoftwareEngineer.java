package Day1.AIDrivenResumeScreeningSystem;

class SoftwareEngineer extends JobRole {
    private String programmingLanguages;
    public SoftwareEngineer(String jobTitle, String department, String programmingLanguages) {
        super(jobTitle, department);
        this.programmingLanguages = programmingLanguages;
    }
    @Override
    public void displayJobDetails() {
        System.out.println("Job Title: " + jobTitle + " | Department: " + department + " | Programming Languages: " + programmingLanguages);
    }
 }
 
 
 
