//Question
// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

// Input Format

// First line of each test case takes an integer n, size of an array.
// Second line of each test case receives an array arr.
// Constraints

// 1 <= arr.length <= 1000
// -1000 <= arr[i] <= 1000
// Output Format

// Return true or false acc. to desired output.
// Sample Input 0

// 6
// 1 2 2 1 1 3
// Sample Output 0

// true
// Explanation 0

// The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

// Sample Input 1

// 2
// 1 2
// Sample Output 1

// false
// Sample Input 2

// 10
// -3,0,1,-3,1,1,1,-3,10,0
// Sample Output 2

// true

//Solution
import java.util.*;

public class DistinctOccurence {

    public static boolean unique(int[] arr){
        int[] c = new int[2001];
        for(int i:arr){
            c[n+1000]++;
        }

        Arrays.sort(c);         //O(nlogn) step using merge/quick sort
        for(int i=1; i<c.length; i++){
            if(c[i]!=0 && c[i-1]!=0 && c[i]==c[i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)  arr[i] = sc.nextInt();

        if(unique(arr))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
