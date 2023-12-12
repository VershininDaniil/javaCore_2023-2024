package lr3;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
public class Example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();

        System.out.println("Размер массива равен "+ size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for (int i = 0 ; i < nums.length ; i++ ) {}
        int[] nums2 = Arrays.stream(nums).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        for (int i = 0 ; i < nums2.length ; i++ ) {
            System.out.println("Элемент массива [" + i + "] после сортировки = " + nums2[i]);
        }
    }
}
