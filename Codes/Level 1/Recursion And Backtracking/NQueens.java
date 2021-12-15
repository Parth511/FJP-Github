import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                chess[i][j] = 0;
            }
        }
        printNQueens(chess, "", 0);
    }

    public static boolean isSafe(int[][] chess, int row, int col){
        int n = chess.length;
        for(int i=0; i<n; i++)
            if(chess[i][col] == 1)
                return false;
        
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(chess[i][j] == 1)
                return false;
        }

        for(int i=row, j=col; i>=0 && j<n; i--, j++){
            if(chess[i][j] == 1)
                return false;
        }

        return true;
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row == chess.length){
            System.out.println(qsf + ".");
            return;
        }

        for(int i=0; i<chess.length; i++){
            if(isSafe(chess, row, i)){
                chess[row][i] = 1;
                printNQueens(chess, qsf + row + "-" + i + ", ", row + 1);
                chess[row][i] = 0;
            }            
        }
    }
}