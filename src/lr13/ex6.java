package lr13;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ex6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int sum = parallelSum(array);
        System.out.println("Сумма элементов: " + sum);
    }

    public static int parallelSum(int[] array) {
        //определяем количество доступных процессоров и создаем пул потоков фиксированного размера,
        // равного количеству процессоров
        int numberOfProcessors = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numberOfProcessors);
        //Определяем размер "куска" массива, который будет обрабатывать каждый поток
        int chunkSize = array.length / numberOfProcessors;
        //Создаем массив results для хранения результатов вычислений каждого потока
        int[] results = new int[numberOfProcessors];
        //Запускаем цикл, который создает задания для каждого потока и добавляет их в пул потоков
        for (int i = 0; i < numberOfProcessors; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == numberOfProcessors - 1) ? array.length : (i + 1) * chunkSize;
            int finalI = i;
            executor.execute(() -> {
                int sum = 0;
                for (int j = startIndex; j < endIndex; j++) {
                    sum += array[j];
                }
                results[finalI] = sum;
            });
        }
        //Закрываем пул потоков после того, как все задания будут выполнены
        executor.shutdown();
        //Ожидаем завершения выполнения всех заданий в пуле потоков
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Суммируем результаты вычислений каждого потока
        int sum = 0;
        for (int i = 0; i < numberOfProcessors; i++) {
            sum += results[i];
        }
        return sum;
    }
}
