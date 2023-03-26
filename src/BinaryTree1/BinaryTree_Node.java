package BinaryTree1;




public class BinaryTree_Node<T> {

    int data;
    BinaryTree_Node<T> left;
    BinaryTree_Node<T> right;

    BinaryTree_Node(int elem){
        this.data = elem;
    }
    BinaryTree_Node(){}
}
class Use{

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
        BinaryTree_Node<Integer> n1 = new BinaryTree_Node<>(1);
        BinaryTree_Node<Integer> n2 = new BinaryTree_Node<>(2);
        BinaryTree_Node<Integer> n3 = new BinaryTree_Node<>(3);
        BinaryTree_Node<Integer> n4 = new BinaryTree_Node<>(4);
        BinaryTree_Node<Integer> n5 = new BinaryTree_Node<>(5);

        n1.left= n2;
        n1.right= n3;
        n2.right = n4;
        n3.left= n5;

        print(n1);



    }

}
