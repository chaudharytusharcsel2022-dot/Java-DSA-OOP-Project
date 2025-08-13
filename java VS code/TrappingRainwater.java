/*public class TrappingRainwater {
    public static int rainwatertrapping(int ar[]) {
        
        int leftmax [] = new int[ar.length];
        leftmax[0]= ar[0];
        for (int i = 1; i < ar.length; i++) {
            leftmax[i]= Math.max(ar[i], leftmax[i-1]);

        }

        int rightmax[] = new int[ar.length];
        rightmax[ar.length-1] =ar[ar.length-1]; 
        for (int i = ar.length-2;  i >= 0; i--) {
            rightmax[i]= Math.max(ar[i], rightmax[i+1]);

        }
        int trapwater = 0;
        for (int i = 0; i <  ar.length; i++) {
            int waterlevel = Math.min(rightmax[i], leftmax[i]);
            trapwater += waterlevel - ar[i];


        }
        return trapwater;

    }

    public static void main(String[] args) {
        int ar[] = {4,2,0,6,3,2,5};
      System.out.println("the trapped water is : "+rainwatertrapping(ar));  
      
    }


} */

public class TrappingRainwater {

    public static int trapedwater(int ar[]) {
       int n=  ar.length ;
      
        //left max
        int left_max[]= new int [n];
        left_max[0] = ar[0];
       
        for (int i = 1; i < n; i++) {
            left_max[i] =Math.max(left_max[i-1], ar[i]);
            
        }


        //right max 
        int right_max[] = new int [n];
        right_max[n-1] = ar[n-1];
      
        for (int i = n-2 ; i >=0 ; i--) {
            right_max[i] = Math.max(ar[i], right_max[i+1]);

        }
   
        //max( rightmax , leftmax )
           int trap =0;
        for (int i = 0; i <ar.length; i++) {
        int waterlevel   =     Math.min(left_max[i] , right_max[i]);
       
        //waerlevel -current height if 
          
        trap += waterlevel - ar[i];
        


        }
        return  trap;
    }


    public static void main(String[] args) {
        int ar[]= { 4,2,0,6,3,2,5};
   
    System.out.println(trapedwater(ar));
    }
}