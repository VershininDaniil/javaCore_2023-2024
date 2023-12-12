package lr3;
import java.util.Scanner;
import java.util.Arrays;
public class Example7 {
    public static void main(String[] args) {
        int x = 10;
        char[] word = new char[x];
        char b = 'a';
        for(int i = 0; i < word.length; i ++){
            word[i] = b;
            b+=2;
            System.out.print(word[i]+" ");
        }
        System.out.println();
        for (int i = word.length - 1 ; i >= 0; i--){
            System.out.print(word[i] + " ");
        }

    }
}
