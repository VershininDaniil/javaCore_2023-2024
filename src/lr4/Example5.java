package lr4;
import java.util.Random;
//Напишите программу, в которой создается двумерный целочисленный
//массив. Он заполняется случайными числами. Затем в этом массиве строки и
//столбцы меняются местами: первая строка становится первым столбцом,
//вторая строка становиться вторым столбцом и так далее. Например, если
//исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//из 5 строк и 3 столбцов.
public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] twoArray = {{random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9)},
                {random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9)},
                {random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9)}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + twoArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("После сортировки ");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(" " + twoArray[i][j] + " ");
            }
            System.out.println();
        }
        }


    }

