package knowledge;

import knowledge2.Worker;

/**
 * Created by gzx on 16-12-27.
 */
public class DefaultClass extends Worker {
    public int getD() { // 将方法名改为getData，而方法体改为super.getData()，可以实现权限的扩大。
        return getData();
    }

    // 默认继承Object的hashCode equals toString方法
    public static void main(String[] args) {
        Worker worker = new Worker();
        // 下面注释的语句出错：保护属性不能用
        // worker.getData();
        Worker dc1 = new DefaultClass();
        DefaultClass dc2 = new DefaultClass();
        System.out.printf("%x\n", dc1.hashCode()); // 36baf30c
        // 不管怎样，引用对应的类型是不会变的，尽管受到所赋予对象能调用方法的限制
        System.out.println(dc1.equals((DefaultClass) dc1)); // true
        System.out.println(dc1.equals(dc2)); // false
        // toString
        System.out.println(dc1); // knowledge.DefaultClass@36baf30c
        // 向下转型
        System.out.println(((DefaultClass) dc1).getD()); // 0
        // 子类可以使用
        System.out.println(dc2.getData()); // 0
    }
}
