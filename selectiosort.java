public class selectiosort {
    public static void selection_sort(int ar[]) {
        for (int i = 0; i < ar.length-1; i++)  {
            int smallest = i;
            for (int j = i+1; j < ar.length; j++) {
                if (ar[j]<ar[smallest]) {
                    smallest = j;                
                }
            }
            //swap
            int temp = ar[smallest];
            ar[smallest] = ar[i];
            ar[i] = temp;
        }
    }
    public static void printar(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] +" ");
        }
        
    }

    public static void main(String[] args) {
        int ar[]= {59,4,41,39,2};
        selection_sort(ar);
        printar(ar);


    }
}