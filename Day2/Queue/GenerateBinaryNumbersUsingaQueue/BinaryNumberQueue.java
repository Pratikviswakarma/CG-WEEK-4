package Day2.Queue.GenerateBinaryNumbersUsingaQueue;



import java.util.LinkedList;
import java.util.Queue;


public class BinaryNumberQueue {
   //Method for Generate Binary Numbers
   public static void binaryNumberUsingQueue(){
       Queue<String> que=new LinkedList<>();
       for(int i=1;i<=5;i++){
           que.add(Integer.toBinaryString(i));
       }
       System.out.println(que);
   }
   //Main method
   public static void main(String[] args) {
       binaryNumberUsingQueue();
   }
}

