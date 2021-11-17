package Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 2*n - 3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print(j + "\t");
            for(int j=1; j<=space; j++)
                System.out.print("\t");
            if(i!=7)
                for(int j=i; j>=1; j--)
                    System.out.print(j + "\t");
            else
                for(int j=i-1; j>=1; j--)
                    System.out.print(j + "\t");
            space = space - 2;
            System.out.println("");
        }
    }
}
