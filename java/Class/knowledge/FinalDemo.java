package knowledge;

/**
 * Created by gzx on 16-12-29.
 */
// final�࣬�����Լ̳У����з�����Ϊfinal
public final class FinalDemo {
    // ȫ��final��Ա�����ʼ��
    private final static int finalData = 1;
    private int data;

    public void setData(final int data) {
        // ��ֵʱ�Ѿ���ʼ���ˣ��������ٸı�data
        // data = 2;
        this.data = data;
    }

    // �����Ը���
    public final int getData() {
        return data;
    }

    // �����е�final�ֲ�����
    public static void main(String[] args) {
        final int hello;
        // System.out.println(hello); // ֻҪ������hello���Ϳ��Բ��ó�ʼ������ֲ���������
        final FinalDemo finalDemo = new FinalDemo();
        // ֻ�ܸ�ֵһ�Σ������Ըı�����״̬
        // finalDemo = new FinalDemo();
        int data = 2;
        finalDemo.setData(data);
        System.out.println(finalDemo.getData()); // 2
    }

}
