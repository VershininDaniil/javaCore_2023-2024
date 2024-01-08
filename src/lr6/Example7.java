package lr6;

import java.util.Arrays;

/*Напишите программу со статическим методом, аргументом которому передастся
символьный массив, а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива- аргумента.
*/
public class Example7 {
    public static void main(String[] args) {
        char arrayChar[] = new char[4];
        arrayChar[0] = 'а';
        arrayChar[1] = 'б';
        arrayChar[2] = 'в';
        arrayChar[3] = 'г';
        int[] arrayInt1 = Example7.getNum(arrayChar,3);
        System.out.println(Arrays.toString(arrayInt1));
    }

    static int arrayInt[];

    public static int[] getNum(char chArray[], int value) {
        if (value >= chArray.length) {
          int[] arrayChar = new int[chArray.length];
            for (int i = 0; i < chArray.length; i++) {
                arrayChar[i] =  chArray[i];
            }
            return arrayChar;
        }

        return new int[3];
    }
}
