package lr4;

//Напишите программу, в которой создается двумерный массив, который
//выводи прямоугольник из цифр 2;
public class Example3 {
    public static void main(String[] args) {
        int h = 5;
        int w = 15;
        int [][] a = new int [h][w];
        int z= 0;
        for ( int i = 0; i < h; i++){
            for (int j = 0 ; j < w;j++){
                a[i][j] = 2;
            }
        }
        for (int i =0; i < h; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j <w; j++){
                System.out.print(a[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }

    }
}
