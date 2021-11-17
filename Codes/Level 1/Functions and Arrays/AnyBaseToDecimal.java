import java.util.*;
  
  public class AnyBaseToDecimal{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
      scn.close();
   }
  
   public static int getValueIndecimal(int n, int b){
        int ans = 0, powb = 1;
        while(n>0){
            ans += (n%10)*powb;
            powb *= b;
            n /= 10;
        }
        return ans;
   }
  }