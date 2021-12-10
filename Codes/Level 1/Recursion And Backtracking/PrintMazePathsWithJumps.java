impot java.util.*;
public class PrintMazePathsWithJumps {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        printMazePaths(1,1, m, n, "");
        sc.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        
        int jump = 1;
        while(sc + jump <= dc)
            printMazePaths(sr, sc+jump, dr, dc, psf+"h"+jump++);

        jump=1;
        while(sr + jump <= dr)
            printMazePaths(sr+jump, sc, dr, dc, psf+"v"+jump++);
        
        jump=1;
        while(sc + jump <= dc && sr + jump <= dr)
            printMazePaths(sr+jump, sc+jump, dr, dc, psf+"d"+jump++);
    }
}
