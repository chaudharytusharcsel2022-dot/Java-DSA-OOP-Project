public class find_shortest_path {
    public static float find(String s1) {

        int x =0 , y=0 ;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'E') {
                x++ ;
            }
            else if (s1.charAt(i) == 'W') {
                x--;
            }
            else if (s1.charAt(i) == 'N') {
                y++;
            }
            else if (s1.charAt(i) == 'S') {
                y--;
            }
            
        }
        int X= x*x;
            int Y = y*y;
            return (float) Math.sqrt(X+Y);
    }

    public static void main(String[] args) {
        String s1 = new String("WNEENESENNN") ;
        
        System.out.println(find(s1));
    }
}