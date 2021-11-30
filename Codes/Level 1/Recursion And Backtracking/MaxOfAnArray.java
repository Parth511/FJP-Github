import java.util.*;

public class MaxOfAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(maxOfArray(arr,0));
        sc.close();
    }
    public static int maxOfArray(int[] arr, int idx){
        if(idx>=arr.length)
            return Integer.MIN_VALUE;
        return Math.max(arr[idx], maxOfArray(arr, idx+1));
    }
}
