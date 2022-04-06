package CircularLinkedList;

public class Main {
    public static void main(String args[]){
        CircularLinkedList cll = new CircularLinkedList();
        cll.printList();

        cll.push_back(1);
        cll.push_back(2);
        cll.push_back(3);
        cll.push_back(4);
        cll.push_back(5);


        cll.push(6);
        cll.push(7);
        cll.push(8);

        cll.deleteByValue(1);
        cll.deleteByValue(2);
        cll.deleteByValue(5);

        cll.printList();
    }
}
