import org.junit.jupiter.api.Test;
import testingcalculator.Calculator;

public class CalculatorTest {
    @Test
    void tadd(){
        Calculator c=new Calculator();
        c.add(20,10);
        c.sub(20,10);
        c.multi(20,10);
        c.divi(10,0);
    }
}
