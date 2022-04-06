package LinkedList;

public class LinkedList<T> {
    Node<T> head;

    class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    void push(T data){
        Node<T> newNode = new Node<T>(data);
        if(head == null) head = newNode;
        else{
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    void pushBack(T data){
        Node<T> newNode = new Node<T>(data);
        if(head == null) head = newNode;
        else{
            Node<T> aux = head;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = newNode;
        }
    }

    void insert(T data, int position){
        if(position < 1) return;
        Node<T> newNode = new Node<T>(data);
        if(position == 1) {
            newNode.next = this.head;
            this.head = newNode;
            return;
        }
        int currentPosition = 0;
        Node<T> aux = this.head;
        while(aux != null && currentPosition != position - 1){
            currentPosition++;
            if(aux.next == null) break;
            aux = aux.next;
        }
        if(aux != null && currentPosition < position - 1){
            System.out.println("Position is greater than list size + 1: (" + (currentPosition + 1) + ")");
            return;
        }

        Node<T> auxNext = aux.next;
        aux.next = newNode;
        newNode.next = auxNext;
    }

    void print(){
        Node<T> aux = this.head;
        while(aux != null){
            System.out.println(aux.data);
            aux = aux.next;
        }
    }


}
