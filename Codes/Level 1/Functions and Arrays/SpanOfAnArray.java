import java.util.*;

public class SpanOfAnArray{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
        arr[i] =sc.nextInt();
    int minVal = arr[0], maxVal = arr[0];
    for(int i=0; i<n; i++){
        minVal = Math.min(minVal, arr[i]);
        maxVal = Math.max(maxVal, arr[i]);
    }
    System.out.println(maxVal - minVal);
    sc.close();
 }

}