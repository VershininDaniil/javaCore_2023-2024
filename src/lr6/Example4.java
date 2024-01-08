package lr6;
//Напишите программу, в которой описан статический метод для вычисления
//двойного факториала числа, переданного аргументом методу. По определению, двойной
//факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
public class Example4 {
    public static void main(String[] args) {
        DoubleFactorial f = new DoubleFactorial();
        int number = 6;
        System.out.println("Рекурсивный метод");
        int fact = f.fact(number);
        System.out.println("Вычисление двойного факториала числа " + number + "!! = " + fact);
    }

    private static class DoubleFactorial {
        private int fact(int n) {
            int result;
            System.out.println("*" + n);
            if (n == 1) return 1;//проверка входного параметра, если павен 1, то выход из метода
            if (n == 2) return 2;//проверка входного параметра, если павен 2, то выход из метода
            result = fact(n - 2) * n;
            return result;
        }


        }
    }

