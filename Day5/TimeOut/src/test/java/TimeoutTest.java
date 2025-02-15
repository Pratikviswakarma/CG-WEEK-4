import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import timeout.TimeOutClass;

import java.util.concurrent.TimeUnit;

public class TimeoutTest {
    @Test
    @Timeout(value= 2,unit= TimeUnit.SECONDS)
    void test(){
        TimeOutClass to=new TimeOutClass();
        to.longRunningTask();
    }
}
