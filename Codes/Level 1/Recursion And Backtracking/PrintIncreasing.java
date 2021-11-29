import java.util.*;
public class PrintIncreasing {

    public static void printInc(int n){
        if(n==0)
            return;
        printInc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInc(n);
        sc.close();
    }
}
