import java.util.*;

public class BreakYourSentence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int k = sc.nextInt();
        StringBuilder s = new StringBuilder(s1);
        int i=0, space = 0;
        while(i<s.length() && space<k){
            if(s.charAt(i) == ' ')
                space++;
            i++;
        }
        if(space == k)
            System.out.println(s.substring(0, i-1));
        else
            System.out.println(s);
        sc.close();
    }
}