import java.io.*;

public class RotateAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  
    public static void reverse(int[] a, int left, int right){
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;right--;
        } 
    }

  public static void rotate(int[] arr, int k){
    // write your code here
    int n = arr.length;
    if(k>n) k%=n;
    if(k<0){
        k = (k%n) + n;
    }
    reverse(arr,0,n-k-1);
    reverse(arr,n-k,n-1);
    reverse(arr,0,n-1);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}