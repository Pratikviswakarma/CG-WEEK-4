package ConvertImagetoByteArray;

import java.io.*;
import java.nio.file.Files;


public class ImageByteArrayConverter {
   public static void main(String[] args) {
       String sourceImage = "D:\\Capgemini Notes\\input.jpg";
       String destinationImage = "D:\\Capgemini Notes\\output.jpg";


       // Convert image to byte array
       byte[] imageData = convertImageToByteArray(sourceImage);
       if (imageData != null) {
           System.out.println("Image successfully converted to byte array.");
       } else {
           System.out.println("Failed to convert image.");
           return;
       }


       // Convert byte array back to image
       if (writeByteArrayToImage(imageData, destinationImage)) {
           System.out.println("Image successfully written to " + destinationImage);
       } else {
           System.out.println("Failed to write image.");
       }


       // Verify if both images are identical
       if (compareFiles(sourceImage, destinationImage)) {
           System.out.println("Verification successful: The output image is identical to the original.");
       } else {
           System.out.println("Verification failed: The output image differs from the original.");
       }
   }


   // Method to convert an image file into a byte array
   public static byte[] convertImageToByteArray(String imagePath) {
       try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
            FileInputStream fis = new FileInputStream(imagePath)) {


           byte[] buffer = new byte[4096]; // 4KB buffer
           int bytesRead;
           while ((bytesRead = fis.read(buffer)) != -1) {
               baos.write(buffer, 0, bytesRead);
           }
           return baos.toByteArray();


       } catch (IOException e) {
           System.out.println("Error reading image: " + e.getMessage());
           return null;
       }
   }


   // Method to write a byte array back to an image file
   public static boolean writeByteArrayToImage(byte[] data, String outputPath) {
       if (data == null) return false;


       try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
            FileOutputStream fos = new FileOutputStream(outputPath)) {


           byte[] buffer = new byte[4096]; // 4KB buffer
           int bytesRead;
           while ((bytesRead = bais.read(buffer)) != -1) {
               fos.write(buffer, 0, bytesRead);
           }
           return true;


       } catch (IOException e) {
           System.out.println("Error writing image: " + e.getMessage());
           return false;
       }
   }


   // Method to compare two files (verify that they are identical)
   public static boolean compareFiles(String file1, String file2) {
       try {
           byte[] file1Data = Files.readAllBytes(new File(file1).toPath());
           byte[] file2Data = Files.readAllBytes(new File(file2).toPath());
           return java.util.Arrays.equals(file1Data, file2Data);
       } catch (IOException e) {
           System.out.println("Error comparing files: " + e.getMessage());
           return false;
       }
   }
}

