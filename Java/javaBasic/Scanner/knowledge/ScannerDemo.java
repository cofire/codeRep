package knowledge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author ly
 * @date 2018年8月17日
 */
public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         * 从文件格式化输入
         */
        Scanner in = new Scanner(new File("hello.txt")); // 将参数改为System.in可以从键盘输入
        // 文件内容：hello 123 31313.111
        while (in.hasNext()) {
            System.out.println(in.next()); // hello
            System.out.println(in.nextInt()); // 123
            System.out.println(in.nextDouble()); // 31313.111
        }
        /*
         * 格式化输出到控制台
         */
        int data = 1234;
        double hello = -1234.13214134;
        System.out.printf("整数是%d\n", data); // 1234
        System.out.printf("浮点数是%7.3f\n", hello); // -1234.132
        /*
         * 格式化输出到文件
         */
        String outName = "out.txt"; // 保存hello : world
        File outFile = new File(outName);
        System.out.println(outFile.getAbsolutePath());

        PrintWriter printer = new PrintWriter(outFile); // FileNotFoundException
        printer.printf("%s : %s\n", "hello", "world");
        printer.close();
    }
}
