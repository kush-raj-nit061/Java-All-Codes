package BinaryTree1;

import java.util.Scanner;

public class TakingInput {


    public static void take_input(BinaryTree_Node<Integer> elem){
        Scanner s = new Scanner(System.in);
        int el = s.nextInt();
        if(el == -1){
            return;
        }

        elem.data = el;

        elem.left = new BinaryTree_Node<>();
        take_input(elem.left);
        elem.right = new BinaryTree_Node<>();
        take_input(elem.right);


    }

    public static int numNodes(BinaryTree_Node<Integer> el){
        if(el == null){
            return 0;
        }

        int leftCount = numNodes(el.left);
        int rightCount = numNodes(el.left);

        return 1+leftCount+rightCount;
    }

//    public static void take_input(BinaryTree_Node <Integer> elem){
//        Scanner s = new Scanner(System.in);
//        int el = s.nextInt();
//        elem.left = new BinaryTree_Node<>();
//        elem.right = new BinaryTree_Node<>();
//        elem.left.data = s.nextInt();
//        elem.right.data = s.nextInt();
//    }

    public static void print(BinaryTree_Node<Integer> root ){
        if(root == null){
            return;
        }
        System.out.print(root.data + ":");
        if(root.left != null){
            System.out.print("L"+root.left.data +",");
        }if(root.right!=null){
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        print(root.left);
        print(root.right);

    }

    public static void main(String[] args) {
        BinaryTree_Node<Integer> n1 = new BinaryTree_Node<>();
        take_input(n1);
        print(n1);
        numNodes(n1);

    }



}

