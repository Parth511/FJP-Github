package Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n/2, start = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++)
                System.out.print("\t");
            int j=start;
            for(j=start; j<2*start; j++)
                System.out.print(j + "\t");
            for(j=2*start-2; j>=start; j--)
                System.out.print(j + "\t");
            System.out.println("");
            if(i<=n/2){
                space = space - 1;
                start = start + 1;
            }else{
                space = space + 1;
                start = start - 1;
            }
        }

    }
}
