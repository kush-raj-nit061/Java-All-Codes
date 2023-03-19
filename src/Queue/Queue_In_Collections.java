package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class Queue_In_Collections {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.isEmpty());
        System.out.println(q.iterator());
        System.out.println(q.element());

    }
}
