package lr9.task1;

public class task1_e4 {
    public class Main {
        public static void main(String[] args) {
            try {
                System.out.println("0");
                throw new RuntimeException("ошибка");
            } catch (NullPointerException e) {
                System.out.println("1");
            } catch (Exception e) {
                System.out.println("2");
            } catch (Error e) {
                System.out.println("3");
            }
            System.out.println("4");
        }

    }
}
