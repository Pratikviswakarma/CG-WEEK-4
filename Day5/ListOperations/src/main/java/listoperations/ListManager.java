package listoperations;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
    //Add Element
    public static void addElement(List<Integer> list,int element){
        list=new ArrayList<>();
        list.add(element);
        System.out.println("Element are added ");
    }
    //Remove Element
    public static void removeElement(List<Integer> list,int element){
        list=new ArrayList<>();
        Integer ele=element;
        list.remove(ele);
        System.out.println("Element are removed ");
    }

    //Get Size
    public static int getSize(List<Integer> list){
        return list.size();
    }
    //Main method
    public static void main(String[] args) {
       List<Integer> list=new ArrayList<>();
       list.add(10);
       list.add(20);
       list.add(30);
       addElement(list,40);
       removeElement(list,10);
       System.out.println("Size of list is "+getSize(list));
    }
}
