package lr1;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        String age = in.nextLine();
        int Age = Integer.parseInt(age);
        int year = 2023;
        int b = year - Age;
        System.out.println("Ваш год рождения: " + b);
    }
}
