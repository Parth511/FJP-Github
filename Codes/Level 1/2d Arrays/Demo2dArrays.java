import java.util.*;

public class Demo2dArrays{
public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m = sc.nextInt();
    int[][] mat = new int[n][m];
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            mat[i][j] = sc.nextInt();
        }
    }
    sc.close();
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++)
            System.out.print(mat[i][j] + " ");
        System.out.println("");
    }
    
 }

}