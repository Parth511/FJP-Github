import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ArrayList<String> dup2 = new ArrayList<>();
        int ans = count(str,"",dup2);
        System.out.println(ans);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String st = "";
        for(int i=0;i<arr.length;i++){
            st += arr[i];
        }
        //System.out.println(st);
        ArrayList<String> dup = new ArrayList<>();
        printPerm(st,"",dup);
    }
    
    public static int count(String inp, String op, ArrayList<String> dup){
        if(dup.contains(op)){
            return 0;
        }
        
        if(inp.length()==0){
            dup.add(op);
            return 1; 
        }
        
        int ans = 0;
        
        for(int i=0;i<inp.length();i++){
            String inpN = inp.substring(0,i) + inp.substring(i+1);
            String opN = op + inp.charAt(i);
            ans += count(inpN, opN,dup);
        }
        
        return ans;
    }
    
    public static void printPerm(String inp, String op, ArrayList<String> dup){
        if(dup.contains(op)){
            return;
        }
        
        if(inp.length()==0){
            System.out.println(op); 
            dup.add(op);
        }
        
        for(int i=0;i<inp.length();i++){
            String inpN = inp.substring(0,i) + inp.substring(i+1);
            String opN = op + inp.charAt(i);
            printPerm(inpN, opN, dup);
        }
        
    }
}