import java.util.*;
public class Stair_case_Search {

    public static void stair_search(int matrix[][] ,int key) {
        
        int row = 0;
        int column = matrix[0].length-1;

        while (   row < matrix.length   &&  column >= 0   ) {
            if (key == matrix[row][column]) {
                System.out.println("Key Found at : "+"("+ row + ","+column+")");
             
                return;}
        
            else if (key > matrix[row][column]) {
                row++;
            }
            else {
                column--;
            } 
           
        }
        System.out.println("not exist sorry");
       
    }






     public static void stair_search2(int matrix[][] ,int key) {
        
        int row = matrix.length-1;
        int column = 0;

        while (   row >=0   &&  column < matrix[0].length-1  ) {
            if (key == matrix[row][column]) {
                System.out.println("Key Found at : "+"("+ row + ","+column+")");
             
                return;}
        
            else if (key > matrix[row][column]) {
                column++;
            }
            else {
                row--;
            } 
           
        }
        System.out.println("not exist sorry");
       
    }

    public static void main(String[] args) {
        int matrix[][]={ {10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50} };
                         System.out.println(matrix[0].length);
                         System.out.println("length of matrix is : "+matrix.length);
        System.out.println("enter key: ");
        Scanner sc = new Scanner(System.in);
       int key = sc.nextInt();
                        
       System.out.println("key : "+key);
       stair_search2(matrix, key);
       
    
                        }
}