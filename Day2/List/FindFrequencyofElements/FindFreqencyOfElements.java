package Day2.List.FindFrequencyofElements;

import java.util.*;
public class FindFreqencyOfElements {
    //Method for frequency count of element
    public static void frequencyOfElement(ArrayList<String> al){
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i< al.size();i++){
            if(map.containsKey(al.get(i))){
                map.put(al.get(i),map.getOrDefault(al.get(i),0)+1);
            }else{
                map.put(al.get(i),1 );
            }
        }
        System.out.println(map);
    }
 
 
    //Main Method
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Apple");
        al.add("Banana");
        al.add("Apple");
        al.add(("Orange"));
        frequencyOfElement(al);
    }
 }
 