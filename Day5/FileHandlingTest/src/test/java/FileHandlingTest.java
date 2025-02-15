import filehandlingtest.FileHandling;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileHandlingTest {
    @Test
    void test(){
        FileHandling fh=new FileHandling();
        try{
            fh.writeToFile("D:\\Capgemini Notes\\testfile.txt","My Name is pratik");
            System.out.println("Result is "+fh.readFromFile("D:\\Capgemini Notes\\testfile.txt"));
        }catch (IOException ex){
            System.out.println("Exception due to "+ex.getMessage());
        }

    }
}
