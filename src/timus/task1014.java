package timus;
import java.util.*;
public class task1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(10);
            return;
        }

        if (n < 10) {
            System.out.println(n);
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i > 1; i--) {
            while (n % i == 0) {
                sb.append(i);
                n /= i;
            }
        }

        if (n > 1) {
            System.out.println(-1);
            return;
        }

        System.out.println(sb.reverse().toString());
    }
}
