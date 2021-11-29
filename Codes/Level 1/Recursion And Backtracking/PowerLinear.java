import java.util.*;
public class PowerLinear {
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), n = sc.nextInt();
        System.out.println(pow(x,n));
        sc.close();
    }

    public static int pow(int x, int n){
        if(n==0)
            return 1;
        if(n==1)
            return x;
        
        return x*(pow(x,n-1));
    }
    
}
