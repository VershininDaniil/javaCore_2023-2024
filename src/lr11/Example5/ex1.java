package lr11.Example5;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// добавление элементов с перемещением головы (наращивание с головы)
        Node head = null; // начальное значение ссылки на голову
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
        int newValue = Integer.parseInt(in.nextLine());
        head = new Node(newValue, head);
// вывод элементов на экран
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
