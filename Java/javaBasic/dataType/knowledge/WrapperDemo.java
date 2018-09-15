package knowledge;

import java.util.ArrayList;

public class WrapperDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // �Զ�װ�䣬intת��ΪInteger
        int data = 10;
        arrayList.add(data);

        // �Զ����䣬Integerת��Ϊint
        int ret = arrayList.get(0);

        // �Զ�װ����������new Integer(a)��-128 �� 127����ȣ���Ψһ�Ķ���
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true

        // �ֶ������µ�ʵ�� == 
        Integer c = new Integer(1);
        Integer d = new Integer(1);
        System.out.println(c == d); // false

        // equals
        Integer eInteger = new Integer(1);
        Integer fInteger = new Integer(1);
        System.out.println(eInteger.equals(fInteger));
    }
}