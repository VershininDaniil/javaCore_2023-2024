package lr11.Example1;

public class ex4 {
    public static void m(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n) {
        int result;
        if (n == 1) return 1;
        else {
            result = fact(n - 1) * n;
            return result;
        }
    }
}
