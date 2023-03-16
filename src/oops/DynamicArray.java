package oops;

public class DynamicArray {
    private int arr[];
    private int size;
    public DynamicArray(){
        arr = new int[5];
    }
    public void doubleCapacity(){
        int arr2[] = arr;
        arr = new int[2* arr.length];
        for(int i = 0;i<arr2.length;i++){
            arr[i] = arr2[i];
        }
    }
    public void add(int num){

        if(size>=arr.length){
          doubleCapacity();
        }
        arr[size] = num;
        size++;
    }
    public int size(){
        return size;
    }
    public int get(int i){
        return arr[i];
    }
    public void set(int i,int value){
        for(int j = 0;i>= arr.length; j++){
            doubleCapacity();
        }
        arr[i] = value;
    }
    public boolean isEmpty(){
       if(size ==0){
           return true;
       }else{
           return false;
       }
    }


    public int removeLast(){
        if(isEmpty())
        {
            return -1;
        }
        int temp = arr[size-1];
        arr[size-1] = 0;
        size--;
        return temp;

    }

}

