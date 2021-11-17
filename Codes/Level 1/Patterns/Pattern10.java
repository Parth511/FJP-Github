package Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space1 = n/2, space2 = -1;
        for(int i=0; i<n; i++){
            for(int j=1; j<=space1; j++)
                System.out.print("\t");
            System.out.print("*\t");
            for(int j=1; j<=space2; j++)
                System.out.print("\t");
            if(i!=0 && i!=n-1)
                System.out.print("*\t");
            System.out.println("");
            if(i<n/2){
                space1 = space1 - 1;
                space2 = space2 + 2;
            }else{
                space1 =space1 + 1;
                space2 = space2 - 2;
            }
        }
    }
}
