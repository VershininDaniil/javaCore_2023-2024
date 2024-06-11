package lr13;

public class ex4 {
    private static int counter = 1;

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                int threadNumber = 0;
                threadNumber = counter;
                counter++;
                System.out.println("Thread " + threadNumber);
            }).start();

        }
    }
}
