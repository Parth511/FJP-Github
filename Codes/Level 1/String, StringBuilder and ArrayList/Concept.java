
public class Concept {
    public static void main(String[] args){
        String str = "pepcoder";
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = new String("hello");
        String str5 = "hello";

        //== checks for address values
        System.out.println(str2 == str3);
        System.out.println(str3 == str5);
        System.out.println(str2 == str4);

        //equals() checks for content where the address is pointed
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str5));
        System.out.println(str2.equals(str4));
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
    }
}