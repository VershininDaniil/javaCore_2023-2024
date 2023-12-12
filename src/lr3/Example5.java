package lr3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = in.nextInt();

        if (size > 0) {


            Random random = new Random();
            int[] ints = new int[size];

            int count = 0;
            for (int i = 0; i < ints.length; i++) {
                boolean iterator = true;
                int x = 0;

                while (iterator) {
                    x = random.nextInt(100);
                    if (x % 5 == 2 || x % 3 == 1) {
                        iterator = false;
                    }
                }
                count=count+x;
                ints[i] = x;
            }
            System.out.println(Arrays.toString(ints));
            System.out.println("Count : " + count);



        } else {
            System.out.println("Input incorrect data");
        }
    }
}

