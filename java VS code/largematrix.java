import java.util.Scanner;

public class largematrix {

    public static boolean search_location(int matrix [][] , int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                 if (matrix[i][j] == key){
                    System.out.println(" the exact location of " + key + "is" +"("+ i+","+j+ ")" );
                    return true;
                 }
            }
        }
        return false;
    }


    public static int find_max(int matrix[][]) {
        int max =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
            max = Math.max(max, matrix[i][j]) ;
                    
            }
          
      }  System.out.println("Maximum value in matrix is: "+max  );
      return max;
       
      
       
    }

    public static void printmatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix [][] = new int [3][3];
        int m = matrix.length ;
        int n  =  matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               matrix[i][j] =  sc.nextInt();
            }
        }
        System.out.println(" The Matrix You Provide is : ");
        printmatrix(matrix); //matrix
       int max =  find_max(matrix); // key 
        search_location( matrix, max);
       
     
     }
}
