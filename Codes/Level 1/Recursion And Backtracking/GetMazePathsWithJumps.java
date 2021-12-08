import java.util.*;

public class GetMazePathsWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        ArrayList<String> ans = getMazePaths(0, 0, m-1, n-1);
        System.out.println(ans);
        sc.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
         }
        // else if(;sr>dr || sc>dc){
        //     ArrayList<String> base = new ArrayList<>();
        //     return base;
        // }
        
        ArrayList<String> ans = new ArrayList<>();
        
        //Horizontal Paths Possible
        int jump = 1;
        while(sc+jump <= dc){
            ArrayList<String> rightPaths = getMazePaths(sr, sc + jump, dr, dc);
            for(String s:rightPaths){
                ans.add("h" + jump + s);
            }
            jump++;
        }
        
        //Vertical Paths Possible
        jump = 1;
        while(sr+jump <= dr){
            ArrayList<String> downPaths = getMazePaths(sr+jump, sc, dr, dc);
            for(String s:downPaths){
                ans.add("v"+jump+s);
            }
            jump++;
        }
        
        //Diagonal Paths Possible
        jump = 1;
        while(sr+jump <= dr && sc+jump <= dc){
            ArrayList<String> diagonalPaths = getMazePaths(sr+jump, sc+jump, dr, dc);
            for(String s:diagonalPaths){
                ans.add("d"+jump+s);
            }
            jump++;
        }
        return ans;
    }

}