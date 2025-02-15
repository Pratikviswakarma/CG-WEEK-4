import listoperations.ListManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    @Test
    void test(){
        ListManager lm=new ListManager();
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        lm.addElement(list,40);
        lm.removeElement(list,10);
        System.out.println("Size of list is "+lm.getSize(list));

    }
}
