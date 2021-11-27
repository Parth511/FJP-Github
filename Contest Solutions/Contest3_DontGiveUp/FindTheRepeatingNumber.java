// For each test case, print a single line containing the integer which appeared K times in Naruto's array.

// Sample Input 0

// 3
// 3 2 14
// 5 4 28
// 2 3 10
// Sample Output 0

// 5
// 1
// 3
// Explanation 0

// Test case 1 : Naruto's array could be [5,3,5,1].
// Test case 2 : Naruto's array could be [1,1,1,1,3,5,7,9].
// Test case 3 : Naruto's array could be [3,1,3,3]

//Solution
import java.util.*;

public class FindTheRepeatingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k = sc.nextInt(), s = sc.nextInt();
            int sumOdd = n*n;
            int missVal = (s - sumOdd)/(k - 1);
            System.out.println(missVal);
        }
        sc.close();
    }
}
