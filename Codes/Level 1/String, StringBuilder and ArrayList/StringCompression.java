import java.util.*;

public class StringCompression {

    public static String compression1(String s){
        int n = s.length();
        String ans = "" + s.charAt(0);
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)!=s.charAt(i+1))
                ans = ans + s.charAt(i+1);
        }
        return ans;
    }

    public static String compression2(String s){
        int n = s.length(), freq= 0;
        String ans = "";
        for(int i=0; i<n; i++){
            if(i==0 || s.charAt(i) != s.charAt(i-1)){
                if(i>0 && freq>1)
                    ans = ans + freq;
                ans = ans + s.charAt(i);
                freq = 0;
            }
            freq++;
        }
        if(freq > 1)
            ans += freq;
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(compression1(s));
        System.out.println(compression2(s));
        sc.close();
    }
}
