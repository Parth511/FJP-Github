import java.util.*;

public class StringDifference {
    
    public static String solution(String str){
        StringBuilder res = new StringBuilder("");
        int n = str.length();
        for(int i=0; i<n-1; i++){
            res.append(str.charAt(i));
            res.append(str.charAt(i+1) - str.charAt(i));
        }
    
        res.append(str.charAt(n-1));
        return res.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
        sc.close();
    }
}
