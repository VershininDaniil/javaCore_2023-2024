package lr5;
//3. Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.
public class Example3 {
    public static void main(String[] args) {
        numbers numbers = new numbers();
        numbers.showCode();
      numbers.showCode2();
      numbers.showCode3();
    }

}
 class numbers {
    private int x = 1;
    private int y = 2;

    void showCode() {
        System.out.println("без аргемунтов: ");
    }
   void showCode2 (){
        this.x = x;
        System.out.println("С одним аргументом " + x);
    }
   void showCode3 (){
       this.x = x;
       this.y = y;
       System.out.println("С двумя аргументами" + x * y);
}
}