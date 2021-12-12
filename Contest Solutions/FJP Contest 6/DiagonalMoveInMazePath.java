import java.io.*;
import java.util.*;

public class Main {
    static int count = 0;
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            count++;
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
            ans.add("H" + s);
        ArrayList<String> downPaths = getMazePaths(sr+1, sc, dr, dc);
        for(String s:downPaths)
            ans.add("V" + s);
        ArrayList<String> diagonalPaths = getMazePaths(sr+1, sc+1, dr, dc);
        for(String s:diagonalPaths)
            ans.add("D" + s);
        return ans;
    }
    
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        if(sc<dc)   printMazePaths(sr, sc+1, dr, dc, psf + "H");
        if(sr<dr)   printMazePaths(sr+1, sc, dr, dc, psf + "V");
        if(sr<dr && sc<dc)  printMazePaths(sr+1, sc+1, dr, dc, psf + "D");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        ArrayList<String> ans = getMazePaths(0, 0, m, n);
        System.out.println(count);
        System.out.println(ans);
        printMazePaths(0, 0, m, n, "");
    }

}