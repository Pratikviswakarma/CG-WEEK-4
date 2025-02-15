import exceptionhandling.ExceptionHandling;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {
    @Test
    void test(){
        ExceptionHandling eh=new ExceptionHandling();
        eh.divide(10,0);
    }
}
