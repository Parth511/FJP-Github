import java.util.*;

public class FindTheRepeatingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k = sc.nextInt(), s = sc.nextInt();
            int sumOdd = n*n;
            int missVal = (s - sumOdd)/(k - 1);
            System.out.println(missVal);
        }
        sc.close();
    }
}
