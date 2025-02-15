package testingcalculator;

public class Calculator {
    //Add method
    public static void add(int a,int b){
        System.out.println("Addition result is "+(a+b));
    }

    //Sub method
    public static void sub(int a,int b){
        System.out.println("Subtraction result is "+(a-b));
    }

    //Multi method
    public static void multi(int a,int b){
        System.out.println("Multiplication result is "+(a*b));
    }

    //Division method
    public static void divi(int a,int b){
        try {
            System.out.println("Multiplication result is " + (a / b));
        }catch (Exception ex){
            System.out.println("Cannot divide by zero");
        }
    }

    //Main method
    public static void main(String[] args) {
        add(20,10);
        sub(20,10);
        multi(20,10);
        divi(10,0);
    }
}
