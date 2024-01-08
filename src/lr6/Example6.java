package lr6;
//Напишите программу со статическим методом, которому аргументом передается
//целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
//массив, который получается из исходного массива (переданного первым аргументом
//методу), если в нем взять несколько начальных элементов. Количество элементов, которые
//нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
//аргумент метода больше длины массива, переданного первым аргументом, то методом
//создается копия исходного массива и возвращается ссылка на эту копию.

import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {
        int [] arrayInt  = new int[3];
        arrayInt[0] = 2;
        arrayInt[1] = 5;
        arrayInt[2] = 88;
        int[] arrayIntResult1 = Example6.getArray(arrayInt,2);
        System.out.println(Arrays.toString(arrayIntResult1));
        int[] arrayIntResult2 = Example6.getArray(arrayInt,3);
        System.out.println(Arrays.toString(arrayIntResult2));
    }
    public static int[] getArray(int[] arrayInt,int value) {
        if (value >= arrayInt.length) {
            return arrayInt;
        }
        int [] arrayIntResult = new int[value];
        for(int i = 0 ; i < value;i++){
            arrayIntResult[i] = arrayInt[i];
        } return arrayIntResult;
    }
}
