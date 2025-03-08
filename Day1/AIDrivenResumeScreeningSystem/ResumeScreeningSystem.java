package Day1.AIDrivenResumeScreeningSystem;

import java.util.*;
public class ResumeScreeningSystem {
    public static void main(String[] args) {       SoftwareEngineer softwareEngineer = new SoftwareEngineer("Software Engineer", "Engineering", "Java, Python, C++");
        DataScientist dataScientist = new DataScientist("Data Scientist", "Data Science", "Python, R, SQL");
        ProductManager productManager = new ProductManager("Product Manager", "Product", "Agile, Scrum");
 
        //Create resumes for each job role
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>(softwareEngineer);
        Resume<DataScientist> dataScientistResume = new Resume<>(dataScientist);
        Resume<ProductManager> productManagerResume = new Resume<>(productManager);
 
        //Process individual resumes
        System.out.println("Processing individual resumes:\n");
        softwareEngineerResume.processResume();
        dataScientistResume.processResume();
        productManagerResume.processResume();
 
        //Create a list of resumes to screen dynamically
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(softwareEngineer);
        allResumes.add(dataScientist);
        allResumes.add(productManager);
 
        //Use wildcard to screen resumes
        ResumeScreeningPipeline screeningPipeline = new ResumeScreeningPipeline();
        System.out.println("\nScreening all resumes in the pipeline:");
        screeningPipeline.screenResumes(allResumes);
    }
 }
 
 
 