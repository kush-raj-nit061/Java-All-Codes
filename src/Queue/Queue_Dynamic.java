package Queue;

import Stack.StackEmptyException;

public class Queue_Dynamic {
    private int arr[];
    private int size;
    private int front=-1;
    private int rear=-1;

    Queue_Dynamic(){
        arr = new int[5];
    }
    Queue_Dynamic(int len){
        arr = new int[len];
    }

    public void enqueue(int a){
        if(size == arr.length){
            doubleCapacity();
        }
        if(size == 0){
            front = 0;
        }

        rear = (rear+1)%arr.length;
        arr[rear] = a;
        size++;

    }

    public int dequeue()throws StackEmptyException {
        if(size == 0){
            throw new StackEmptyException();
        }
        int removed_elem = arr[front];
        front = (front+1)% arr.length;
        size--;
        return removed_elem;

    }

    public boolean isEmpty(){
        return size==0;
    }

    public void doubleCapacity() {
        int temp[] = arr;
        arr = new int[2*temp.length];
        int index = 0;
        for(int i = front;i<temp.length;i++){
            arr[index++] = temp[i];
        }
        for(int i = 0;i<front;i++){
            arr[index++] = temp[i];
        }
        front = 0;
        rear = temp.length-1;

    }

    public int size(){

        return size;
    }

}

class Use{
    public static void main(String[] args) throws StackEmptyException {
        Queue_Dynamic q = new Queue_Dynamic();
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(8);
        q.enqueue(7);
        q.enqueue(6);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(8);

    }
}
