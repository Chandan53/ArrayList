package ArrayList;
import java.util.ArrayList;

public class arraylist6 {
    public static void max(ArrayList<Integer> list1){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=list1.size()-1;i++){
            if(max< list1.get(i)){
                max=list1.get(i);
            }
            

        }
        System.out.println("maximum no in a ArrayList is " + max);
    }
    public static void main(String args[]){
        // finding the Maximun nomber in an element
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(2);
        list1.add(6);
        list1.add(8);
        max(list1);

    }
    
}
