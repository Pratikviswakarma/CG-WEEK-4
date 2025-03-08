package ReadUserInputfromConsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInput {
    //Main method
    public static void main(String[] args) {
        String outputFile = "D:\\Capgemini Notes\\user_data.txt";
 
 
        String userData = readUserInput();
 
 
        // Write user input to a file
        if (writeToFile(outputFile, userData)) {
            System.out.println("User data saved successfully in " + outputFile);
        } else {
            System.out.println("Failed to save user data.");
        }
    }
 
 
    // Method to read user input from the console using BufferedReader
    public static String readUserInput() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name: ");
            String name = reader.readLine();
 
 
            System.out.print("Enter your age: ");
            String age = reader.readLine();
 
 
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();
 
 
            return "Name: " + name + "\nAge: " + age + "\nFavorite Language: " + language + "\n";
 
 
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
            return null;
        }
    }
 
 
    // Method to write user input to a file using FileWriter
    public static boolean writeToFile(String fileName, String data) {
        if (data == null) return false;
 
 
        try (FileWriter writer = new FileWriter(fileName,true)) {
            writer.write(data);
            return true;
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return false;
        }
    }
 }
 