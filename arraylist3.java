package ArrayList;
import java.util.ArrayList;

public class arraylist3 {
    public static void main(String args[]){
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("before "+ list1);

        // remove element
        list1.remove(2); // removing the index number
        list1.remove(0);
        System.out.println("after remove " + list1);

        // set element at specific index
        list1.set(0,5);
        list1.set(1,6);
        System.out.println("set element at specific point " + list1);

        // contains element --> is  specific element present in the list or not check

        System.out.println(list1.contains(5));
        System.out.println(list1.contains(2));
    }
    
}
