package lr7;
//Напишите программу, в которой использована цепочка наследования из трех
//классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//значений полей, переданных аргументами конструктору, а также конструктор создания
//копии.
public class Example4 { public static void main(String[] args) {
    //super Class test
    Super superFirst = new Super('A');
    String supName = superFirst.toString();
    System.out.println(supName);
    //super Class copy test
    Super superSecond= new Super(superFirst);
    String SupNameSecond = superSecond.toString();
    System.out.println(SupNameSecond);
    //1 subClass test
    SubFirst subFirst1 = new SubFirst('A',"AAA");
    String subName1 = subFirst1.toString();
    System.out.println(subName1);
    //1 subClass copy test
    SubFirst subFirst2 = new SubFirst(subFirst1);
    String subName2 = subFirst2.toString();
    System.out.println(subName2);
    //2 subClass test
    SubSecond SubSecond1 = new SubSecond('A',"AAA",512);
    String subName3 = SubSecond1.toString();
    System.out.println(subName3);
    //2 subClass copy test
    SubSecond subSecond2 = new SubSecond(SubSecond1);
    String subName3Copy = subSecond2.toString();
    System.out.println(subName3Copy);
}
}
 class SubFirst extends Super {
    SubFirst(char char1) {
        super(char1);
    }
    //Во втором классе появляется открытое текстовое поле
    public String str1;

    public void setChar1Str1(char char1, String str1) {
        super.char1 = char1;
        this.str1 = str1;
    }
    //original конструктор
    SubFirst(char char1, String str1) {
        super(char1);
        this.setChar1Str1(char1, str1);
    }
    //конструктор копии
    SubFirst(SubFirst copy) {
        super(copy.char1);
        this.setChar1Str1(copy.char1, copy.str1);
    }

    @Override
    public String toString() {
        String SecondFieldValue =
                "\n str 1 = " + this.getStr1();
        return super.toString()+SecondFieldValue;
    }
    public String getStr1() {
        return str1;
    }
} class SubSecond extends SubFirst {
    SubSecond(char char1) {
        super(char1);
    }
    //Во третьем классе появляется открытое целочисленное поле
    public int int1;

    public void setChar1Str1Int1(char char1, String str1, int int1) {
        super.char1 = char1;
        super.str1 = str1;
        this.int1 = int1;
    }
    //original конструктор
    SubSecond(char char1, String str1, int int1) {
        super(char1,str1);
        setChar1Str1Int1(super.char1, super.str1, int1);
    }
    //конструктор копии
    SubSecond(SubSecond copy) {
        super(copy.char1, copy.str1);
        this.setChar1Str1Int1(copy.char1, copy.str1, copy.int1);
    }

    public String toString() {
        String ThirdFieldValue =
                "\n str 2 = " + this.getInt1();
        return super.toString()+ThirdFieldValue;
    }
    public int getInt1() {
        return int1;
    }
} class Super {
    //В первом классе есть открытое символьное поле
    public char char1;

    public void setChar1(char char1) {
        this.char1 = char1;
    }
    //конструктор с одним параметром
    Super(char char1){
        this.setChar1(char1);
    }
    //конструктор копии
    Super(Super copy){ this.setChar1(copy.char1); }

    @Override
    public String toString() {
        String InfoSup;
        InfoSup =
                "\n Class name: " + this.getClass().getSimpleName() + "\n" +
                        " char 1 = " + this.getChar1();
        return InfoSup;
    }
    public char getChar1() {
        return char1;
    }
}
