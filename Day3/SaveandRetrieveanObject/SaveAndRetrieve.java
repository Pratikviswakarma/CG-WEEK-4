package SaveandRetrieveanObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Employee class (Serializable)
class Employee implements Serializable {
   private static final long serialVersionUID = 1L;


   private int id;
   private String name;
   private String department;
   private double salary;


   // Constructor
   public Employee(int id, String name, String department, double salary) {
       this.id = id;
       this.name = name;
       this.department = department;
       this.salary = salary;
   }


   // Display employee details
   public void display() {
       System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: $" + salary);
   }
}


public class SaveAndRetrieve {
   private static final String FILE_NAME = "D:\\Capgemini Notes\\employees.txt";


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       List<Employee> employees = new ArrayList<>();


       System.out.println("Enter employee details (Enter '0' as ID to stop):");
       while (true) {
           System.out.print("Enter ID: ");
           int id = scanner.nextInt();
           if (id == 0) break;


           scanner.nextLine();
           System.out.print("Enter Name: ");
           String name = scanner.nextLine();


           System.out.print("Enter Department: ");
           String department = scanner.nextLine();


           System.out.print("Enter Salary: ");
           double salary = scanner.nextDouble();


           employees.add(new Employee(id, name, department, salary));
       }


       // Serialize employee list
       if (serializeEmployees(employees)) {
           System.out.println("Employees saved successfully to " + FILE_NAME);
       } else {
           System.out.println("Failed to save employee data.");
       }


       // Deserialize and display employees
       List<Employee> loadedEmployees = deserializeEmployees();
       if (loadedEmployees != null) {
           System.out.println("\nRetrieved Employee List:");
           for (Employee emp : loadedEmployees) {
               emp.display();
           }
       } else {
           System.out.println("No employee data found.");
       }


       scanner.close();
   }


   // Method to serialize (save) the list of employees to a file
   public static boolean serializeEmployees(List<Employee> employees) {
       try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
           oos.writeObject(employees);
           return true;
       } catch (IOException e) {
           System.out.println("Error saving employees: " + e.getMessage());
           return false;
       }
   }


   // Method to deserialize (load) the list of employees from a file
   public static List<Employee> deserializeEmployees() {
       try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
           return (List<Employee>) ois.readObject();
       } catch (FileNotFoundException e) {
           System.out.println("No existing employee data found.");
       } catch (IOException | ClassNotFoundException e) {
           System.out.println("Error loading employees: " + e.getMessage());
       }
       return null;
   }
}
