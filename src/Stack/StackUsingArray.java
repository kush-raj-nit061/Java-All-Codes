package Stack;

public class StackUsingArray {
    int arr[], topIndex;

    StackUsingArray(){
        arr= new int[10];
        topIndex = -1;
    }
    public void doubleCapacity(){
        int temp[] = arr;
        arr = new int[2*arr.length];
        for (int i = 0;i< temp.length;i++){
            arr[i] = temp[i];
        }
    }
    public int size(){
        return topIndex+1;
    }
    public boolean isEmpty()  {
        return topIndex==-1;
    }
    public int pop() throws StackEmptyException{
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        int temp = arr[topIndex];
        topIndex--;
        return temp;

    }
    public void push(int elem) throws StackFullException {
        if(topIndex == arr.length-1){
            doubleCapacity();
        }
        arr[++topIndex]= elem;
    }
    public int top()throws StackEmptyException{
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        return arr[topIndex];
    }
}
