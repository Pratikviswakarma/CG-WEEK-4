package Day1.MultiLevelUniversityCourseManagementSystem;

import java.util.*;
class Course<T extends CourseType> {
    final private List<T> courses = new ArrayList<>();
    public void addCourse(T course) {
        courses.add(course);
    }
    public List<T> getCourses() {
        return courses;
    }
 }
 
