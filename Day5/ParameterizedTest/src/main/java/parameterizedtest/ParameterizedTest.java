package parameterizedtest;

public class ParameterizedTest {
    //Even Checker method
    public static boolean isEven(int number){
        return number%2==0;
    }
    //Main method
    public static void main(String[] args) {
        System.out.println("Given number is Even "+isEven(2));
    }
}
