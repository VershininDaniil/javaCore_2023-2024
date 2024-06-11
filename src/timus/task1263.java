package timus;
import java.util.*;
public class task1263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] votes = new int[n];

        for (int i = 0; i < m; i++) {
            int candidate = scanner.nextInt() - 1;
            votes[candidate]++;
        }

        for (int i = 0; i < n; i++) {
            double percent = (double) votes[i] / m * 100;
            System.out.printf("%.2f%%\n", percent);
        }
    }
}
