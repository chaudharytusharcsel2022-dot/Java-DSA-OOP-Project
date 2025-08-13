/*public class reversearray {

    public static void f1(int ar[]) {
         int first = 0;
        int last = ar.length-1;
        int temp =0;
        while (first < last ) {
            temp = ar[first] ;
          ar [ first ]= ar[last] ;
           ar[ last] = temp;
           first++;
           last--;
        }
        
    }
    public static void main(String[] args) {
        int ar[]= { 10,20,30,40,50,61,200};
       f1(ar);
            for (int i = 0; i < ar.length; i++) {
                System.out.print(ar[i]+ " ");
            }
            System.out.println();
        }


    }

*/



public class reversearray {
           
    public static void f1(int ar[]) {

        int start = 0;
        int last = ar.length-1;
       int  temp = 0;
       while (start <last) {
        temp = ar[last];
        ar[last] = ar[start];
        ar[start] = temp;
        start ++;
        last --;
                
       }

        
    }
    public static void main(String[] args) {
        int ar[] ={87, 95,15,35,48,38,74,6,1};
        f1( ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}