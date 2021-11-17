import java.util.*;

public class AnyBaseMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
    scn.close();
 }

 public static int getProduct(int b, int n1, int n2){
     int ans = 0, pow10 = 1;
     while(n2>0){
         int temp = n1, res = 0, pow102 = 1, carry = 0;
         while(temp>0 || carry>0){
             res += (((temp%10)*(n2%10) + carry)%b)*pow102;
             carry = ((temp%10)*(n2%10) + carry)/b;
             pow102 *= 10;
             temp /= 10;
         }
         
         int temp1 = ans, temp2 = res*pow10;
         ans = 0;pow102 = 1;carry = 0;
         while(temp1>0 || temp2>0 || carry>0){
             ans += ((temp1%10 + temp2%10 + carry)%b)*pow102;
             carry = (temp1%10 + temp2%10 + carry)/b;
             temp1/=10;
             temp2/=10;
             pow102*=10;
         }
         
         pow10 *= 10;
         n2/=10;
     }
     return ans;
 }

}