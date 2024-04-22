//Напишите программу, в которой на основе суперкласса создается подкласс, а на
//основе этого подкласса создается еще один подкласс (цепочка наследования из трех
//классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
//параметром для присваивания значения полю и конструктор с одним параметром. Во
//втором классе появляется открытое символьное поле, метод с двумя параметрами для
//присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
//аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
//чтобы он возвращал строку с названием класса и значениями всех полей объекта
package lr7;

public class Example3 {
}
 class FirstSupClass {
    //в первом суперклассе есть открытое целочисленное поле
    public int int1;
    //метод с одним параметром для присваивания значения полю
    public void setInt1(int int1) {
        this.int1 = int1;
    }
    //конструктор с одним параметром
    FirstSupClass(int int1){
        this.setInt1(int1);
    }
    //Для каждого класса определите метод toString () так, чтобы он возвращал строку с названием класса и значениями всех полей объекта.

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " int 1 = " + this.getInt1();
        return ClassNameAndFieldValue;
    }
    public int getInt1() {
        return int1;
    }
 public static void main(String[] args) {
    FirstSupClass superClassTest = new FirstSupClass(512);
    String className1 = superClassTest.toString();
    System.out.println(className1);

    SecondSubClass FirstSubClassTest = new SecondSubClass(1024,'K');
    String className2 = FirstSubClassTest.toString();
    System.out.println(className2);

    ThirdSubClass SecondSubClassTest = new ThirdSubClass(1024,'K',"кибибайт");
    String className3 = SecondSubClassTest.toString();
    System.out.println(className3);
}
}
class SecondSubClass extends FirstSupClass{
    SecondSubClass(int int1) {
        super(int1);
    }
    //Во втором классе появляется открытое символьное поле
    public char char1;
    //метод с двумя параметрами для присваивания значения полям (перегрузка метода из суперкласса)
    public void setInt1Str1(int int1, char char1) {
        super.int1 = int1;
        this.char1 = char1;
    }
    //конструктор с двумя параметрами
    SecondSubClass(int int1, char char1) {
        super(int1);
        this.setInt1Str1(int1, char1);
    }


    public String toString() {
        String SecondFieldValue =
                "\n str 1 = " + this.getChar1();
        return super.toString()+SecondFieldValue;
    }
    public char getChar1() {
        return char1;
    }
}
  class ThirdSubClass extends SecondSubClass{
    ThirdSubClass(int int1) {
        super(int1);
    }
    //В третьем классе появляется открытое текстовое ноле
    public String str2;
    //метод с тремя аргументами для присваивания значений полям (перегрузка метода из суперкласса)
    public void setInt1Str1Str2(int int1, char char1, String str2) {
        super.int1 = int1;
        super.char1 = char1;
        this.str2 = str2;
    }
    //конструктор с тремя параметрами
    ThirdSubClass(int int1, char char1, String str2) {
        super(int1,char1);
        setInt1Str1Str2(int1, char1, str2);
    }

    public String toString() {
        String ThirdFieldValue =
                "\n str 2 = " + this.getStr2();
        return super.toString()+ThirdFieldValue;
    }
    public String getStr2() {
        return str2;
    }
}