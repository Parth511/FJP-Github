import java.util.*;

public class SpiralDisplay {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                mat[i][j] = sc.nextInt();
        }
        sc.close();
        int fRow = 0, lRow = n-1, fCol = 0, lCol = m-1; //limits for current spiral.
        int count = 0;
        
        while(count<n*m){
            // left wall from top to bottom
            for(int i = fRow; i <= lRow; i++){
                System.out.println(mat[i][fCol]);
                count++;
                if(count == n*m)    return;
            }
            fCol++;
            //bottom wall from left to right
            for(int j = fCol; j <= lCol; j++){
                System.out.println(mat[lRow][j]);
                count++;
                if(count == n*m)    return;
            }
            lRow--;
            //right wall from bottom to top
            for(int i = lRow; i >= fRow; i--){
                System.out.println(mat[i][lCol]);
                count++;
                if(count == n*m)    return;
            }
            lCol--;
            //top wall from right to left
            for(int j = lCol; j >= fCol; j--){
                System.out.println(mat[fRow][j]);
                count++;
                if(count == n*m)    return;
            }
            fRow++;
        }
    }

}