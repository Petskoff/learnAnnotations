package SomeAnnotations;

import java.lang.reflect.Method;

/**
 * Created by PRO on 15.02.2017.
 */
public class Tester {
    public static boolean test(Class<?>... ls) {
        try {
            for (Class<?> cls : ls) {
                Method[] methods = cls.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(Test.class)) {
                        Boolean b = (Boolean) method.invoke(null, new Object[]{});
                        if (!b)
                            return false;
                    }
                    if (method.isAnnotationPresent(TestWithVar.class)) {
                        TestWithVar testWithVar = method.getAnnotation(TestWithVar.class);
                        int res = (Integer) method.invoke(null, testWithVar.a() , testWithVar.b());
                        System.out.println("SomeAnnotations.TestWithVar: "+res);
                        System.out.println("sum: " + SomeClass.sumVariable(testWithVar.a(),testWithVar.b()));
                    }
                }
            }

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}