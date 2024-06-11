package lr11.Example2;
import java.io.InputStream;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        while (true){
            Scanner id = new Scanner(System.in);
            System.out.println("ВВедите число");
            int n = id.nextInt();
            int length = 10;

            String binary = String.format("%0" + length + "d", Integer.valueOf(toBinary(n)));
            System.out.println(binary);
        }
    }


    public static String toBinary(int n) {
        if (n == 0) {
            return "0";
        }
        return toBinary(n / 2) + (n % 2);
    }
}
