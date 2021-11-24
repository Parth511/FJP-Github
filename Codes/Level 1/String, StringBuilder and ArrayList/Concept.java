public class Concept {
    public static void main(String[] args) {
        String str = "pepcoder";
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = new String("hello");
        String str5 = "hello";

        // == checks for address values
        System.out.println(str2 == str3);
        System.out.println(str3 == str5);
        System.out.println(str2 == str4);

        // equals() checks for content where the address is pointed
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str5));
        System.out.println(str2.equals(str4));
        System.out.println(str == str2);
        System.out.println(str.equals(str2));

        // Using String Builder
        StringBuilder strb = new StringBuilder("hello");
        System.out.println(strb);
        System.out.println(strb.length());

        for (int i = 0; i < strb.length(); i++)
            System.out.print(strb.charAt(i) + " ");

        // Update ->constant
        strb.setCharAt(3, 'd');
        System.out.println(strb);

        // Delete ->O(n)
        strb.deleteCharAt(1);
        System.out.println(strb);

        // Insert -> O(n)
        strb.insert(2, 'e');
        System.out.println(strb);

        // Insert At Last -> constant time operation
        strb.append('s');
        System.out.println(strb);

        // + operator in not overloaded
        // strb = strb + " pepcoder";
        // System.out.println(strb);
        // will give error

        // Can also append string
        strb.append(" pepcoder");
        System.out.println(strb);

    }
}