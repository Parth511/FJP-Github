package Patterns;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                counter = counter + 1;
                System.out.print(counter + "\t");
            }System.out.println("");
        }
    }
}
