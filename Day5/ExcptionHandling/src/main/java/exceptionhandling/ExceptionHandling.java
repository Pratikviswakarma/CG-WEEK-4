package exceptionhandling;

public class ExceptionHandling {
    //Divide method
    public static void divide(int a,int b){
        try{
            System.out.println("Division result is "+(a/b));
        }catch (ArithmeticException ex){
            System.out.println("Exception due to "+ex.getMessage());
        }
    }
    //Main method
    public static void main(String[] args) {
        divide(10,0);
    }
}
