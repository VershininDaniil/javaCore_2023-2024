package lr1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию:  ");
        String Фамилию = in.nextLine();
        System.out.println("Введите Имя:  ");
        String Имя = in.nextLine();
        System.out.println("Введите Отчество:  ");
        String Отчество = in.nextLine();
        String username = (Фамилию + " "+ Имя + " "+ Отчество +" ");
        System.out.print("Привет! " + username);
        in.close();
    }
}
