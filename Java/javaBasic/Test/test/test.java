package test;

public class test {
    public static void main(String[] args) {
        Integer x = 126;
        int y = 126;
        System.out.println(x == y);

        System.out.println(x.equals(y));

        int a = 128;
        int b = 128;
        System.out.println(a == b);

        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));

        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);
        System.out.print(str3.equals(str4));
    }
}
