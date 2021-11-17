import java.util.*;

public class InvertedBarChart {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)  arr[i] = sc.nextInt();
    int maxVal = arr[0];
    for(int i=0; i<n; i++)  maxVal = Math.max(maxVal,arr[i]);
    
    while(maxVal>0){
        for(int i=0; i<n; i++){
            if(arr[i]>0)
                System.out.print("*\t");
            else
                System.out.print("\t");
            arr[i]--;
        }
        System.out.println("");
        maxVal--;
    }
    sc.close();
  }

}