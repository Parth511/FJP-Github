package Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 0;
        for(int i=0; i<n; i++){
            if(i!=n/2){
                for(int j=0; j<n/2; j++)
                    System.out.print("\t");
            }else{
                for(int j=0; j<n/2; j++)
                    System.out.print("*\t");
            }
            if(i<=n/2)  star = star + 1;
            else    star = star - 1;
            for(int j=1; j<=star; j++)
                System.out.print("*\t");
            System.out.println("");
        }
    }
}
