package lr2;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String x = in.nextLine();
        int X = Integer.parseInt(x);
        if (X > 5 && X < 10)
        {
            System.out.println("Попадает в диапазон");
        }
        else
            System.out.println("Не попадает в диапазон");
    }
}
