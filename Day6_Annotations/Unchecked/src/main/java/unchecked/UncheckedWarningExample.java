package unchecked;

import java.util.ArrayList;

public class UncheckedWarningExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add(100);

        // Retrieving elements without type safety
        String str = (String) rawList.get(0);
        Integer num = (Integer) rawList.get(1);

        System.out.println("String value: " + str);
        System.out.println("Integer value: " + num);
    }
}

