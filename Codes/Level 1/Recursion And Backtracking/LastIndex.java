import java.util.*;

public class LastIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(lastIndex(arr,0,x));
        sc.close();
    }
    public static int lastIndex(int[] arr, int idx, int x){
        if(idx>=arr.length)
            return -1;
        
        int y = lastIndex(arr,idx+1,x);
        if(y!=-1)
            return y;
        
        if(arr[idx] == x)
            return idx;
        return -1;
    }
}
