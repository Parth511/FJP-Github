import java.util.*;

public class PrintKPC {
    
    static String[] dtoc = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printKPC(0, s, "");
        sc.close();
    }

    public static void printKPC(int idx, String str, String asf) {
        if(idx==str.length()){
            System.out.println(asf);
            return;
        }
        char c = str.charAt(idx);
        for(int i=0; i<dtoc[c-'0'].length(); i++){
            printKPC(idx+1, str, asf+dtoc[c - '0'].charAt(i));
        }
    }

}