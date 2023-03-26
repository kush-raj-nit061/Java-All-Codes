package BinaryTree1;

import java.util.Scanner;

public class BinaryTreeSum {
    int data;
    BinaryTreeSum left;
    BinaryTreeSum right;

    public static BinaryTreeSum BinaryTreeInput(BinaryTreeSum input){
        Scanner s = new Scanner(System.in);
        if(input == null){
            input = new BinaryTreeSum();
        }
        input.data = s.nextInt();
        if(input.data==-1){
            return null;
        }
        BinaryTreeInput(input.left);
        BinaryTreeInput(input.right);
        return input;
    }

    public static void main(String[] args) {
        BinaryTreeSum test = null;
        test = BinaryTreeSum.BinaryTreeInput(test);
        int sum = test.sum(test);
    }

    public int sum (BinaryTreeSum input){
        if(input.data == -1){
            return 0;
        }
        return input.data+sum(input.left)+sum(input.right);
    }
}
