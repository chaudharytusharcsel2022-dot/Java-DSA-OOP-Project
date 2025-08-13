public class sorting {



public static void bubble_sort(int ar[]) {
  int n =   ar.length ;
    for (int i = 0; i <  n-2; i++) {
        for (int j = 0; j < n-1-i; j++) {
            if (ar[j]> ar[j+1]) {
             int temp = ar[j];
             ar[j] = ar[j+1];
             ar[j+1] = temp;
             
            }
        }
    } 
}
            
      



       public static void selection(int ar[]) {
        for (int i = 0; i < ar.length-1; i++) {
            int small = i ;
            for (int j = i+1; j < ar.length; j++) {
               if (ar[small] > ar[j]) {
                small = j;

               } 
            }
            int temp = ar[small];
            ar[small] = ar[i];
            ar[i] = temp;
        }
       }






     public static void insertion_sort(int ar[]) {
        for (int i = 1; i < ar.length; i++) {
            int current = i;
            int previous = i-1;
            while (  previous>=0 && ar[current]  < ar[previous]  ) {
                ar[previous+1] = ar[previous];
                previous--;
            }
            ar[previous+1] = current;
        }
     }  



     

      public static void prints(int ar[]) {
                for (int i = 0; i < ar.length; i++) {
                    System.out.print(ar[i] + " ");

                    
           }
       }



       public static void counting_sort(int ar[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            large = Math.max(large , ar[i]);
        }

        int count[] = new int[large+1];
        for (int i = 0; i < count.length; i++) {
           count[ ar[i] ]++;
            
        }

         int j  =0;
         for (int i = 0; i < count.length; i++) {
            while (count[i]>0 ) {
                ar[j] = i;
                j++;
                count[i]--;
            }
         }


       }



    public static void main(String[] args) {
        int ar[] = {1,4,1,3,2,4,3,7};
        System.out.println(ar.length);
       // bubble_sort(ar);
        //selection_sort(ar);
       // selection(ar);
       // insertion_sort(ar);
       counting_sort(ar); 
       prints(ar);
    }
}


