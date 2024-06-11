package lr9.task1;

public class task1_e8 {
    public class Main {
        public static int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } finally {
                System.out.println("1");
            }
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
    }
}
