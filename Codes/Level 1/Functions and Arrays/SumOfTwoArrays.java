import java.util.*;

public class SumOfTwoArrays{

public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++) arr1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++) arr2[i] = sc.nextInt();
        sc.close();
        int i=n1-1, j=n2-1, n = Math.max(n1,n2), k=n-1, carry = 0;
        int[] ans = new int[n];
        while(i>=0 || j>=0){
            if(i>=0 && j>=0)
                ans[k] = arr1[i]+arr2[j];
            else if(i>=0)
                ans[k] = arr1[i];
            else
                ans[k] = arr2[j];
            ans[k] = ans[k] + carry;
            carry = ans[k]/10;
            ans[k] = ans[k]%10;
            k--;
            i--;
            j--;
        }
        
        for(i=0; i<n; i++)
            System.out.println(ans[i]);
    }
}