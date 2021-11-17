import java.util.*;
  
  public class AnyBaseAddition{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
      scn.close();
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int ans = 0, carry = 0, pow10 = 1;
       while(n1>0 || n2>0 || carry>0){
           int res = (n1%10) + (n2%10) + carry;
           ans += (res%b)*pow10;
           carry = res/b;
           pow10 *= 10;
           n1 /= 10;
           n2 /= 10;
       }
       return ans;
   }
  }