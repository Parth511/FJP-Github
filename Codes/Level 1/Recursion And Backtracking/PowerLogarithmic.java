import java.util.*;
public class PowerLogarithmic {
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), n = sc.nextInt();
        System.out.print(pow(x,n));
        sc.close();
    }

    public static int pow(int x, int n){
        if(n==0)
            return 1;
        
        int ans = pow(x,n/2);
        ans *= ans;
        if(n%2==1)
            ans *= x;
        return ans;
    }

}
