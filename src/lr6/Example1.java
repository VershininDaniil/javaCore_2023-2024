package lr6;
//Напишите программу с классом, в котором есть два поля: символьное и текстовое.
//В классе должен быть перегруженный метод для присваивания значений полям. Если метод
//вызывается с символьным аргументом, то соответствующее значение присваивается
//символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
//значение текстового ноля. Методу аргументом также может передаваться символьный
//массив. Если массив состоит из одного элемента, то он определяет значение символьного
//поля. В противном случае (если в массиве больше одного элемента) из символов массива
//формируется текстовая строка и присваивается значением текстовому полю.
public class Example1 {
  public static void main(String[] args) {
    abv abv = new abv();
    abv.setchtostr("привет");
    abv.setchtostr('l');
    System.out.println(abv.a);
    System.out.println(abv.b);
    char[] ch1 = new char[5];
    ch1[0] = 'П';
    ch1[1] = 'о';
    ch1[2] = 'к';
    ch1[3] = 'а';
    ch1[4] = '!';
    abv.setcgrostr(ch1);
    System.out.println(abv.a);
    char[] ch2 = new char [4];
    ch2 [0] = 'h';
    ch2 [1] = 'e';
    ch2 [2] = 'y';
    ch2 [3] = '!';
    abv.setcgrostr(ch2);
    System.out.println(abv.a);
  }
}
class abv{
  String a;
  char b;
  public void setcgrostr(char[] chars){
    if (chars.length == 1){
      this.b = chars [0];
    }
    else if (chars.length > 1){
      this.a = String.valueOf(chars);
    }

  }

  public void setchtostr(String a) {
    this.a = a;
  }

  public void setchtostr(char b) {
    this.b = b;
  }
}