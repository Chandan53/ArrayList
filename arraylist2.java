package ArrayList;
import java .util.ArrayList;

public class arraylist2 {
    public static void main(String args[]){
        // using Operration
        ArrayList<Integer> list1=new ArrayList<>();
        // add Operation
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        System.out.println(list1);


        // get Operation--> provide the index number
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        System.out.println(list1.get(3));
        System.out.println(list1.get(4));
    }
    
}
