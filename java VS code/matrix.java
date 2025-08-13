import java.util.Scanner;

public class matrix {

    public static boolean search(int matrix[][] , int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j]== key){
                System.out.println("exact location of "+ key +"("+ i +" , "+ j + ")" );
            return true;
        }
        }
      }
      System.out.println(" not found in given matrix : ");
      return false ;

    }

    public static void main(String[] args) {
    
       int matrix[][]= new int[3][3];
       int key= 51 ;
       int m = matrix.length;
       int n = matrix[0].length;
       Scanner sc = new Scanner(System.in);
       for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[i][j]= sc.nextInt(); 
        }
       }
       for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
       }
       System.out.println("indexing start from 0 : ");
     search(matrix, key);

    }
}