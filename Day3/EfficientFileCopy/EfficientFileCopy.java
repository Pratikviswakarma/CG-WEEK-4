package EfficientFileCopy;



import java.io.*;


public class EfficientFileCopy {
   public static void main(String[] args) {
       String sourceFile = "D:\\Capgemini Notes\\largefile.txt";
       String destinationBuffered = "D:\\Capgemini Notes\\buffered_copy.txt";
       String destinationUnbuffered = "D:\\Capgemini Notes\\unbuffered_copy.txt";




       long bufferedTime = measureExecutionTime(() -> copyFileBuffered(sourceFile, destinationBuffered));
       System.out.println("Buffered Stream Copy Time: " + bufferedTime + " ns");




       long unbufferedTime = measureExecutionTime(() -> copyFileUnbuffered(sourceFile, destinationUnbuffered));
       System.out.println("Unbuffered Stream Copy Time: " + unbufferedTime + " ns");




       if (bufferedTime < unbufferedTime) {
           System.out.println("Buffered Streams are faster!");
       } else {
           System.out.println("Unbuffered Streams took less time (unlikely but possible on small files).");
       }
   }


   // Method to copy a file using Buffered Streams (efficient)
   public static boolean copyFileBuffered(String source, String destination) {
       try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {


           byte[] buffer = new byte[4096];
           int bytesRead;
           while ((bytesRead = bis.read(buffer)) != -1) {
               bos.write(buffer, 0, bytesRead);
           }
           return true;


       } catch (FileNotFoundException e) {
           System.out.println("Error: Source file not found -> " + source);
       } catch (IOException e) {
           System.out.println("Error: Unable to copy file -> " + e.getMessage());
       }
       return false;
   }


   // Method to copy a file using Unbuffered Streams
   public static boolean copyFileUnbuffered(String source, String destination) {
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


   // Utility method to measure execution time
   public static long measureExecutionTime(Runnable task) {
       long startTime = System.nanoTime();
       task.run();
       return System.nanoTime() - startTime;
   }
}
