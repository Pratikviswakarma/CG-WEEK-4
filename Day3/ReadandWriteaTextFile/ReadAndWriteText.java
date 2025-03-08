package ReadandWriteaTextFile;

import java.io.*;


public class ReadAndWriteText {
   //Main method
   public static void main(String[] args) {
       String sourceFile = "D:\\Capgemini Notes\\sourcefile.txt";
       String destinationFile = "D:\\Capgemini Notes\\destinationfile.txt";


       if (copyFile(sourceFile, destinationFile)) {
           System.out.println("File copied successfully!");
       } else {
           System.out.println("File copy failed.");
       }
   }


   // Method to copy file content
   public static boolean copyFile(String source, String destination) {
       try (FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination)) {


           int byteData;
           while ((byteData = fis.read()) != -1) {
               fos.write(byteData);
           }
           return true;


       } catch (FileNotFoundException e) {
           System.out.println("Error: Source file not found -> " + source);
       } catch (IOException e) {
           System.out.println("Error: Unable to copy file -> " + e.getMessage());
       }
       return false;
   }
}
