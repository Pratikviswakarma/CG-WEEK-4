package Day1.MultiLevelUniversityCourseManagementSystem;

abstract class CourseType {
    final private String courseName;
    public CourseType(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
 }
 