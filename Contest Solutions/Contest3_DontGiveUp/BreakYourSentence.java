//Question
// A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

// For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
// You are given a sentence s and an integer k. You want to truncate s such that it contains only the first k words. Return s after breaking it.

// Input Format

// The first line of a test case contains a string S.
// The second line of a test case denotes an interger k, by which the string is to be broken into.
// Constraints

// 1 <= s.length <= 500
// k is in the range [1, the number of words in s].
// s consist of only lowercase and uppercase English letters and spaces.
// The words in s are separated by a single space.
// There are no leading or trailing spaces.
// Output Format

// Print the resultant string after breaking.
// Sample Input 0

// Hello how are you Contestant
// 4
// Sample Output 0

// Hello how are you
// Explanation 0

// The words in s are ["Hello", "how" "are", "you", "Contestant"].

// The first 4 words are ["Hello", "how", "are", "you"].

// Hence, you should return "Hello how are you".

// Sample Input 1

// What is the solution to this problem
// 4
// Sample Output 1

// What is the solution
// Explanation 1

// The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].

// The first 4 words are ["What", "is", "the", "solution"].

// Hence, you should return "What is the solution".

// Sample Input 2

// chopper is not a tanuki
// 5
// Sample Output 2

// chopper is not a tanuki

//Solution
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