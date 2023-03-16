package Stack;


class Node <T>{

    T data;
    Stack.Node<T> next;
    Node(T data){
        this.data = data;
    }
}



public class StackUsingLinkedList <T> {
    private Node<T> head;
    private int size;
    public StackUsingLinkedList(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }
    public void push(T elem){
        Node<T> newNode = new Node<>(elem);
        newNode.next = head;
        head=newNode;
        size++;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public T pop(){
        T temp = (T) head;
        head=head.next;
        return temp;

    }

    public  T top(){
        return (T) head;

    }
}
