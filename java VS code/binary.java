




public class binary {
              public static int f1(int ar[] , int key) {
               int first =0;
               int last =ar.length-1; 
               while (first<=last) {
                int mid = (first + last) /2;

                if (ar[mid] ==key) {
                    return mid;
                }
               if (ar[mid]>key) { 
                last = mid-1;
               }
               else{
                first = mid+1;
               }
               }
               return-1;
              }

    public static void main(String[] args) {
        int ar[]={45,54,64,81,88,91,93};
        int key =888;
        f1(ar, key);
        System.out.println("index of searched item is "  + f1(ar, key) ) ;
    }
}
