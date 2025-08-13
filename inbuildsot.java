import java.lang.reflect.Array;
import java.util.*;
public class inbuildsot {

    public static void inbuild(int ar[]) {
  Arrays.sort(ar);
        
    }
    
    public static void printar(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
             System.out.print(ar[i] + " ");
        }
       
    }



    public static void half_array_sort(int ar[]) {
        Arrays.sort(ar ,3,5);
        
    }


    public static void main(String[] args) {
        int ar [] = { 5,6,8,91,34,64,2};
        System.out.print(" array before sorting: ");
        printar(ar);
        /* 
        inbuild(ar);
        System.out.print(" array after sort : ");
        printar(ar);
        */
        System.out.print(" half array sort  : ");    
        half_array_sort(ar);
        printar(ar);


        
    }
}