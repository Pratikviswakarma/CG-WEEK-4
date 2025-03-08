package Day2.List.RotateElementsinaList;

import java.util.*;

public class RotateElementInList {
    //Method for rotate element of list
    public static void rotateElementOfList(ArrayList<Integer> al,int rotatedBy){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=rotatedBy;i<al.size();i++){
            temp.add(al.get(i));
        }
        for(int i=0;i<rotatedBy;i++){
            temp.add(al.get(i));
        }
        System.out.println(temp);
    }
    //Main method
    public static void main(String[] args) {
      ArrayList<Integer> al=new ArrayList<>();
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      al.add(50);
      int rotatedBy=2;
      rotateElementOfList(al,rotatedBy);
 
 
    }
 }
 
 
