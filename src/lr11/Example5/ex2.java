package lr11.Example5;

public class ex2 {
    public static void main(String[] args) {
// добавление элементов с перемещением головы (наращивание с головы)
        Node head = null; // начальное значение ссылки на голову
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
// вывод элементов на экран
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        Node newtail = new Node(123, null); // создается новый элемент со значением 123 – будущий хвост
        ref = head;                 // для перемещения по списку используется вспомогательная переменная ref,
        while (ref.next != null) {  // которой в качестве начальной ссылки передается указатель на «голову»
            ref = ref.next;         // пока не последний элемент
        }
        ref=newtail;// указателю последнего элемента присваиваем новый «хвост» (элемент)
// вывод элементов на экран
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

    }
}
