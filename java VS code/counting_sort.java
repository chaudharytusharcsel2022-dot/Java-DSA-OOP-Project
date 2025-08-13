public class counting_sort {

    public static void counting(int ar[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            large = Math.max(large, ar[i]);
        }
     
        int count[]= new int [large+1];
        for (int i = 0; i < count.length; i++) {
           count[ ar[i] ] ++ ;
        }
        int j =0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]  > 0) {
                ar[j] = i;
                j++;
                count[i]--;
            }
        }
    } 


    public static void printar(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int ar[] = { 1,4,1,3,2,4,3,7};
        counting(ar);
        printar(ar);
    }
}
