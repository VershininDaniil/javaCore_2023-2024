package lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название текущего дня недели: ");
        String day = in.nextLine();
        System.out.println("Введите сегодняшнее число календарного дня: ");
        String num = in.nextLine();
        System.out.println("Введите текущий месяц: ");
        String mounth = in.nextLine();
        System.out.print("Сегоднящняя дата: " + day + " " + num + " " +"число" + " " + mounth + ".");
        in.close();
    }
}
