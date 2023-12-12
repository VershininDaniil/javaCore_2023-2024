package lr3;
import java.util.Scanner;
import java.util.Random;
public class Example9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите размер массива"); // Сообщение пользователю "для красоты и понимания"
        int size = id.nextInt(); // Запись в переменную Size (нужная для того чтобы задать размер массива)
        System.out.println("Размер массива равен " + size); // Сообщение пользователю "для красоты и понимания"
        int[] nums = new int[size]; // Создание массива с размером введённым из консоли
        Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
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
