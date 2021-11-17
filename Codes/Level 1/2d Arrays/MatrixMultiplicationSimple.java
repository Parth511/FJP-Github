import java.util.*;

public class MatrixMultiplicationSimple {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), m1 = sc.nextInt();
        int[][] mat1 = new int[n1][m1];
        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++)
                mat1[i][j] = sc.nextInt();
        }
        int n2 = sc.nextInt(), m2 = sc.nextInt();
        int[][] mat2 = new int[n2][m2];
        for(int i=0; i<n2; i++){
            for(int j=0; j<m2; j++)
                mat2[i][j] = sc.nextInt();
        }
        sc.close();
        if(m1 != n2){
            System.out.println("Invalid input");
            return;
        }
        
        int[][] ans = new int[n1][m2];
        
        for(int i=0; i<n1; i++){
            for(int j=0; j<m2; j++){
                ans[i][j] = 0;
                for(int k=0; k<m1; k++)
                    ans[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
        
        for(int i=0; i<n1; i++){
            for(int j=0; j<m2; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
