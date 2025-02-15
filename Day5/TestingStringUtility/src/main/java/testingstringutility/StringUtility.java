package testingstringutility;

public class StringUtility {

   //Reverse method
  public static String reverseString(String str){
      return new StringBuilder(str).reverse().toString();
  }

    //isPalindrome method
    public static boolean isPalindromeString(String str){
        return new StringBuilder(str).reverse().toString()==str;
    }

    //toUpperCase method
    public static String toUpperCaseString(String str){
        return str.toUpperCase();
    }

    //Main method
    public static void main(String[] args) {
        String str="hello";
        System.out.println("Result is "+isPalindromeString(str));
        System.out.println("Result is "+reverseString(str));
        System.out.println("Result is "+toUpperCaseString(str));
    }
}
