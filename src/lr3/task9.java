package lr3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива ");
        for (int i = 0 ; i < nums.length ; i++){
            System.out.println("Элемент массива  ["+i+"] после сортировки = " + nums[i]);
        }
        int min = Arrays.stream(nums).min().getAsInt();
        System.out.println("Минимальное значение: " + min);
        // не понял как сделать правильно , чтобы было несколько


    }
}
