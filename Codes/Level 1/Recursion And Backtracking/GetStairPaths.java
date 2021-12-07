import java.util.*;
public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> res = getStairPaths(n);
        System.out.println(res);
        sc.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            //positive base case
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
            
        }else if(n<0){
            //negative base case
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        if(n-1>=0){
            ArrayList<String> smallAns1 = getStairPaths(n - 1);
            for(String s:smallAns1)
                ans.add("1" + s);
        }
        
        if(n-2>=0){
            ArrayList<String> smallAns2 = getStairPaths(n - 2);
            for(String s:smallAns2)
                ans.add("2" + s);
        }
        
        if(n-3>=0){
            ArrayList<String> smallAns3 = getStairPaths(n - 3);
            for(String s:smallAns3)
                ans.add("3" + s);
        }
            
        return ans;
    }
}
