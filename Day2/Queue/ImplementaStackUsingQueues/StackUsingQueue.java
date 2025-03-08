package Day2.Queue.ImplementaStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;


public class StackUsingQueue {
   //Queue for Stack behaviour
   private Queue<Integer> q1;
   private Queue<Integer> q2;
   public StackUsingQueue() {
       q1 = new LinkedList<>();
       q2 = new LinkedList<>();
   }


   public void push(int x) {
       q1.add(x);
   }


   public int pop() {
       if (q1.isEmpty())
       {
           throw new RuntimeException("Stack is empty!");
       }


       while (q1.size() > 1) {
           q2.add(q1.poll());
       }


       int top = q1.poll();


       // Swap q1 and q2
       Queue<Integer> temp = q1;
       q1 = q2;
       q2 = temp;


       return top;
   }


   public int top()
   {
       if (q1.isEmpty())
       {
           throw new RuntimeException("Stack is empty!");
       }


       while (q1.size() > 1)
       {
           q2.add(q1.poll());
       }


       int top = q1.poll();
       q2.add(top);


       // Swap q1 and q2
       Queue<Integer> t = q1;
       q1 = q2;
       q2 = t;


       return top;
   }


   // Check if the stack is empty
   public boolean isEmpty() {
       return q1.isEmpty();
   }


   public static void main(String[] args) {
       StackUsingQueue stack = new StackUsingQueue();


       // Pushing elements
       stack.push(1);
       stack.push(2);
       stack.push(3);




       System.out.println("Top element: " + stack.top());


       System.out.println("Popped element: " + stack.pop());


       System.out.println("Top element: " + stack.top());
   }
}
