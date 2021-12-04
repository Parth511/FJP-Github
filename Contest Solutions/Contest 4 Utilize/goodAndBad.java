import java.util.*;

public class goodAndBad {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int flag = 0;
            int n = s.length() - 1;
            int count = 0;
            for(int i = 0 ; i< n ;i++){
               if(s.charAt(i) != s.charAt(i+1)){
                   count++;
                   if(count == 2){
                       flag = 1;
                       break;
                   }
                   }else{
                       count = 0;
                       continue;
                   }
               }
            if(flag == 1){
                System.out.println("Good");
            }else{
                System.out.println("Bad");
            }
            sc.close();
        }
    }
}