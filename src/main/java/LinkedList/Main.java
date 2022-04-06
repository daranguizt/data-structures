package LinkedList;

public class Main {
    public static void main(String args[]){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1, 1);
        linkedList.insert(2, 2);
        linkedList.insert(4, 4);
        linkedList.insert(3,3);
        linkedList.insert(10,1);

        linkedList.push(5);
        linkedList.push(6);
        linkedList.push(7);

        linkedList.pushBack(100);
        linkedList.pushBack(101);
        linkedList.pushBack(102);

        linkedList.print();


    }
}
