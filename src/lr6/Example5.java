package lr6;
//Напишите программу со статическим методом, которым вычисляется сумма
//квадратов натуральных чисел
//1^2 + 2^2 + 3^2 + ... + п^2
//. Число п передается аргументом методу.
//Для проверки результата можно использовать формулу 1^2 + 2^2 +3
//^2+…+n^2=(n+l) (2n + 1)/6
public class Example5 {
   public static void main(String[] args) {
      Sum.getKvadrat();
      System.out.println();
   }
}
class Sum{

   public static int kvadrat;

   public static int getKvadrat() {
      int n = 3;
      int sq0 = (n*(n+1)*(2*n+1)/6);
      System.out.println(sq0);
       return n;
   }
}