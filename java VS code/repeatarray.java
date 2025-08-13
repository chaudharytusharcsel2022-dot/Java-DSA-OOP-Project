public class repeatarray {
    public static boolean f1(int ar[]) {
    for (int i = 0; i < ar.length; i++) {
        for (int j = i+1; j < ar.length; j++) {
            if (ar[i] == ar[j])
             {
                return true;          
            }
           
        }
        
    }
    return false;
         
    }

    public static void main(String[] args) {
        int ar[] = {5,6,48,5,24,55,8};
         System.out.println(f1(ar));
    }
}