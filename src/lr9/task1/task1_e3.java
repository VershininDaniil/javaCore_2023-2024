package lr9.task1;

public class task1_e3 {
    public class Main {
        public static void main(String[] args) {
            try {
                System.out.println("0");
                throw new RuntimeException("ошибка");
            } catch (NullPointerException e) {
                System.out.println("1");
            } catch (RuntimeException e) {
                System.out.println("2");
            } catch (Exception e) {
                System.out.println("3");
            }
            System.out.println("4");
        }

    }
}
