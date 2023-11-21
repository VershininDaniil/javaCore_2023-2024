package lr1;
import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String x = in.nextLine();
        int X = Integer.parseInt(x);
        System.out.println("Введите число: ");
        String y = in.nextLine();
        int Y = Integer.parseInt(y);
        int S = X + Y;
        int V = X - Y;
        System.out.println("Результат сложения = " + S );
        System.out.println("Результат вычитания = " + V );
        in.close();
    }
}
