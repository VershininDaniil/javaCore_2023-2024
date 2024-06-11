package lr11.Example8;
import java.util.Scanner;
public class NodeRecursion {
    public static void main(String[] args) {
        NodeRecursion list = new NodeRecursion();
        list.createHeadRec();
        System.out.println("Список, введенный с головы: " + list.toStringRec(list.head));
        list.head = null;
        list.createTailRec();
        System.out.println("Список, введенный с хвоста: " + list.toStringRec(list.head));
    }
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    // Рекурсивный ввод с головы списка
    public void createHeadRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение (для завершения введите 0): ");
        int data = scanner.nextInt();
        if (data != 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            createHeadRec(); // рекурсивный вызов для ввода следующего элемента
        }
    }

    // Рекурсивный ввод с хвоста списка
    public void createTailRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение (для завершения введите 0): ");
        int data = scanner.nextInt();
        if (data != 0) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            createTailRec(); // рекурсивный вызов для ввода следующего элемента
        }
    }

    // Рекурсивный вывод списка в виде строки
    public String toStringRec(Node node) {
        if (node == null) {
            return "";
        } else {
            return node.data + " " + toStringRec(node.next);
        }
    }
}
