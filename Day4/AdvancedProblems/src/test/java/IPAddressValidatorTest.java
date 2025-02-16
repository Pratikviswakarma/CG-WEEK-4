import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import validateipaddress.IPAddressValidator;

public class IPAddressValidatorTest {

    @Test
    void testValidIPAddresses() {
        assertTrue(IPAddressValidator.isValidIPAddress("192.168.1.1"));
        assertTrue(IPAddressValidator.isValidIPAddress("255.255.255.255"));
        assertTrue(IPAddressValidator.isValidIPAddress("0.0.0.0"));
        assertTrue(IPAddressValidator.isValidIPAddress("172.16.254.1"));
    }

    @Test
    void testInvalidIPAddresses() {
        assertFalse(IPAddressValidator.isValidIPAddress("256.256.256.256"));
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1"));
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1.256"));
        assertFalse(IPAddressValidator.isValidIPAddress("192.168..1.1"));
        assertFalse(IPAddressValidator.isValidIPAddress("abc.def.ghi.jkl"));
    }

    @Test
    void testEdgeCases() {
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1.1."));
        assertFalse(IPAddressValidator.isValidIPAddress(".192.168.1.1"));
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1.1.1"));
    }
}

