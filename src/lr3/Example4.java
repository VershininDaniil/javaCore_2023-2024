package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
      int[] r = {a,b};
        Arrays.sort(r);
        for (int i = 0; i < r.length ; i++){
            System.out.println(r[i]);
        }
        int o = 0;
        while (o < r.length){
            System.out.println(r[o]);
            o++;
        }
    }
}
