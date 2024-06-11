package lr12;
import java. util. ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "Напишите функцию,"+ "Которая принимает на" +  " вход список "
                + "строк и возвращает " + "новый список, Содержащий" + " только те строки, "
                + "которые Начинаются " + "с большой буквы.";
        List<String> strings = List.of(string.split(" "));

        System.out.println("Введите минимальную длину строки : ");

        int minLength = scanner.nextInt();
        System.out.println("\n" + "Список до фильтрации : " + "\n");

        for (String e : strings) {
            System.out.println(e);
        }
        List<String> filteredStrings = filterByLength(strings, minLength);
        System.out.println("\n" + "Список после фильтрации: " + "\n");

        for (String i : filteredStrings) {
            System.out.println(i);
        }
    }
    public static List<String> filterByLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength).collect(Collectors.toList());
    }
}
