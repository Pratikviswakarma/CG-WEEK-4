package Day1.AIDrivenResumeScreeningSystem;

import java.util.*;
class ResumeScreeningPipeline {
    // Method to screen resumes using wildcards
    public void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("\nScreening Resume:");
            resume.displayJobDetails();
            System.out.println("AI analysis for " + resume.jobTitle + " resume completed.\n");
        }
    }
 }
 
