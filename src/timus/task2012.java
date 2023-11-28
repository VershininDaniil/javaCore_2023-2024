package timus;
import java.util.Scanner;
public class task2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int r = 12 - f;
        int time = r * 45;
        if (time<=240)
        System.out.println("YES");
        else
            System.out.println("NO");
    }
}
