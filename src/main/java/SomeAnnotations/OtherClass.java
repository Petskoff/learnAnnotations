package SomeAnnotations;

/**
 * Created by PRO on 15.02.2017.
 */
public class OtherClass {

    public static String work(String... ls) {
        StringBuilder sb = new StringBuilder();
        for (String s : ls)
            sb.append(s);

        return sb.toString();
    }

    @Test
    public static boolean testMethod() {
        boolean res = work("1", "22", "333").equals("122333");
        System.out.println("SomeAnnotations.OtherClass: " + res);
        return res;
    }
}
