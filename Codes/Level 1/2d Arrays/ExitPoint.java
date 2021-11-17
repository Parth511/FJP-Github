import java.util.*;

public class ExitPoint {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                mat[i][j] = sc.nextInt();
        }
        
        int currRow = 0, currCol = 0;
        int prevRow = 0, prevCol = 0;
        //direction
        //right->0, down->1, left->2, top->3
        int direction = 0;
        
        //exit can be in any one of the walls.
        while(currRow>=0 && currCol>=0 && currRow<n && currCol<m){
            
            if(mat[currRow][currCol] == 1){
                //change the direction
                direction = (direction + 1)%4;
                
            }
            prevRow = currRow;
            prevCol = currCol;
            if(direction == 0){
                //right
                currCol++;
            }else if(direction == 1){
                //down
                currRow++;
            }else if(direction == 2){
                //left
                currCol--;
            }else{
                //top
                currRow--;
            }
        }
        System.out.print(prevRow + "\n" + prevCol);
        sc.close();
    }

}