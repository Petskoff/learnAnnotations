package SerializedAnnotations;

/**
 * Created by PRO on 16.02.2017.
 */
public class TestObj {
    @Save public int a;
    @Save private String b;
    public long c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public long getC() {
        return c;
    }

    public void setC(long c) {
        this.c = c;
    }
}
