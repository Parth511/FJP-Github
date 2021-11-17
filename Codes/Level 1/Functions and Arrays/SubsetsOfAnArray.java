import java.util.*;

public class SubsetsOfAnArray{
    
    public static int decToBin(int n){
        int ans = 0, pow10 = 1;
        while(n>0){
            ans += (n%2)*pow10;
            pow10 *= 10;
            n /= 2;
        }
        return ans;
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0; i<n; i++)  a[i] = sc.nextInt();
    
    int pow = (int)Math.pow(2,n);
    for(int i=0; i<pow; i++){
        int bin = decToBin(i);
        int pow10 = (int)Math.pow(10,n-1);
        int k = 0;
        while(k<n){
            if(bin/pow10 == 1){
                System.out.print(a[k] + "\t");
            }else{
                System.out.print("-\t");
            }
            
            bin = bin % pow10;
            pow10 /= 10;
            k++;
        }System.out.println("");
        sc.close();
    }
 }

}