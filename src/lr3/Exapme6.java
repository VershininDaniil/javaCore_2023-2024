package lr3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Exapme6 {
    public static void main(String[] args) {
       Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив: ");
        int size = in.nextInt();
        int[] x = new int[size];
        for (int i = 0;i < x.length;i++){
            boolean iter = true;
            int X = 0;
            while (iter){
                X = random.nextInt(100);
                if (X % 5 == 2){
                    iter = false;
                }
            }
            x[i] = X;
        }
        System.out.println(Arrays.toString(x));
        
    }
}
