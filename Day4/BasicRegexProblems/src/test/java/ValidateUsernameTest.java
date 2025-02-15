import basicregexproblems.ValidateUsername;
import org.junit.jupiter.api.Test;

public class ValidateUsernameTest {
    @Test
    void test(){
        ValidateUsername us=new ValidateUsername();
        us.isValidUsername("user_123");
    }
}
