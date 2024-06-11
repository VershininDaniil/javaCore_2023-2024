package lr12;
import java. util. ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("Введите число на которое нужно поделить: ");
        int divisor = scanner.nextInt();
        System.out.println("\n" + "Спикок до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }
        List<Integer> integersAfter = getDivisibleNumbers(integers,divisor);

        System.out.println("\n" + "Спикок, содержащий только те числа, которые делятся на заданное число без остатка : " + "\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }
    public static List<Integer> getDivisibleNumbers(List<Integer> integers, int divisor) {
        return integers.stream()
                .filter(number -> number % divisor == 0)
                .collect(Collectors.toList());
    }
}
