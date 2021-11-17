import java.util.*;

public class BarChart{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)  arr[i] = sc.nextInt();
        
        int x = arr[0];
        for(int i=0; i<n; i++)  x = Math.max(x, arr[i]);
        
        while(x>0){
            for(int i=0; i<n; i++){
                if(arr[i] >= x)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            x--;
            System.out.println("");
        }
        sc.close();
    }

}