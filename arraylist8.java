package ArrayList;
import java.util.ArrayList;
import java.util.Collections; // it is a package to sort an element

public class arraylist8 {
    public static void main(String args[]){
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(4);
        list1.add(2);
        list1.add(1);
        list1.add(3);
        Collections.sort(list1);
        System.out.println(list1);
    }
    
}
