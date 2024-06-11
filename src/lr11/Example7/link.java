package lr11.Example7;
import java.util.Scanner;
public class link {
    public static void main(String[] args){

        LinkList people = new LinkList();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива ");
        int listSize = in.nextInt();
        int step = 1;

        people.fullList(listSize);
        people.display(listSize);
        people.removeElement(step,listSize);
    }

}
class Link{

    public int itemData;
    public Link next;

    public Link(int itemNumber){
        itemData = itemNumber;
    }
    public void displayLink(){
        System.out.print(itemData + " ");
    }
}

class LinkList{

    private Link first;
    private Link last;
    private Link current;

    public LinkList(){
        first = null;
        last = null;
        current = null;
    }

    public boolean isEmpty(){
        return(first == null);
    }
    public void setCurrent(){

        current = current.next;
    }


    public void fullList(int listSize){

        for(int i=1; i < listSize + 1; i++){
            Link newLink = new Link(i);

            if(isEmpty()){
                first = newLink;
                current = first;
            }
            else{
                current.next = newLink;
                newLink.next = first;
                last = newLink;
                setCurrent();
            }
        }
    }


    public Link find(int step, int listSize){
        Link marker = first;

        for(int i = 0; i < listSize; i++){
            if(marker.itemData == step){

                break;
            }
            else{
                marker = marker.next;
            }
        }

        return marker;
    }
    public void removeElement(int step, int listSize){

        while(listSize!= 1){

            Link current = find(step, listSize);
            Link previous = first;
            previous = current;
            current = current.next;

            if(current == first){
                first = first.next;
            } else{
                previous.next = current.next;
            }
            step = current.next.itemData;
            display(--listSize);
        }
    }

    public void display(int listSize){

        System.out.print("[ ");
        Link current = first;

        for(int i = 1; i < listSize+1; i++){
            current.displayLink();
            current = current.next;
        }
        System.out.print("]\n");
    }
}
