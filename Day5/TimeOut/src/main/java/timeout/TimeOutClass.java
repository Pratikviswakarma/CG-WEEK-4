package timeout;

public class TimeOutClass {
    //Long running method
    public static void longRunningTask(){
       StringBuffer sb=new StringBuffer();
       for(int i=0;i<1000000000;i++){
           sb.append("");
       }
    }
    //Main method
    public static void main(String[] args) {
        longRunningTask();
    }
}
