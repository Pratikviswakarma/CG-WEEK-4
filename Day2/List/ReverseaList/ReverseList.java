package Day2.List.ReverseaList;



import java.util.ArrayList;


public class ReverseList {
   //Method for reverse list
   public static void reverseList(ArrayList<Integer> al){
       ArrayList<Integer> al2=new ArrayList<>();
       for(int i=al.size()-1;i>=0;i--){
           al2.add(al.get(i));
       }
       for(int ele: al2){
           System.out.println(ele);
       }
   }
   //main method
   public static void main(String[] args) {
       ArrayList<Integer> al=new ArrayList<>();
       al.add(10);
       al.add(20);
       al.add(30);
       al.add(40);
       al.add(50);
       reverseList(al);
   }
}

