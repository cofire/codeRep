package Singleton;

/**
 * �Ƿ� Lazy ��ʼ������
 * 
 * �Ƿ���̰߳�ȫ����
 * 
 * ʵ���Ѷȣ���
 * 
 * ���������ַ�ʽ�Ƚϳ��ã������ײ����������� �ŵ㣺û�м�����ִ��Ч�ʻ���ߡ� ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档 ������ classloader ���Ʊ����˶��̵߳�ͬ�����⣬������instance
 * ����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣��ڵ���ģʽ�д�������ǵ��� getInstance ������ ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ���ʱ���ʼ�� instance ��Ȼû�дﵽ lazy
 * loading ��Ч����
 * 
 * @author ly
 * @date 2018��8��22��
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
