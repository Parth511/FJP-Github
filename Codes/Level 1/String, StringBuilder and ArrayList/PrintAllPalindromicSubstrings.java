import java.util.*;

public class PrintAllPalindromicSubstrings {

    public static boolean isPalin(String s){
        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    
    public static void printSubstrings(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalin(s.substring(i,j+1))){
                    System.out.println(s.substring(i,j+1));
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printSubstrings(s);
        sc.close();
    }    
}
