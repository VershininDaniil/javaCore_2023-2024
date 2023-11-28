package lr2;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String x = in.nextLine();
        int X = Integer.parseInt(x);
        if (X % 4==0 && X > 10 )
        {
                System.out.println("Число удовлетворяет критериям");
        }
        else
        {
            System.out.println("Число не удовлетворяет критериям");
        }
    }
}
