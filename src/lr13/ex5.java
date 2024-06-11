package lr13;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
//Для того, чтобы найти максимальный элемент в массиве целых чисел,
// можно использовать подход, основанный на разделении массива на части и обработке каждой части в отдельном потоке.
// Для этого можно использовать класс ExecutorService,
// который позволяет создать пул потоков и распределить задачи между ними.
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class ex5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        int maxElement = findMaxElement(array);
        System.out.println("Наибольший элемент: " + maxElement);
        int numberOfProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Число потоков в процессоре: " + numberOfProcessors);
    }

    public static int findMaxElement(int[] array) {
        // Определяем число доступных процессоров
        int numberOfProcessors = Runtime.getRuntime().availableProcessors();
        // Определяем размер куска (части) массива для обработки каждым потоком
        int chunkSize = array.length / numberOfProcessors;
        // Создаем пул потоков
        ExecutorService executor = Executors.newFixedThreadPool(numberOfProcessors);
        // Массив для хранения результатов выполнения задач
        int[] results = new int[numberOfProcessors];

        // Разделяем массив на части и обрабатываем каждую часть в отдельном потоке
        for (int i = 0; i < numberOfProcessors; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == numberOfProcessors - 1) ? array.length : (i + 1) * chunkSize;

            int finalI = i;
            // Задача для поиска максимального элемента в части массива
            executor.execute(() -> {
                int max = Integer.MIN_VALUE;
                for (int j = startIndex; j < endIndex; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }
                // Сохраняем максимальный элемент для текущей части массива
                results[finalI] = max;
                System.out.println("Поток " + Thread.currentThread().getName() + " завершен. max = " + max);
            });
        }

        // Завершаем выполнение потоков в пуле
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Находим максимальный элемент среди результатов выполнения задач
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numberOfProcessors; i++) {
            if (results[i] > max) {
                max = results[i];
            }
        }

        return max;
    }
}
