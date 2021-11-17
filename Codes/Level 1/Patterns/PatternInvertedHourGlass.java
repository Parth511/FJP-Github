package Patterns;

import java.util.Scanner;

public class PatternInvertedHourGlass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n, space = 0;
        for(int i=0; i<n; i++){
            if(i<n/2){
                for(int j=1; j<=space; j++)
                    System.out.print("\t");
                for(int j=1; j<=star; j++)
                    System.out.print("*\t");
                space = space + 1;
                star = star - 2;
            }else if(i==n/2){
                for(int j=1;j<=space; j++)
                    System.out.print("\t");
                System.out.print("*\t");
                space = space - 1;
                star = star + 2;
            }else if(i==n-1){
                for(int j=1; j<=n; j++)
                    System.out.print("*\t");
            }else{
                for(int j=1; j<=space; j++)
                    System.out.print("\t");
                System.out.print("*\t");
                for(int j=1; j<=star - 2; j++)
                    System.out.print("\t");
                System.out.print("*\t");
                star = star + 2;
                space = space - 1;
            }
            System.out.println("");
        }
    }
}
