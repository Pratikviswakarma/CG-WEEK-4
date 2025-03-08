package Day2.List.RemoveDuplicatesWhilePreservingOrder;

import java.util.*;

public class RemoveDuplicates {
    //Method for remove duplicates
    public static void set(ArrayList<Integer> al){
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        for(int i=0;i<al.size();i++){
           lhs.add(al.get(i));
        }
        System.out.println(lhs);
    }
    //Main method
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(3);
        al.add(1);
        al.add(2);
        al.add(2);
        al.add(3);
        al.add(4);
        set(al);
    }
 }
 
