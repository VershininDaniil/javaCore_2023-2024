package lr11.Example7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int listSize  = in.nextInt();
        List<Integer> list = new ArrayList<>();

        arrList(listSize, list);
        System.out.println(list);

        removeElement(list);

        System.out.println(method(listSize, 2));
    }

    public static void arrList(int listSize, List list) {
        for(int i = 0; i < listSize; i++) {
            list.add(i + 1);
        }
    }

    public static int method(int listSize, int step) {
        if(listSize > 1)
            return (method(listSize - 1, step) + step - 1) % listSize + 1;
        else
            return 1;
    }

    public static void removeElement(List list) {
        int count = 0;
        Iterator it = list.iterator();
        while(list.size() > 1) {
            if(it.hasNext()) {
                it.next();
                count++;
                if(count == 2) {
                    it.remove();
                    count = 0;
                    System.out.println(list);
                }
            }
            else {
                it = list.iterator();
            }
        }
    }
}
