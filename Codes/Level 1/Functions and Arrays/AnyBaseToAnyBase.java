import java.util.*;
  
  public class AnyBaseToAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     System.out.print(AnyBasetoAnyBase(n,sourceBase,destBase));
     scn.close();   
   }   
   public static int AnyBasetoAnyBase(int n, int b1, int b2){
        int ans = 0, powb1 = 1;
        while(n>0){
            ans += (n%10)*powb1;
            powb1 *= b1;
            n /= 10;
        }
        n = ans; ans= 0;
        int pow10 = 1;
        while(n>0){
            ans += (n%b2)*pow10;
            pow10 *= 10;
            n /= b2;
        }
        return ans;
    }
  }