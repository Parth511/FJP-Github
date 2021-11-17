import java.util.*;
public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
     }
    
     public static int getValueInBase(int n, int b){
         int ans = 0, pow10 = 1;
         while(n>0){
             ans += (n%b)*pow10;
             n /= b;
             pow10 *= 10;
         }
         return ans;
     }
}
