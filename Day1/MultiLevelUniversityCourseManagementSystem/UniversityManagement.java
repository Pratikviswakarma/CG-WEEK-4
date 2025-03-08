package Day1.MultiLevelUniversityCourseManagementSystem;

public class UniversityManagement {
    public static void main(String[] args) {
        // Create courses
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics 101"));
        examCourses.addCourse(new ExamCourse("Physics 202"));
        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research Methods"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing"));
        // Display all courses
        UniversityUtils.displayCourses(examCourses.getCourses());
        UniversityUtils.displayCourses(researchCourses.getCourses());
    }
 }
 