package lr12;
import java. util. ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class task9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String string = "Напишите1 функцию "+ "Которая3 принимает на5" +  " вход список7 "
            + "строк и9 возвращает " + "новый11 список, Содержащий13" + " только те15 строки, "
            + "которые17 Начинаются " + "с19 большой буквы.21 ";
    List<String> strings = List.of(string.split(" "));

    System.out.println("\n" + "Список до фильтрации : " + "\n");

    for (String e : strings) {
        System.out.println(e);
    }
    List<String> filteredStrings = filterByLength(strings);
    System.out.println("\n" + "Список после фильтрации: " + "\n");

    for (String i : filteredStrings) {
        System.out.println(i);
    }
}
    public static List<String> filterByLength(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("[а-яА-Я]+"))
                .collect(Collectors.toList());
    }
}
