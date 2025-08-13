public class index {

    public static int f1(int ar[], int x) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] ==x ) {
                return i;
                
            }
          
          
           
            }  return-1;
            
         }
    
    public static void main(String[] args) {
        int ar[] = {10,20,30,40,52};
        int x = 512;
        int index = f1( ar,  x);

        if (index == -1) {
            System.out.println("it is not present in array ");
        }
        else{
            System.out.println("the index of "+ x + "is"+ index);
        }

         

    }
    
}
