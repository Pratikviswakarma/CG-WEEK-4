package Day1.AIDrivenResumeScreeningSystem;



class DataScientist extends JobRole {
    private String dataAnalysisTools;
    public DataScientist(String jobTitle, String department, String dataAnalysisTools) {
        super(jobTitle, department);
        this.dataAnalysisTools = dataAnalysisTools;
    }
    @Override
    public void displayJobDetails() {
        System.out.println("Job Title: " + jobTitle + " | Department: " + department + " | Data Analysis Tools: " + dataAnalysisTools);
    }
 }
 
 
 
 
 