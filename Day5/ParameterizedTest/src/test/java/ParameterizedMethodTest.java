package parameterizedtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestExample {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10}) // Test cases
    void testIsEvenWithEvenNumbers(int number) {
        assertTrue(ParameterizedTest.isEven(number), "Number should be even: " + number);
    }

    @Test
    void test(){
        ParameterizedTest pt=new ParameterizedTest();
        System.out.println("Number is "+ pt.isEven(2));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9}) // Test cases
    void testIsEvenWithOddNumbers(int number) {
        assertFalse(ParameterizedTest.isEven(number), "Number should be odd: " + number);
    }
}

