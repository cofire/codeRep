package knowledge;

/**
 * Created by gzx on 16-12-30.
 */
public class InitDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("------------------------------------------------");
        Parent child = new Child();
        /*
         * 运行结果： parent static block staticData = 2 parent constructor data = 1 name = parent name parent getData name =
         * parent name staticData = 2 1 true false ------------------------------------------------ child static block
         * staticData = 3 parent constructor data = 1 name = parent name child getData name = null staticData = 3 0 true
         * true child constructor data = 2 name = child name
         */
    }
}

class Parent {
    private int data = 1;
    private String name = "parent name";
    private static int staticData = 2;
    static {
        System.out.println("parent static block staticData = " + staticData);
    }

    public Parent() {
        System.out.println("parent constructor data = " + data + " name = " + name);
        System.out.println(getData()); // 子类引用时，调用的是子类的方法
        System.out.println(this instanceof Parent);
        System.out.println(this instanceof Child);
    }

    public int getData() {
        System.out.println("parent getData name = " + name + " staticData = " + staticData);
        return data;
    }
}

class Child extends Parent {
    private int data = 2;
    private String name = "child name";
    private static int staticData = 3;
    static {
        System.out.println("child static block staticData = " + staticData);
    }

    public Child() {
        System.out.println("child constructor data = " + data + " name = " + name);
    }

    public int getData() {
        System.out.println("child getData name = " + name + " staticData = " + staticData);
        return data;
    }
}
