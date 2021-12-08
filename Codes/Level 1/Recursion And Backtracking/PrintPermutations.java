import java.util.*;

public class PrintPermutations {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str, "");
        sc.close();
    }

    public static void printPermutations(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        
        for(int i=0; i<input.length(); i++){
            String newInput = input.substring(0, i)+input.substring(i+1);
            printPermutations(newInput, output+input.charAt(i));
        }
    }

}