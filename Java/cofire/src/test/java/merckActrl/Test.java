package merckActrl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
            SecurityException, IllegalArgumentException, InvocationTargetException {
        String name = "com.cf.common.VisitorTypeEnum";
        Class clazz = Class.forName("com.cf.common.VisitorTypeEnum");
        System.out.println(name);
        System.out.println(clazz);
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.print(" " + method.getName());
        }

        Method method = clazz.getDeclaredMethod("getCodeNameList");
        System.out.println(method);

        Object obje = clazz.newInstance();
        System.out.println(method.invoke(obje));
    }
}
