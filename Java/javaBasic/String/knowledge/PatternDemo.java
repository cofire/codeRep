package knowledge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jessin on 17-2-26.
 */
public class PatternDemo {
    public static void main(String[] args) {
        // Ԥ�ȱ���
        String str = "\\$(\\w+)\\((\\d+)\\)";
        Pattern pattern = Pattern.compile(str);
        String text = "hello $natureOrder(123) if you like this ,please use $indexOrder(99);";
        // ���ɱ�����
        Matcher matcher = pattern.matcher(text);
        // �õ����е�ƥ����
        while (matcher.find()) {
            // ����ƥ����ַ�����$function(argument)
            System.out.println(matcher.group());
            // ��һ��()�����ݣ�������function
            System.out.println(matcher.group(1));
            // �ڶ������ŵ����ݣ�����argument
            System.out.println(matcher.group(2));
            // �����е�ƥ����ɾ�������븳ֵ����������
            text = text.replace(matcher.group(), "field");
            // $natureOrder(123)
            // natureOrder
            // 123
            // $indexOrder(99)
            // indexOrder
            // 99
        }
        System.out.println(text);
        // hello field if you like this ,please use field;
    }
}
