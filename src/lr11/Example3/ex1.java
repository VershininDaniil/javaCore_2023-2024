package lr11.Example3;
import java.util.Scanner;
public class ex1 {
    public static int[] arr = new int [11];
    public static int number ;
    static Scanner in = new Scanner(System.in);
    public static int iterator = 0;
    public static int[] input(int n) {
        if (n == iterator)
            return arr;
        else{
            System.out.println("Введите " + (iterator+1) + " элемент массива");
            arr[iterator++] = in.nextInt();
        }
        return input(n);
    }
    public static void print(int[] arr) {
        if (arr == null || arr.length == 0) {
        } else {
            System.out.println("Элемент массива [" + (iterator + 1) + "] = " + arr[0]);
            iterator++;
            int[] next = new int[arr.length - 1];
            System.arraycopy(arr, 1, next, 0, arr.length - 1);
            print(next);
        }
    }

    public static void main(String[] args){
        System.out.println("Введите количество элементов массива");
        number = in.nextInt();
        arr = new int[number];
        int[] out = input(number);
        iterator=0;
        print(out);
    }
}
