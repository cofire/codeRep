package Singleton;

/**
 * ˫����/˫��У������DCL���� double-checked locking�� JDK �汾��JDK1.5 ��
 * 
 * �Ƿ� Lazy ��ʼ������
 * 
 * �Ƿ���̰߳�ȫ����
 * 
 * ʵ���Ѷȣ��ϸ���
 * 
 * ���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ� getInstance() �����ܶ�Ӧ�ó���ܹؼ���
 * 
 * @author ly
 * @date 2018��8��22��
 */
public class DCLSingleton {
    private volatile static DCLSingleton DCLSingleton;

    private DCLSingleton() {
    }

    public static DCLSingleton getSingleton() {
        if (DCLSingleton == null) {
            synchronized (DCLSingleton.class) {
                if (DCLSingleton == null) {
                    DCLSingleton = new DCLSingleton();
                }
            }
        }
        return DCLSingleton;
    }
}
