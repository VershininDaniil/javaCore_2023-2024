package lr12;
import java. util. ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("Введите число до 100 : ");
        int value = scanner.nextInt();
        System.out.println("\n" + "Спикок до фильтрации: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }
        List<Integer> integersAfter = getDivisibleNumbers(integers, value);

        System.out.println("\n" + "Спикок, состоящий из чисел больше заданного значения : " + "\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> getDivisibleNumbers(List<Integer> integers, int value) {
        return integers.stream()
                .filter(numbers -> numbers>value)
                .collect(Collectors.toList());
    }
}
