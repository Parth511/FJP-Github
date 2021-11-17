import java.util.*;

public class DifferenceOfTwoArrays{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++) arr1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++) arr2[i] = sc.nextInt();
        int borrow = 0, diff = n2 - n1;
        int[] ans = new int[n2];
        for(int i=n2-1; i>=0; i--){
            if(i-diff>=0)
                ans[i] = arr2[i] - arr1[i - diff] - borrow;
            else
                ans[i] = arr2[i] - borrow;
            if(ans[i]<0){
                borrow = 1;
                ans[i] += 10;
            }else{
                borrow = 0;
            }
            
        }
        sc.close();
        int i=0;
        while(ans[i] == 0)  i++;
        for(;i<n2; i++)
            System.out.println(ans[i]);
    }

}