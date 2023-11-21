package lr1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш год рождения: ");
        String age = in.nextLine();
        int Age = Integer.parseInt(age);
        int a = 2023;
        int b = a - Age;
        System.out.print("Ваш возраст: " + b + " " + "лет" );
        in.close();
    }
}
