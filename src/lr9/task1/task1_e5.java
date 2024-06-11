package lr9.task1;

public class task1_e5 {
    public class Main {

        public static void main(String[] args) {
            try {
                System.out.println("0");
                throw new RuntimeException("ошибка");
            } catch (NullPointerException e) {
                System.out.println("1");
            }
            System.out.println("2");
        }
    }
}
