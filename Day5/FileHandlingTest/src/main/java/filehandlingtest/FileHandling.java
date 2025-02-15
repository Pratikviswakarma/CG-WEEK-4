package filehandlingtest;

import java.io.*;

public class FileHandling {
    //Method for write to file
    public static void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }
    //Method read form file
    public static String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }

    //Main method
    public static void main(String[] args) {
        String filename = "D:\\Capgemini Notes\\testfile.txt";
        String content = "Hello, World!";

        try {
            writeToFile(filename, content);
            System.out.println("File written successfully.");

            String readContent = readFromFile(filename);
            System.out.println("File content: " + readContent);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

