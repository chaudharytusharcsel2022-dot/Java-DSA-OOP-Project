/* public class subarray {
         public static void f1(int ar[] ) {
            for (int i = 0; i < ar.length; i++) {
                int first = i;
                for (int j = i; j < ar.length; j++) {
                    int last = j;
                    for (int k = first; k <=last; k++) {
                        System.out.print("subarray is : = "+ ar[k] +" "); 
                        
                    }
                 System.out.println();   
                }
         System.out.println();   }
         }


    public static void main(String[] args) {
        int ar[] = {100,48,81,56};
        f1(ar);
    }
}*/




public class subarray {

    public static void f1(int ar[] ) {
        for (int i = 0; i < ar.length; i++) {
            int start = i;
            for (int j = i; j < ar.length; j++) {
                int last = j;
                for (int k = start; k <last; k++) {
                    System.out.print(ar[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int ar [] = {10,5,59,484,3,13,13,48};
        f1(ar);
    }
}