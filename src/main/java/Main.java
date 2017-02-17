import SerializedAnnotations.Serializer;
import SerializedAnnotations.TestObj;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by PRO on 15.02.2017.
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
//        //Some Annotations test
//        System.out.println(Tester.test(SomeClass.class, OtherClass.class));


//        //Save File Annotation test
//        Container container = new Container();
//        Class<?> cls = container.getClass();
//        if (!cls.isAnnotationPresent(SaveTo.class)){
//            System.out.println("We don't have such annotation!");
//            return;
//        }
//        SaveTo saveTo = cls.getAnnotation(SaveTo.class);
//        String path = saveTo.path();
//        Method [] methods = cls.getDeclaredMethods();
//        for (Method method : methods) {
//            if (method.isAnnotationPresent(Saver.class)) {
//                method.invoke(container,path);
//                System.out.println("Ok! File was created!");
//                break;
//            }
//        }

        //Serialized and Deserialized file with annotations
        TestObj t = new TestObj();
        t.setA(7);
        t.setB("Hello");


        String res = Serializer.serialize(t);
        System.out.println("Serialized: " + res);

        try {
            t = Serializer.deserialize(res, TestObj.class);
            System.out.println("Deserialized: " + t.getA() + ", "+ t.getB() + ", " + t.getC());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
