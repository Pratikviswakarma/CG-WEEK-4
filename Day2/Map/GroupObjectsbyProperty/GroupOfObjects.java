package Day2.Map.GroupObjectsbyProperty;

import java.util.*;

public class GroupOfObjects {
    // Method to group employees by department
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();
 
 
        for (Employee emp : employees) {
          
            departmentMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }
 
 
        return departmentMap;
    }
 
 
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );
       
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);
 
 
        // Printing the result
        groupedEmployees.forEach((dept, empList) -> System.out.println(dept + ": " + empList));
    }
 }
 