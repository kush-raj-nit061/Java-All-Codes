package BinaryTree1;

import java.util.Scanner;

public class TreeTraversals {
    int data;
    TreeTraversals left;
    TreeTraversals right;
    int sum;

    public static void input(TreeTraversals elem){
        Scanner s = new Scanner(System.in);
        int el = s.nextInt();
        if(el == -1){
            return;
        }

        elem.data = el;

        elem.left = new TreeTraversals();
        input(elem.left);
        elem.right = new TreeTraversals();
        input(elem.right);
    }

    public static void main(String[] args) {
       TreeTraversals tree = new TreeTraversals();
       input(tree);
        System.out.println(tree);
        print(tree);
//        int t =tree.sum(tree);
//        System.out.println(t);
    }
    public static void print(TreeTraversals root ){
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
    public int sum (TreeTraversals input){
        if(input.data == -1){
            return 0;
        }
        sum+=sum(input.left);
        sum+=sum(input.right);
        return input.data+sum;
    }
}
