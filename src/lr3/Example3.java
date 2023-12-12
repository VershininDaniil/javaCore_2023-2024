package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f3;
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 3;i <= num ; i++ ){
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
        }

    }

