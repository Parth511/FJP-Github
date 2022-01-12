import java.io.*;

public class BooksAllocationProblem {
    
    public static boolean isPossible(int mid, int[] arr, int n, int m){
        int stud = 1, load = 0;
        for(int i=0; i<n; i++){
            if(load + arr[i] <= mid)    
                load += arr[i];
            else{
                stud++;
                load = arr[i];
            }
        }
        if(stud <= m)
            return true;
        return false;
    }

    public static int minPages(int[]arr, int m) {
        int low = arr[0], high = 0, n = arr.length;
        for(int i=0; i<n; i++){
            low = Math.max(low, arr[i]);
            high += arr[i];
        }
        int ans = high;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(isPossible(mid, arr, n, m)){
                ans = mid;
                high = mid - 1;
            }else
                low = mid + 1;
        }
        
        return ans;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[]arr = new int[n];
        
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        
        int m = scn.nextInt();
        
        int ans = minPages(arr, m);
        System.out.println(ans);
        scn.close();
    }
}