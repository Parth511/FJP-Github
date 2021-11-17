import java.util.*;
  
  public class AnyBaseSubtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
      scn.close();
   }
  
   public static int getDifference(int b, int n1, int n2){
       boolean pos = true;
        if(n1>n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
            pos = false;
        }

        int ans = 0, pow10 = 1, borrow = 0;
        while(n2>0){
            int res = (n2%10) - (n1%10) - borrow;
            borrow = 0;
            if(res<0){
                borrow = 1;
                res = res + b;
            }
            ans = ans + res*pow10;
            pow10 = 10 * pow10;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        if(pos)
            return ans;
        else
            return -1*ans;
   }
  
  }