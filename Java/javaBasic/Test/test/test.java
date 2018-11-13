package test;

public class test {
    public static int getLengthUnicode(String str) {
        // sqlserver占2，oracle占3
        // add by wzf 20140704 begin
        // 如果传入值为null，则直接返回长度为0
        if (str == null || "".equals(str)) {
            return 0;
        }
        // add by wzf 20140704 end
        int digit = 2;
        String replacement = "";
        for (int i = 0; i < digit; i++) {
            replacement = replacement + "*";
        }
        String newStr = str.replaceAll("[^\\x00-\\xff| |.|,|(|)|’|\"|\\[|\\\\]]", replacement);
        return newStr.length();
    }

    public static void main(String[] args) {
        String str = "ab.\\\\?fghijkl no_qrstuvwxyzabcdefgh[ijklmnopqrstuvwxyzabcdefghijkl";
        System.out.print(getLengthUnicode(str));
        System.out.println(str);
        System.out.print(str.replaceAll("[^\\x00-\\xff]", "*"));
    }
}
