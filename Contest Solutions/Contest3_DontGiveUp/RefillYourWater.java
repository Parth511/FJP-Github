import java.util.*;

public class RefillYourWater {

    public static int steps(int[] v,int n, int c){
        int steps = 0, remCap = c;
        for(int i=0; i<n; i++){
            steps+=1;
            if(remCap < v[i]){
                steps += 2*i;
                remCap = c;
            }
            remCap -= v[i];
        }
        return steps;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)  arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(steps(arr,n,k));
        sc.close();
    }    
}
