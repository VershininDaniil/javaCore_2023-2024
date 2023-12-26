package lr5;
// 1 Напишите программу с классом, в котором есть закрытое символьное поле
//и три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код.
public class Example1 {
    public static void main(String[] args) {
        /*class Car{
           int release;
           int power;
           String model;
          private String motor;
       }
       Car nissan = new Car();
       nissan.release = 2006;
       nissan.power = 106;
       nissan.model = "Primera p12";
*/
        Example1 Example1 = new Example1(); // экземпляр класса создаем чтобы проверить код
        Example1.setSymbol('K');// вызвали у этого экземпляра метод присваивание значения
        System.out.println(Example1.getCodeSymbol()); // второй метод преобразовние символа в число и выводим в консоль
        Example1.showCode();
    }
    private char Symbol; // закрытое символьное поле

    public void setSymbol(char symbol) { // метод присваивает значение .
        Symbol = symbol;
    }
    public int getCodeSymbol(){  // метод при вызове возвращает результатом код символа.(типо преобразование типов)
        return Symbol;
    }
    public void showCode(){ // метод выводит символьное значение и его код
        System.out.println("Значение = " + Symbol); // символьное значение
        System.out.println("Код = " + (int)Symbol); // преобразование символа в код
    }

}
