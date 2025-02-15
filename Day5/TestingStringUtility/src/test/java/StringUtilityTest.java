import org.junit.jupiter.api.Test;
import testingstringutility.StringUtility;

public class StringUtilityTest {
    @Test
    void test(){
        StringUtility su=new StringUtility();
        String str="hello";
        System.out.println("Result is "+su.isPalindromeString(str));
        System.out.println("Result is "+su.reverseString(str));
        System.out.println("Result is "+su.toUpperCaseString(str));

    }
}
