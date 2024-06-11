package lr9.task2;
import java.util.Scanner;

public class ex1 {
    public class Main {

        public static void main(String[] args) {
            try{PositiveAverageArray(SetArray());}
            catch (NullPointerException e) {
                System.out.println("Отсутвуют элементы массива (" + e + ")\n");
            }
            catch (Exception e){
                System.out.println("Неверный ввод данных ("+e+")\n");
            }
        }

        private static int[] SetArray() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите размер массива");        int a = scan.nextInt();
            int [] Array = new int[a];
            for(int i = 0; i < a ; i++){
                System.out.println("Введите целочисленный элемент массива " + "[" + ( i + 1 ) + "]" );
                Array[i]= scan.nextInt();
            }
            return Array;
        }

        private static void PositiveAverageArray(int [] InputArray){
            double A = 0;
            boolean flag = false;
            for (int j : InputArray) {
                if (j > 0){
                    A += j;}
                else if (j == 0){
                    flag = true;
                }
            }
            if (A <= 0 &&! flag){
                throw new NullPointerException("Положительные элементы отсутствуют");
            }
            System.out.println("Среднее значение положительных элементов массива = [" + (A/InputArray.length) + "]");
        }
    }
}
