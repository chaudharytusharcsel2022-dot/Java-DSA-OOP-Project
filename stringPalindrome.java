public class stringPalindrome {
    public static boolean palindrome(String s1) {
         for (int i = 0 ; i < s1.length()/2 ; i++) {
            if ( s1.charAt(i) != s1. charAt(s1.length()-1-i)) {
                return false;
            }
          } return true; 
    }
          

    public static void printst(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String s1 =new String(" noom ");
       System.out.println(palindrome(s1)) ;
       // printst(s1);


    }
}