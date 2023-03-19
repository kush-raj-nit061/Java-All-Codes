package Queue;


import java.util.EmptyStackException;

public class Queue_LL  {



    private Node top;
    private Node head;
    private int size;

    class Node{
        int data;
        Node next;
        Node(int elem){
            this.data = elem;
            next=null;

        }

    }


    public void enqueue(int a){
        Node temp = new Node(a);
        if(head==null){
            head = temp;
            top = temp;
            size++;
            
        }else if(size ==1){
            head.next = top;
            top.next = temp;
            top = temp;
            size++;
        }else {
            top.next = temp;
            top = temp;
            size++;
        }



    }
    public int dequeue()throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        Node temp = head;
        head = head.next;

        size--;
        return temp.data;

    }
    public boolean isEmpty(){
        return size == 0;

    }
    public int size(){
        return size;
    }
}
class Use_LL{
    public static void main(String[] args) throws QueueEmptyException {
        Queue_LL q = new Queue_LL();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }

}
