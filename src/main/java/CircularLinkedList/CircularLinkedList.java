package CircularLinkedList;

public class CircularLinkedList {
    Node last;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void push_back(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            newNode.next = newNode;
            return;
        }

        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }

    void push(int data){
        Node newNode = new Node(data);
        if(last == null){
            last = newNode;
            newNode.next = newNode;
            return;
        }

        newNode.next = last.next;
        last.next = newNode;
    }

    void deleteByValue(int value){
        if(last == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = this.last.next;
        do{
            if (temp.data == value) {
                break;
            }
            temp = temp.next;
        }while(temp != last.next);

        Node tempPreviousNode = this.last;
        do{
            if(tempPreviousNode.next == temp){
                tempPreviousNode.next = temp.next;
                return;
            }
            tempPreviousNode = tempPreviousNode.next;
        }while(tempPreviousNode != this.last);

    }

    void printList() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = last.next;

        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != last.next);
    }
}
