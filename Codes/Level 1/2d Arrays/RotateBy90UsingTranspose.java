import java.util.*;

public class RotateBy90UsingTranspose {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                mat[i][j] = sc.nextInt();
        }
        
        // transpose
        Transpose(mat);
        
        //reverse rows or use the swap columns below, don't use both at once
        //swap rows function call
        reverseRows(mat,n);
        
        //swap columns function call
        //swapColumns(mat);
        
        //print
        display(mat);

        sc.close();
    }
    
    //swap rows
    public static void reverseRows(int[][] mat, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
    }
    
    //overloaded swap operator
    public static void swap(int[][] arr, int i, int leftcol, int rightCol){
        int temp = arr[i][leftcol];
        arr[i][leftcol] = arr[i][rightCol];
        arr[i][rightCol] = temp;
    }
    
    public static void swapColumns(int[][] arr){
        int leftCol = 0, rightCol = arr[0].length - 1;
        while(leftCol < rightCol){
            for(int i=0; i<arr.length; i++){
                swap(arr, i, leftCol, rightCol);
            }
            leftCol++;
            rightCol--;
        }
    }
    
    public static void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    
    public static void Transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[i].length; j++){
                swap(arr,i,j);
            }
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}