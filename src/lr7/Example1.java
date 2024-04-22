package lr7;
//Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//конструктором с текстовым параметром и где переопределен метод toString (). На основе
//суперкласса путем наследования создается подкласс. У него появляется еще одно
//приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
//двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
//В обоих классах метод toString () переопределяется так, что он возвращает строку с
//названием класса и значение текстового поля или текстовых полей.

public class Example1 {
    public static void main(String[] args) {
    superClassTest superClassObject = new superClassTest("передал в конструктор суперкласса");
    String className = superClassObject.toString();
    System.out.println(className);

    subClassTest subClassObject1 = new subClassTest("передал в конструктор подкласса");
    String subClassName = subClassObject1.toString();
    System.out.println(subClassName);

    subClassTest subClassObject2 = new subClassTest("передал в конструктор подкласса", "где два параметра");
    String subClassName2 = subClassObject2.toString();
    System.out.println(subClassName2);
}
}
 class subClassTest extends superClassTest {

    //У него появляется еще одно приватное текстовое ноле.
    private String str2;
    private String str3;

    //подкласс должен иметь версии конструктора с одним и двумя текстовыми аргументами,
    //конструктор с одним параметром
    subClassTest(String strEx) {
        super(strEx);
    }

    //конструктор с двумя параметрами
    subClassTest(String strEx2, String strEx3) {
        this.str2 = strEx2;
        this.str3 = strEx3;
    }

    //в подклассе должен быть переопределен метод toString ().
    //@Override - аннотация для указываемая для того, чтобы показать что далее мы собираемся переопределять метод суперкласса
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n" +
                " str 2 = " + this.str2 + "\n" +
                " str 3 = " + this.str3;
        return ClassNameAndFieldValue;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
} class superClassTest {
    //приватное текстовое поле
    private String str1;

    //конструктор с текстовым аргументом
    superClassTest(String strEx) {
        this.str1 = strEx;
    }

    superClassTest() {
        this.str1 = "нет параметров";
    }

    //@Override - аннотация указываемая для того, чтобы показать что далее мы собираемся переопределять метод суперкласса
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
