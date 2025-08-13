public class pairarray {
    public static void f1(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                System.out.print("(" +ar[i] +" ,  " + ar[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int ar[] = {45,9,31,59,14,32,49};
       f1(ar);
    } 
}
