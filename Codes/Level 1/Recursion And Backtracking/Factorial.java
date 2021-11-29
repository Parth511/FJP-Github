import java.util.*;
public class Factorial {
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
        sc.close();
    }

    public static int fac(int n){
        if(n<=1)
            return 1;
        
        return n*fac(n-1);
    }
}