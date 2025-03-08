package ReadaLargeFileLinebyLine;
import java.io.*;


public class LargeFileReader {
   public static void main(String[] args) {
       String filePath = "D:\\Capgemini Notes\\large_log.txt";
       String keyword = "error"; //


       System.out.println("Searching for lines containing \"" + keyword + "\" in " + filePath);
       readLargeFile(filePath, keyword);
   }


   // Method to read a large file line by line and filter lines with "error"
   public static void readLargeFile(String filePath, String keyword) {
       try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
           String line;
           int lineNumber = 0;


           while ((line = reader.readLine()) != null) {
               lineNumber++;
               if (line.toLowerCase().contains(keyword.toLowerCase())) {
                   System.out.println("Line " + lineNumber + ": " + line);
               }
           }


       } catch (FileNotFoundException e) {
           System.out.println("Error: File not found - " + e.getMessage());
       } catch (IOException e) {
           System.out.println("Error reading file - " + e.getMessage());
       }
   }
}
