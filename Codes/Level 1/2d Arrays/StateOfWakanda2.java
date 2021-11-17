import java.util.*;

public class StateOfWakanda2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                mat[i][j] = sc.nextInt();
        }
        
        for(int gap=0; gap<n; gap++){
            for(int i=0; i+gap<n; i++)
                System.out.println(mat[i][i+gap]);
        }
        sc.close();
    }

}