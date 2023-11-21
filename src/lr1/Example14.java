package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String x = in.nextLine();
        int X = Integer.parseInt(x);
        int Y = X - 1;
        int B = X = X;
        int Z = X + 1;
        int R = Y + B + Z;
        int F = R * R;
        System.out.println("Ответ" + " " + Y);
        System.out.println("Ответ" + " " + B);
        System.out.println("Ответ" + " " + Z);
        System.out.println("Ответ" + " " + F);
        in.close();
    }
}
