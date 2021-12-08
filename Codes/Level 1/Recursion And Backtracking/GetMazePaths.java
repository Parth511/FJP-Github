import java.util.*;

public class GetMazePaths {

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
        }else if(sr>dr || sc>dc){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        ArrayList<String> rightPaths = getMazePaths(sr, sc+1, dr, dc);
        for(String s:rightPaths)
            ans.add("h" + s);
        ArrayList<String> downPaths = getMazePaths(sr+1, sc, dr, dc);
        for(String s:downPaths)
            ans.add("v" + s);
        return ans;
    }

}