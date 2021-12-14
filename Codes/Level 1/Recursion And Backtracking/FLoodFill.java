import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                visited[i][j]=false;
        }
        floodfill(arr, 0, 0, "", visited);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf,boolean[][] visited) {
        int dr = maze.length - 1, dc = maze[0].length - 1;
        if(sr > dr || sc > dc || sr < 0 || sc < 0 || maze[sr][sc]==1 || visited[sr][sc] == true){
            //negative base case
            return;
        }

        if(sr == dr && sc == dc){
            System.out.println(asf);
            return;
        }
            
        visited[sr][sc]=true;
        floodfill(maze, sr - 1, sc, asf + "t", visited);
        floodfill(maze, sr, sc - 1, asf + "l", visited);
        floodfill(maze, sr + 1, sc, asf + "d", visited);
        floodfill(maze, sr, sc + 1, asf + "r", visited);
        visited[sr][sc]=false;
    }
}
