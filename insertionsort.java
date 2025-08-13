public class insertionsort {
    
    public static void insertion_sort(int ar[]) {
        for (int i = 1; i < ar.length; i++) {
            int current = ar[i];
            int previous  = i-1;
            while (  previous>=0   && ar[previous]  >  current) {
                ar[previous+1] = ar[previous];
                previous--;
                
            }
            ar[previous+1] = current;
        }
    }


    public static void printar(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args) {
        int ar [] = { 5,4,1,3,2};
        insertion_sort(ar);
        printar(ar);
    }
}
