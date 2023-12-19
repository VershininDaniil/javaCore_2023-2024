package lr4;
//1. Напишите программу, которая выводить в консольное окно
//прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
//строк;
public class Example1 {
    public static void main(String[] args) {
        int i;
        int j;
        int z;
        int v = 10;
        for(i=1; i <= v ; i++){
            System.out.print("номер строки: " + i + " ");
            z=0;
            for (j=-5;j<v;i++){
                System.out.print("+");
                z = z+1;
            }
            System.out.println("Количество символов в строке " + z);

        }


    }
}
