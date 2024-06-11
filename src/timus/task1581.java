package timus;
import java.util.Scanner;

public class task1581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        int count = 1;
        for (int i = 1; i <= n; i++) {
            if (i == n || sequence[i] != sequence[i - 1]) {
                System.out.print(count + " " + sequence[i - 1] + " ");
                count = 1;
            } else {
                count++;
            }
        }
    }
}
