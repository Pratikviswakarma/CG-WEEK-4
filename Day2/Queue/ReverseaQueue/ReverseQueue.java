package Day2.Queue.ReverseaQueue;



import java.util.*;


public class ReverseQueue {
   //Method for reverse a Queue
   public static void reverseQueue(Queue<Integer> pq){
       Stack<Integer> st=new Stack<>();
       for(int ele:pq){
           st.push(ele);
       }
       pq.removeAll(pq);
       while (!st.isEmpty()){
           pq.add(st.pop());
       }
       System.out.println(pq);
   }
   //Main method
   public static void main(String[] args) {
       Queue<Integer> ql=new LinkedList<>();
       ql.add(10);
       ql.add(20);
       ql.add(30);
       reverseQueue(ql);
   }
}

