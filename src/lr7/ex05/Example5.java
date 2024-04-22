package lr7.ex05;
//Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
//конструктор с текстовым параметром и метод, при вызове которого в консольном окне
//отображается название класса и значение поля. На основе суперкласса создаются два
//подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
//защищенное целочисленное поле, там есть конструктор с двумя параметрами и
//переопределен метод для отображения значений полей объекта и названия класса. Во
//втором подклассе появляется защищенное символьное поле, конструктор с двумя
//параметрами и переопределен метод, отображающий в консоли название класса и значения
//полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
//отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
//метод через объектную переменную суперкласса, которая ссылается на объект
//производного класса
public class Example5 {public class Lab7_08_05 {
    public static void main(String[] args) {
        FirstSupClass SuperClassTest1 = new FirstSupClass("easy to test this");
        SuperClassTest1.PrintToString();

        FirstSubClass SubClassTest1 = new FirstSubClass("Test 4 subclass", 256);
        SubClassTest1.PrintToString();

        SecondSubClass SubClassTest2 = new SecondSubClass("Test 4 subclass again", 'A');
        SubClassTest2.PrintToString();

        FirstSupClass SuperClassTest2 = new FirstSupClass(SubClassTest1.getStr1());
        SuperClassTest2.PrintToString();

        FirstSupClass SuperClassTest3 = new FirstSupClass(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }
}} class FirstSubClass extends FirstSupClass {

    //защищенное целочисленное поле
    protected int int1;

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    //конструктор с двумя параметрами
    FirstSubClass(String str1, int int1) {
        super(str1);
        this.setInt1(int1);
    }

    //переопределен метод для отображения значений полей объекта и названия класса
    @Override
    public void PrintToString() {
        String SecondFieldValue =
                " int1 = \"" + this.getInt1()+"\"";
        super.PrintToString();
        System.out.println(SecondFieldValue);
    }
    public int getInt1() {
        return int1;
    }
} class FirstSupClass {
    //суперкласс с защищенным текстовым полем
    protected String str1;

    public void setStr1(String str1) {
        this.str1 = str1;
    }
    //конструктор с текстовым параметром
    FirstSupClass(String str1){
        this.setStr1(str1);
    }
    //метод, при вызове которого в консольном окне отображается название класса и значение поля
    public void PrintToString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "\n Class name: " + this.getClass().getSimpleName() + "\n" +
                        " String 1 = \"" + this.getStr1()+"\"";
        System.out.println(ClassNameAndFieldValue);
    }
    public String getStr1() {
        return str1;
    }
} class SecondSubClass extends FirstSupClass {

        //защищенное символьное поле
        protected char char1;

        public void setChar1(char char1) {
            this.char1 = char1;
        }

        //конструктор с двумя параметрами
        SecondSubClass(String str1, char char1) {
            super(str1);
            this.setChar1(char1);
        }

        //переопределен метод для отображения значений полей объекта и названия класса
        @Override
        public void PrintToString() {
            String SecondFieldValue =
                    " char1 = \"" + this.getChar1() + "\"";
            super.PrintToString();
            System.out.println(SecondFieldValue);
        }

        public char getChar1() {
            return char1;
        }
    }
