import java.util.*;

public class ToggleCase{

    public static String toggleCase(String s){
        String res = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                res = res + (char)(ch + 32);
            }else{
                res = res + (char)(ch - 32);
            }
        }

        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(toggleCase(str));
        sc.close();
    }
}