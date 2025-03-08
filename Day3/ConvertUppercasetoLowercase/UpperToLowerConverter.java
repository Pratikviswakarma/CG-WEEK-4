package ConvertUppercasetoLowercase;



import java.io.*;


public class UpperToLowerConverter {
   public static void main(String[] args) {
       String inputFile = "D:\\Capgemini Notes\\input.txt";
       String outputFile = "D:\\Capgemini Notes\\output.txt";


       // Convert text file content from uppercase to lowercase
       if (convertUppercaseToLowercase(inputFile, outputFile)) {
           System.out.println("File conversion successful! Check " + outputFile);
       } else {
           System.out.println("File conversion failed.");
       }
   }


   // Method to convert uppercase letters to lowercase while reading & writing files
   public static boolean convertUppercaseToLowercase(String inputFile, String outputFile) {
       try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {


           String line;
           while ((line = reader.readLine()) != null) {
               writer.write(line.toLowerCase());
               writer.newLine();
           }
           return true;


       } catch (FileNotFoundException e) {
           System.out.println("Error: Input file not found - " + e.getMessage());
       } catch (IOException e) {
           System.out.println("Error processing the file - " + e.getMessage());
       }
       return false;
   }
}
