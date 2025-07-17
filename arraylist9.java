package ArrayList;
import java.util.*;

public class arraylist9 {
    public static void main(String args[]){
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        list1.add(5);
        list1.add(1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
    }
    
}
