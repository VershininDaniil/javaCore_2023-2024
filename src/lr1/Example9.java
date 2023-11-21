package lr1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название сегодняшнего месяца: ");
        String mounth = in.nextLine();
        System.out.println("Введите количество дней в этом месяце: ");
        String num = in.nextLine();
        System.out.println("В месяце " + mounth + " " + num + " " + "дней" );
        in.close();
    }
}
