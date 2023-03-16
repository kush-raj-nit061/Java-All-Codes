package SyllabusOOPS.Lab4;

/*Write a java program to create a array list named as student that contains names of six students.
        perform the following operations

        1}  Add the name of one of your friend at position determine as

        a) if the last character of the name is consonent then the position is last
        b) if the last character of the name is vowel then the position is same as the position of character in the vowel list.

        2} To display the name as odd position in the list

        3}preform set(), remove(), sort() function */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array {

    public void oddName(ArrayList<String> arrayList ){
        int k = arrayList.size();
        int l = 1;
        while (k>l){
            System.out.print(arrayList.get(l) + " ");
            l+=2;
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList <String> arr = new ArrayList<>();
        arr.add("Vaibhav");
        arr.add("Viswajeet");
        arr.add("Aditya");
        arr.add("Ayush");
        arr.add("Praveen");
        arr.add("Manish");

        String name =s.next();
        boolean isVowel = false;

        int listSize = arr.size();
        int last = name.length()-1;
        char ch = name.charAt(last);
        switch(ch)
        {
            case 'a' :
                arr.add(0,name);
                isVowel= true;
                break;

            case 'e' :
                arr.add(1,name);

                isVowel = true;
                break;
            case 'i' :
                arr.add(2,name);

                isVowel = true;
                break;
            case 'o' :
                arr.add(3,name);

                isVowel = true;
                break;
            case 'u' :
                arr.add(4,name);
                isVowel = true;
                break;
        }
        if(isVowel != true){
            arr.add(listSize,name);
        }

        System.out.print(arr);
        System.out.println();

        Array array = new Array();
        array.oddName(arr);
        System.out.println();



        arr.set(0,"kush");
        System.out.print(arr);
        System.out.println();



        arr.remove(0);
        System.out.print(arr);
        System.out.println();



        Collections.sort(arr);
        System.out.print(arr);




    }

}
