package Queue;



public class QueueUsingArray {
    private int data[];
    private int front;
    private int frontI;
    public int rear;

    private int size;

    public QueueUsingArray(){
        data= new int[5];
        front = -1;
        rear = -1;
    }

    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front =-1;
        rear=-1;

    }
    public int size(){
        return size;
    }

    public boolean isEmpty (){
        return size ==0;
    }
    public void enqueue(int num)throws QueueFullException{
        if(size == 0){
            front = num;
            frontI++;
        }
        data[size++] = num;
        rear= num;
    }
    public int front(){
        return front;
    }
    public void dequeue()throws QueueEmptyException{

        front = data[frontI++];
        size -=1;
        if(size == 0){
            frontI = -1;
            rear = -1;
        }
        //System.out.println(front);

    }




}
class queueCheck{
    public static void main(String[] args) throws QueueEmptyException, QueueFullException {
        QueueUsingArray queueUsingArray = new QueueUsingArray(10);
        queueUsingArray.enqueue(4);
        queueUsingArray.enqueue(3);
        queueUsingArray.enqueue(2);
        queueUsingArray.enqueue(1);
        queueUsingArray.enqueue(9);
        queueUsingArray.enqueue(8);

        queueUsingArray.dequeue();
        queueUsingArray.dequeue();
        System.out.println(queueUsingArray.rear);
        System.out.println(queueUsingArray.size());
        queueUsingArray.dequeue();
        queueUsingArray.dequeue();
        queueUsingArray.dequeue();
        queueUsingArray.dequeue();


        System.out.println(queueUsingArray.front());
        System.out.println(queueUsingArray.size());

    }
}
