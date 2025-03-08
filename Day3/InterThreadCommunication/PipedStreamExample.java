package InterThreadCommunication;



import java.io.*;


class WriterThread extends Thread {
   private PipedOutputStream pos;


   public WriterThread(PipedOutputStream pos) {
       this.pos = pos;
   }


   @Override
   public void run() {
       try {
           String message = "Hello from WriterThread!";
           System.out.println("WriterThread: Writing data...");
           pos.write(message.getBytes());
           pos.close();
       } catch (IOException e) {
           System.out.println("WriterThread Error: " + e.getMessage());
       }
   }
}


class ReaderThread extends Thread {
   private PipedInputStream pis;


   public ReaderThread(PipedInputStream pis) {
       this.pis = pis;
   }


   @Override
   public void run() {
       try {
           System.out.println("ReaderThread: Waiting for data...");
           byte[] buffer = new byte[1024];
           int bytesRead = pis.read(buffer);
           System.out.println("ReaderThread: Received - " + new String(buffer, 0, bytesRead));
           pis.close();
       } catch (IOException e) {
           System.out.println("ReaderThread Error: " + e.getMessage());
       }
   }
}


public class PipedStreamExample {
   public static void main(String[] args) {
       try {
           PipedOutputStream pos = new PipedOutputStream();
           PipedInputStream pis = new PipedInputStream(pos);


           // Create and start threads
           WriterThread writer = new WriterThread(pos);
           ReaderThread reader = new ReaderThread(pis);


           writer.start();
           reader.start();


           // Wait for threads to complete
           writer.join();
           reader.join();


           System.out.println("Communication between threads completed.");
       } catch (IOException | InterruptedException e) {
           System.out.println("Main Thread Error: " + e.getMessage());
       }
   }
}
