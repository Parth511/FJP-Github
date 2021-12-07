import java.util.*;
public class GetKPC {
    static String[] dtoc = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> res = getKPC(0, s);
        System.out.println(res);
        sc.close();
    }

    public static ArrayList<String> getKPC(int i, String str) {
        if(i==str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        //Faith
        ArrayList<String> smallAns = getKPC(i+1, str);
        
        //Expectation
        ArrayList<String> ans = new ArrayList<>();
        for(Character letter : dtoc[str.charAt(i) - '0'].toCharArray()){
            for(String s:smallAns){
                ans.add(letter + s);
            }
        }
        return ans;
    }
}
