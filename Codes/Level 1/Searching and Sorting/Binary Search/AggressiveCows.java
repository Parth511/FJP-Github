import java.util.*;

public class AggressiveCows {

    public static boolean isPossible(int d, int[] stalls, int c, int n){
        int placed = 1, placedAt = stalls[0];
        for(int i=1; i<n; i++){
            if(placedAt + d <= stalls[i]){
                placed++;
                placedAt = stalls[i];
            }
        }
        if(placed >= c)
            return true;
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), c = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int low = 1, high = arr[n-1] - arr[0];
            int ans = 1;
            while(low<=high){
                int mid = low + (high - low)/2;
                if(isPossible(mid, arr, c, n)){
                    ans = mid;
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
            System.out.println(ans);
            // sc.close();
        }
    }
}
