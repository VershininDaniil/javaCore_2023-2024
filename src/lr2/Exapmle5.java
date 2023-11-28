package lr2;
import java.util.Scanner;
public class Exapmle5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String x = in.nextLine();
        int X = Integer.parseInt(x);
        int result = (X / 1000 % 100000);
            System.out.println("Ответ:" + result);


    }
}
