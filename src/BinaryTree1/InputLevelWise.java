package BinaryTree1;

import java.util.LinkedList;
import java.util.Queue;

public class InputLevelWise {

    static class Node{
        int val;
        Node left;
        Node right;
    }

    static Node root = null;

    static Queue<Node> q = new LinkedList<>();

    static Node newNode(int value){
        Node n = new Node();
        n.val = value;
        n.left = null;
        n.right=null;
        return n;

    }

    static void insertValue(int value){
        Node node = newNode(value);
        if(root==null){
            root=node;
        } else if (q.peek().left == null) {
                q.peek().left=node;
        }else{
            q.peek().right = node;
            q.remove();
        }
        q.add(node);
    }


}
// JAVA program to construct a
// binary tree in level
// order.
class GFG{

    static class Node
    {
        int key;
        Node left;
        Node right;
    }

    static Node root = null;

    static Queue<Node> q =
            new LinkedList<>();

    static Node newNode(int value)
    {
        Node n = new Node();
        n.key = value;
        n.left = null;
        n.right = null;
        return n;
    }

    static void insertValue(int value)
    {
        Node node = newNode(value);
        if (root == null)
            root = node;
        else if (q.peek().left == null)
            q.peek().left = node;

        else
        {
            q.peek().right = node;
            q.remove();
        }
        q.add(node);

    }

    static void createTree(int arr[],
                           int n)
    {
        for (int i = 0; i < n; i++)
            insertValue(arr[i]);
    }

    static void levelOrder(Node root)
    {
        if (root == null)
            return;
        Queue<Node> n =
                new LinkedList<>();
        n.add(root);
        while (!n.isEmpty())
        {
            System.out.print(n.peek().key +
                    " ");
            if (n.peek().left != null)
                n.add(n.peek().left);
            if (n.peek().right != null)
                n.add(n.peek().right);
            n.remove();
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30,
                40, 50, 60};
        int n = arr.length;
        createTree(arr, n);
        levelOrder(root);
    }
}

