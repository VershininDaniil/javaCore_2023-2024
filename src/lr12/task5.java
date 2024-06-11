package lr12;
import java. util. ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class task5 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "orange", "pear");
        List<String> result = filterBySubstring(input, "an");

        System.out.println(result);

    }

    public static List<String> filterBySubstring(List<String> input, String substring) {

        return  input.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
