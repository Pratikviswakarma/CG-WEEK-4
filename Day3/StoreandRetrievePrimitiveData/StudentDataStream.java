package StoreandRetrievePrimitiveData;



import java.io.*;
import java.util.Scanner;


class Student {
   private int rollNumber;
   private String name;
   private double gpa;


   // Constructor
   public Student(int rollNumber, String name, double gpa) {
       this.rollNumber = rollNumber;
       this.name = name;
       this.gpa = gpa;
   }


   // Method to save student details using DataOutputStream
   public static void saveStudentData(String fileName, Student student) {
       try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName, true))) {
           dos.writeInt(student.rollNumber);
           dos.writeUTF(student.name);
           dos.writeDouble(student.gpa);
           System.out.println("Student data saved successfully.");
       } catch (IOException e) {
           System.out.println("Error writing student data: " + e.getMessage());
       }
   }


   // Method to retrieve and display student details using DataInputStream
   public static void readStudentData(String fileName) {
       try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
           System.out.println("\nRetrieved Student Data:");
           while (dis.available() > 0) {
               int roll = dis.readInt();
               String name = dis.readUTF();
               double gpa = dis.readDouble();
               System.out.println("Roll No: " + roll + ", Name: " + name + ", GPA: " + gpa);
           }
       } catch (FileNotFoundException e) {
           System.out.println("Error: Data file not found.");
       } catch (IOException e) {
           System.out.println("Error reading student data: " + e.getMessage());
       }
   }
}


public class StudentDataStream {
   private static final String FILE_NAME = "D:\\Capgemini Notes\\students.txt";


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       // Get student details from user
       System.out.print("Enter Roll Number: ");
       int rollNumber = scanner.nextInt();
       scanner.nextLine();


       System.out.print("Enter Name: ");
       String name = scanner.nextLine();


       System.out.print("Enter GPA: ");
       double gpa = scanner.nextDouble();




       Student student = new Student(rollNumber, name, gpa);
       Student.saveStudentData(FILE_NAME, student);


       // Read and display student data
       Student.readStudentData(FILE_NAME);


       scanner.close();
   }
}
