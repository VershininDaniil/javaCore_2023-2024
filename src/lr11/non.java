package lr11;

public class non {
    public static void main(String[] args ) {

        m(1);
    }
    public static void m(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
    }
}
