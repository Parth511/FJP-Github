import java.util.*;

public class SaddlePoint {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = n;
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                mat[i][j] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<mat.length; i++){
            //find minium of ith row
            int minCol = 0;
            for(int j=0; j<mat[0].length; j++)
                minCol = mat[i][j] < mat[i][minCol] ? j : minCol;
            
            //now check if this minCol value is also maximum in it's column also
            int maxRow = 0;
            for(int k=0; k<mat.length; k++)
                maxRow = mat[k][minCol] > mat[maxRow][minCol] ? k : maxRow;
            
            //min in Row -> maxinCol is also true
            if(maxRow == i){
                System.out.println(mat[maxRow][minCol]);
                return;
            }    
        }
        System.out.println("Invalid input");
    }
}
