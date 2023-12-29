package LinkedList;

import java.util.Scanner;

public class InsertingNodes {

    static int count;





    public static Node<Integer> insertingNode(Node<Integer> head, int pos, int num){
        Node<Integer> newNode = new Node<>(num);
        int tempCount = 0;
        if(pos<0||pos>count-1){
            return head;
        }
        else if(pos==0){
            newNode.next = head;
            head = newNode;
        }else{
//            Node<Integer>
           for(int i=0;i<=num;i++){
//               if()
           }
        }

        return head;
    }

    public static Node<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        Node<Integer> head = new Node<Integer>(s.nextInt());
        Node<Integer> tail = head;
        while (tail.data!= -1) {
            count++;
            tail.next = new Node<Integer>(s.nextInt());
            tail = tail.next;

        }
        return head;
    }


    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printOutput(head);
        System.out.println(count);
        head = insertingNode(head,3,6);

    }

    private static void printOutput(Node<Integer> head) {
        while (head.data!=-1){
            System.out.println(head.data);
            head = head.next;
        }

    }
}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}


