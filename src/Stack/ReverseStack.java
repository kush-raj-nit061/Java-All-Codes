package Stack;

import java.util.Stack;

public class ReverseStack {


    public static void reverseStack(Stack <Integer> input, Stack<Integer> edit){

        while(input.size()<=1){
            return;
        }
        int lastElem = input.pop();
        reverseStack(input,edit);
        System.out.println("lastelem" + lastElem);
        while(!input.isEmpty()){
            int top = input.pop();
            edit.push(top);
            System.out.println("top"+top);
        }
        System.out.println("pushed"+lastElem);
        input.push(lastElem);
        while (!edit.isEmpty()){
            int top = edit.pop();
            input.push(top);
        }
//        for (int i = 0;i<=input.size();i++){
//            System.out.println(input.pop());
//        }
    }

    public static void main(String[] args) {
        Stack <Integer> s1 = new Stack<>();
        Stack <Integer> temp = new Stack<>();
        int len=6;
        int arr[] = {1,2,3,4,5,6};
        for(int i = 0;i<len;i++){
            s1.push(arr[i]);
        }

        reverseStack(s1,temp);





    }
}
