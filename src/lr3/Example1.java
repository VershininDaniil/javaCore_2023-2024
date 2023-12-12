package lr3;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 7: ");
        int day = in.nextInt();
        switch (day) {
            case 1 :
                System.out.println("Понеделдьник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3 :
                System.out.println("Среда");
                break;
            case 4 :
                System.out.println("Четверг");
                break;
            case 5 :
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресение");
                break;
            default:
                System.out.println("Некорректное значение");
        }

    }
}
