package Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1 + n/2, space = 1;
        for(int i=0; i<n; i++){
            for(int j=1; j<=star; j++)
                System.out.print("*\t");
            for(int j=1; j<=space; j++)
                System.out.print("\t");
            for(int j=1; j<=star; j++)
                System.out.print("*\t");
            System.out.println("");
            if(i<n/2){
                space = space + 2;
                star = star - 1;
            }else{
                space = space - 2;
                star = star + 1;
            }
        }
    }
}
