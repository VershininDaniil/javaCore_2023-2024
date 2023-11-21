package lr1;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите ваш год рождения: ");
        String age = in.nextLine();
        int age1 = Integer.parseInt(age);
        int a = 2023;
        int b = a - age1;
        System.out.println("Ваше имя: " + name + ". " + "Ваш возраст: " + b + " " + "лет" );
        in.close();
    }
}
