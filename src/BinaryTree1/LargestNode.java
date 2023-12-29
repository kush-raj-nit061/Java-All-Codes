package BinaryTree1;

import javax.swing.*;
import java.util.Scanner;

public class LargestNode {
    int data;
    LargestNode left;
    LargestNode right;
    int largest;

    public LargestNode takeInput(LargestNode node){
        Scanner s = new Scanner(System.in);
        int elem= s.nextInt();
        if(elem == -1){
            return null;
        }

        if(node == null){
            node = new LargestNode();
        }

        this.data = elem;
        takeInput(node.left);
        takeInput(node.right);
        return node;
    }

    public int largest(LargestNode node){
        if(node == null){
            return -1;
        }
        if(node.data>largest){
           largest = node.data;
        }
        largest(node.left);
        largest(node.right);

        return largest;

    }

    public static void main(String[] args) {
        LargestNode n = new LargestNode();
        n.takeInput(n);
        int largest =n.largest(n);
        if(largest<n.data){
            System.out.println( n.data );
        }else {
            System.out.println(largest);
        }
    }
}
