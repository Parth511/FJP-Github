import java.util.*;

public class DistinctOccurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)  arr[i] = sc.nextInt();

        int[] freq = new int[n];

        int count = 0;
        for(int i=0; i<n; i++){
            count = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == arr[i])
                    count++;
            }freq[i] = count;
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(freq[j] == freq[i] && arr[i] != arr[j]){
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
        sc.close();
    }
}
