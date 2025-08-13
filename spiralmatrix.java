public class spiralmatrix {

    public static void spiral_martrix(int matrix[][]) {
        int starting_row =0;
        int ending_row = matrix.length-1;
        int starting_column = 0;
        int ending_column = matrix[0].length-1;
        while (starting_row <= ending_row && starting_column <= ending_column) {
            //top line prints
            for (int j = starting_column; j <= ending_column; j++) {
                System.out.print( matrix[starting_row][j] +" ");
            }

            //right line prints
           for (int i = starting_row+1; i <= ending_row; i++) {
            System.out.print(matrix[i][ending_column]+" ");
           }

           //bottom line prints
           for (int j = ending_column-1 ; j >= starting_column; j--) {
            if (starting_row == ending_row) {
                break;
            }
            System.out.print(matrix[ending_row][j]+" ");
           }

           //left line prints
            for (int i = ending_row-1; i >= starting_row+1; i--) {
                if (starting_column == ending_column) {
                    break; 
                }
                System.out.print(matrix[i][starting_column]+ " ");
            }
            starting_row++;
        ending_row--;
        starting_column++;
        ending_column--;
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int matrix[][]= {{11,36,88,89},
                         {48,55,62,99},
                         {11,52,63,69},
                         {10,25,44,75}};   
              spiral_martrix(matrix);

    }

}
