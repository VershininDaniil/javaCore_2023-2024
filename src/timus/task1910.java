package timus;
import java.util.Scanner;
public class task1910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Считываем количество секций стены
        int n = scanner.nextInt();
        // Создаем массив для хранения значений силы магического поля
        int[] a = new int[n];
        // Считываем значения силы магического поля
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        // Инициализируем максимальную суммарную силу поля и индекс средней секции
        int maxSum = Integer.MIN_VALUE;
        int midIndex = -1;
        // Проходимся по массиву и ищем максимальную суммарную силу поля и индекс средней секции
        for (int i = 1; i < n - 1; i++) {
            int sum = a[i - 1] + a[i] + a[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                midIndex = i + 1;
            }
        }

        // Выводим результат
        System.out.println(maxSum + " " + midIndex);
    }
}
