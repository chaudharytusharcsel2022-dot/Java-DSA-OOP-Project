import java.util.*;
public class substring {

    public static String sub_string(String s1 , int start, int end)
     {
        String result = " ";
        for (int i = start ; i < end  ; i++) {
            result += s1.charAt(i);
        }
        return result;
    }

    public static String printst(String x ) {
        String last_final = " ";
        for (int i = 0; i < x.length(); i++) {
            last_final +=  x.charAt(i);

          //  System.out.print("result of substring is : " + last_final);
            
         }
    return last_final;}
    public static void main(String[] args) {
        String s1 = new String("HELLO_WORLD");
      /*   Scanner sc = new Scanner(System.in);
         System.out.println("enter starting index");
        int start = sc.nextInt();
        System.out.println("enter ending index");
       int end = sc.nextInt();
      String x= sub_string(s1 , start ,end );
      System.out.println(printst(x));  */
     System.out.println(sub_string(s1 , 2 , 8));

    }
}