package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = 1 + n/2, stars = -1;
        for(int i=0; i<n; i++){
            if(i<=n/2){
                spaces = spaces - 1;
                stars = stars + 2;
            }else{
                spaces = spaces + 1;
                stars = stars - 2;
            }
            for(int j=1; j<=spaces; j++)
                System.out.print("\t");
            for(int j=1;j<=stars; j++)
                System.out.print("*\t");
            System.out.println("");
        }
    }
}
