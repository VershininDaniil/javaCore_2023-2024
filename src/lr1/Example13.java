package lr1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            String x = in.nextLine();
            int X = Integer.parseInt(x);
            System.out.println("Введите число: 2");
            String y = in.nextLine();
            int Y = Integer.parseInt(y);
            int b = Y + X;
            System.out.println("Сумма ровна = " + b );
            in.close();
    }
}
