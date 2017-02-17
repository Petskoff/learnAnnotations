package SomeAnnotations;

/**
 * Created by PRO on 15.02.2017.
 */
public class SomeClass {
    public static long job(long...ls) {
        long res = 0;
        for (long l : ls)
            res += l;

        return res;
    }

    @Test
    public static boolean selfTest() {
        boolean res = job(1, 2, 3, 4) == 10;
        System.out.println("SomeAnnotations.SomeClass: " + res);
        return res;
    }

    @TestWithVar(a = 1 ,b = 6)
    public static int sumVariable(int a, int b){
        return a+b;
    }
}
