package lr1;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Имя:  ");
        String Имя = in.nextLine();
        String username = Имя;
        System.out.println("Введите Возраст:  ");
        String age = in.nextLine();
        System.out.print(username + " " + age + " " + "год");
        in.close();
    }
}
