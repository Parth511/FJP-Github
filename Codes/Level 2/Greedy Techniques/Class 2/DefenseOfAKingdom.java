import java.util.*;

public class DefenseOfAKingdom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int w = sc.nextInt(), h = sc.nextInt(), n = sc.nextInt();
            ArrayList<Integer> rows = new ArrayList<>(), cols = new ArrayList<>();
            
            rows.add(0); rows.add(h+1);
            cols.add(0); cols.add(w+1);

            for(int i=0; i<n; i++){
                int x = sc.nextInt(), y = sc.nextInt();
                rows.add(y);
                cols.add(x);
            }

            Collections.sort(rows);
            Collections.sort(cols);

            int maxDiffRow = 0;
            int maxDiffCol = 0;
            for(int i=1; i<rows.size(); i++){
                maxDiffRow = Math.max(maxDiffRow, rows.get(i) - rows.get(i-1) - 1);
                maxDiffCol = Math.max(maxDiffCol, cols.get(i) - cols.get(i-1) - 1);
            }

            System.out.println(maxDiffRow * maxDiffCol);
        }
    }
}
