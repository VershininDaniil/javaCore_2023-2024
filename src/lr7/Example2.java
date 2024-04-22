package lr7;
//Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
//базовом классе должен быть метод для присваивания значения полю: без параметров и с
//одним текстовым параметром. Объект суперкласса создается передачей одного текстового
//аргумента конструктору. Доступное только для чтения свойство результатом возвращает
//длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
//дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
//для присваивания значений полям (используется переопределение и перегрузка метода из
//суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
//текстовым и целочисленным параметром. У конструктора подкласса два параметра
//(целочисленный и текстовый).

public class Example2 {
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

    public class subClassTest1 extends superClassTest {

        //У него появляется еще одно приватное текстовое ноле.
        private String str2;
        private String str3;

        //подкласс должен иметь версии конструктора с одним и двумя текстовыми аргументами,
        //конструктор с одним параметром
        subClassTest1(String strEx) {
            super(strEx);
        }

        //конструктор с двумя параметрами
        subClassTest1(String strEx2, String strEx3) {
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
    }

    public class superClassTest1 {
        //приватное текстовое поле
        private String str1;

        //конструктор с текстовым аргументом
        superClassTest1(String strEx) {
            this.str1 = strEx;
        }

        superClassTest1() {
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
}


