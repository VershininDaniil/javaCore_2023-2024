package timus;
import java.util.Scanner;
public class task1000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String x = in.nextLine();
        int a = Integer.parseInt(x);
        System.out.println("Введите число: ");
        String y = in.nextLine();
        int b = Integer.parseInt(y);
        int result = a + b;
        System.out.println("Ответ: " + result);
    }
}
