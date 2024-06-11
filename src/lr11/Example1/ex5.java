package lr11.Example1;

public class ex5 {
    public static void main(String[] args) {
        System.out.println("\n" + "n= "+ fact(5));

    }
    public static int fact(int x) {
        System.out.println("x= " + x);
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return fact(x - 2) + fact(x - 1);
        }
    }
}
