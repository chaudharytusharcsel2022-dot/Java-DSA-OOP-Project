import java.util.*;
public class reversearrays {

    public static void printar(Integer ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] +" ");
        }
        
    }
    public static void main(String[] args) {
        Integer ar[] = {15,54,6,13,8,6};
        Arrays.sort(ar,Collections.reverseOrder());
      printar(ar);
    }
}