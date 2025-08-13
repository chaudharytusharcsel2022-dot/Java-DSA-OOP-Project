import java.util.*;
public class largestinarray {
   public static int f1(int ar[]) {
    
    int minfi = Integer.MIN_VALUE;
     for (int i = 0; i < ar.length; i++) {
            if (minfi<ar[i]) {
                minfi = ar[i];
                
            }
         }

        return minfi; 
          }



    public static void main(String[] args) {
        
        int ar[] ={10,54,84,9,2,345,8000,45,485};
                     //-infinity
      int res = f1( ar);
      System.out.println(res);
    }
}
