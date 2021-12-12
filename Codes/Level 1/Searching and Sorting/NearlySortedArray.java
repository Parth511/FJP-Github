import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] num = new int[n];
    for (int i = 0; i < n; i++) {
      num[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    System.out.println(solve(num, k));
    scn.close();
  }

  public static int solve(int[] arr, int k) {
    int low = 0, high = arr.length-1, mid;
    while(low<=high){
        mid = low + (high - low)/2;
        if(arr[mid]==k){
            return mid;
        }else if(mid>0 && arr[mid-1]==k){
            return mid - 1;
        }else if(mid<arr.length-1 && arr[mid+1]==k){
            return mid + 1;
        }else if(arr[mid]>k){
            high = mid - 2;
        }else{
            low = mid + 2;
        }
    }
    return -1;
  }
}