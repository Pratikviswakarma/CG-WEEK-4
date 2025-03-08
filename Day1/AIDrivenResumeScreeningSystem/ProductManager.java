package Day1.AIDrivenResumeScreeningSystem;

class ProductManager extends JobRole {
    private String productLifecycleExperience;
    public ProductManager(String jobTitle, String department, String productLifecycleExperience) {
        super(jobTitle, department);
        this.productLifecycleExperience = productLifecycleExperience;
    }
    @Override
    public void displayJobDetails() {
        System.out.println("Job Title: " + jobTitle + " | Department: " + department + " | Product Lifecycle Experience: " + productLifecycleExperience);
    }
 }
 