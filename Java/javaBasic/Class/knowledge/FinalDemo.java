package knowledge;

/**
 * Created by gzx on 16-12-29.
 */
// final类，不可以继承，所有方法均为final
public final class FinalDemo {
    // 全局final成员必须初始化
    private final static int finalData = 1;
    private int data;

    public void setData(final int data) {
        // 传值时已经初始化了，不可以再改变data
        // data = 2;
        this.data = data;
    }

    // 不可以覆盖
    public final int getData() {
        return data;
    }

    // 方法中的final局部变量
    public static void main(String[] args) {
        final int hello;
        // System.out.println(hello); // 只要不操作hello，就可以不用初始化，与局部变量类似
        final FinalDemo finalDemo = new FinalDemo();
        // 只能赋值一次，但可以改变对象的状态
        // finalDemo = new FinalDemo();
        int data = 2;
        finalDemo.setData(data);
        System.out.println(finalDemo.getData()); // 2
    }

}
