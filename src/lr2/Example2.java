package lr2;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String x = in.nextLine();
        int X = Integer.parseInt(x);
        if (X % 5 == 2)
        {
         System.out.println("Остаток ровняется 2");
        }
        else {
            System.out.println("Остаток не ровняется 2");
        }
        if (X % 7 == 1)
        {
            System.out.println("Остаток ровняется 1");
        }
        else {
            System.out.println("Остаток не ровняется 1");
        }
    }
}
