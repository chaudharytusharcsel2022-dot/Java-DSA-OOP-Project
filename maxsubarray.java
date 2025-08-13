// KADAANS ALGO FOR FINDING MAX SUBARRAY FROM ARRAY     # NOTE : O(N)
public class maxsubarray {

    public static void kadaans(int ar[]) {
     int currentsum = 0;
     int maxsum = 0;
     for (int i = 0; i < ar.length; i++) {
        
        if (ar[i]>0) {
            i++;
        }
        else{
            System.out.println(" all no are negative");
        break;}
        
     }
     for (int i = 0; i < ar.length; i++) {
        currentsum = currentsum +ar[i];
        if (currentsum <0) {
            currentsum =0;
        }
        maxsum = Math.max(currentsum, maxsum);
     }   System.out.println("our max sub array is:="+maxsum);
    }
    public static void main(String[] args) {
        int ar[] = {-2 ,-3,-4,-1,-2,-1,-5,-3};
        kadaans(ar);
    }
    
}
