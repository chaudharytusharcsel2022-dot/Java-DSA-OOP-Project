/*public class bubblesort {

    public static void bubble(int ar[]) {
        for (int i = 0; i < ar.length-1; i++)
         {
            int swap = 0;
            for (int j = 0; j < ar.length-1-i; j++)
             {
                if (ar[j]>ar[j+1]) {
                    int temp = ar[j];
                    ar[j]= ar[j+1];
                    ar[j+1] = temp;
                    swap++;
                }
                
                
            }
            if (swap==0 && i == 0) {
                System.out.println("all are already arranged properly");
                    break;
                   
                }
                else{
                    continue;
                }
        }
        
    }

    public static void show(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5};
        bubble(ar);
        show(ar);  
     }
}*/


public class bubblesort {
    public static void f1(int ar[]) {
        for (int i = 0; i < ar.length-1; i++) {
            int swap =0;
            for (int j = 0; j < ar.length-1-i; j++) {
                if (ar[j]>ar[j+1]) {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                    swap++;
                    }

                }
                if (swap ==0 & i==0) {
                    System.out.println(" already sorted : "+ " ");
                    break;
                }
                else{
                    continue;
                }
        }
    }
    public static void show(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] +" ");
            
        }
        System.out.println();

        
    }

    public static void main(String[] args) {
        int ar[]= { 1,6,8,9,3};
    f1(ar)  ;
   show(ar); }
}
