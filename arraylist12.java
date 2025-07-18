package ArrayList;
import java.util.ArrayList;
// time complexity --> 0(n)

public class arraylist12 {
    public static int storewater(ArrayList<Integer>height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int he=Math.min(height.get(lp), height.get(rp));
            int w=rp-lp;
            int curr = w*he;
            maxwater=Math.max(maxwater,curr);

            if(height.get(lp)< height.get(rp)){
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storewater(height));
    }
    
}
