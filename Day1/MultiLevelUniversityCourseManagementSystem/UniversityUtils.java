package Day1.MultiLevelUniversityCourseManagementSystem;

import java.util.*;
class UniversityUtils {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Offered Course: " + course.getCourseName());
        }
    }
 }
 
