import java.util.*;

public class GetSubSequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> subsets = gss(0, s);
        System.out.println(subsets);
        sc.close();
    }

    public static ArrayList<String> gss(int i, String str) {
        if(i==str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        //Faith
        ArrayList<String> smallAns = gss(i+1, str);
        
        //No
        ArrayList<String> ans = new ArrayList<>();
        for(String s:smallAns){
            ans.add(s);
        }
        
        //Yes
        for(String s:smallAns){
            ans.add(str.charAt(i) + s);
        }
        return ans;
    }
}