package Queue;
import java.util.Stack;

public class Queue_2_Stack {

    Stack<Integer> q1 = new Stack<>();
    Stack<Integer> q2= new Stack<>();
    int length;
    int size;
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int top() {
        return q1.peek();
    }
    public void enqueue(int elem){

        if(length==size){
            q1.push(elem);
        }
        else{

            while (!q1.isEmpty()) {
                q2.push(q1.pop());

            }
            q2.push(elem);
            q1 = q2;
            q2 = new Stack<>();
        }


        length = size;
        size++;
        length++;

    }

    public int dequeue() throws QueueEmptyException {


        if(q1.isEmpty()){
           throw new QueueEmptyException();
        }
        if(length == size) {
            while (!q1.isEmpty()) {
                q2.push(q1.pop());
            }
            q1 = q2;
            q2 = new Stack<>();

        }
        int out = q1.pop();
        length = size;
        size--;

        return out;
    }

}

class test{
    public static void main(String[] args) throws QueueEmptyException {
        Queue_2_Stack q = new Queue_2_Stack();
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        System.out.println(q.size);

        System.out.println(q.dequeue());
        q.enqueue(0);
        System.out.println(q.dequeue());
        System.out.println(q.size);
        q.enqueue(10);
        q.enqueue(11);
        System.out.println(q.dequeue());
        System.out.println(q.size);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
    }










}
