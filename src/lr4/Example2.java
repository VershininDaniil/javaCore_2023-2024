package lr4;
import java.util.Arrays;
//Напишите программу, которая выводит в консольное окно
//прямоугольный треугольник;
public class Example2 {
    public static void main(String[] args) {
    int i;
    int j;
    int figur = 10;
    int z = 0;
    for (i = 1;i <= figur;i++){
        System.out.print("номер строки: " + i + " ");
        for (j = 0; j <= z; j++){
            System.out.print("+");
        }
        z = z+1;
        System.out.println(" Количество символов в строке" + " " + z);
    }
    }
}
