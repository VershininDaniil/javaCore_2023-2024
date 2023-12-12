package lr3;
import java.util.Scanner;
import java.util.Random;
public class Example9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];
        Random random = new Random();
        int min = 1000;
        int index = 0;
        int min2 = 1000;
        int index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);

            if (nums[i] < min) {
                min = nums[i];
                index = i;
            }
            if (nums[i] == min) {
                if (index != index2)
                    min2 = min;
                index2 = i;
            }
            if (nums.length-1 == i) {
                if(min2!=1000)
                    if(index != index2)
                        System.out.println("значение второй минимальной позиции :" + "[" + index2 + "]" + " = " + min2);
            }
        }
        System.out.println("значение минимальной позиции :" + "[" + index + "]" + " = " + min);
    }

}
