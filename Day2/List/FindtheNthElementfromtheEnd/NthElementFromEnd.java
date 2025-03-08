package Day2.List.FindtheNthElementfromtheEnd;

import java.util.Collections;
import java.util.LinkedList;

public class NthElementFromEnd {
  //Method for Find Nth element form End
   public static void nthElement(LinkedList<Character> ll,int n){
          Collections.reverse(ll);
          System.out.println(ll.get(n-1));
   } 
   //Main method
   public static void main(String[] args) {
       LinkedList<Character> ll=new LinkedList<>();
       ll.add('A');
       ll.add('B');
       ll.add('C');
       ll.add('D');
       ll.add('E');
       nthElement(ll,2);
   }
}
