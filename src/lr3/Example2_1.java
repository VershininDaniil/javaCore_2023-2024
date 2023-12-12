package lr3;

import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String day = in.nextLine();
        String pn = "Понедельник";
        String vt = "Вторник";
        String sr = "Среда";
        String cht ="Четверг";
        String pt = "Пятница";
        String sb = "Суббота";
        String vs = "Воскресение";
        // я догадываюсь что можно было решить по другому , но получилось только так,
        //назвал переменные и если они были равны(одинаковы) тому что ввели в консоль то гуд .
        // пытался еще через оператор ==, но он не подходит потому что сравнивает не введенное, а сыллки.
        if(day.equals(pn))
            System.out.println("1");
        else if (day.equals(vt))
            System.out.println("2");
        else if (day.equals(sr))
            System.out.println("3");
        else if (day.equals(cht))
            System.out.println("4");
        else if (day.equals(pt))
            System.out.println("5");
        else if (day.equals(sb))
            System.out.println("6");
        else if (day.equals(vs))
            System.out.println("7");
        else
            System.out.println("Такого дня нет(-_-)");

    }
}
