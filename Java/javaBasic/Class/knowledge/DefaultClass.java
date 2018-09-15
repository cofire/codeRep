package knowledge;

import knowledge2.Worker;

/**
 * Created by gzx on 16-12-27.
 */
public class DefaultClass extends Worker {
    public int getD() { // ����������ΪgetData�����������Ϊsuper.getData()������ʵ��Ȩ�޵�����
        return getData();
    }

    // Ĭ�ϼ̳�Object��hashCode equals toString����
    public static void main(String[] args) {
        Worker worker = new Worker();
        // ����ע�͵��������������Բ�����
        // worker.getData();
        Worker dc1 = new DefaultClass();
        DefaultClass dc2 = new DefaultClass();
        System.out.printf("%x\n", dc1.hashCode()); // 36baf30c
        // �������������ö�Ӧ�������ǲ����ģ������ܵ�����������ܵ��÷���������
        System.out.println(dc1.equals((DefaultClass) dc1)); // true
        System.out.println(dc1.equals(dc2)); // false
        // toString
        System.out.println(dc1); // knowledge.DefaultClass@36baf30c
        // ����ת��
        System.out.println(((DefaultClass) dc1).getD()); // 0
        // �������ʹ��
        System.out.println(dc2.getData()); // 0
    }
}
