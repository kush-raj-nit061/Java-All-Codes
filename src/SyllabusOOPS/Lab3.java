package SyllabusOOPS;

import java.util.Scanner;

public class Lab3 {
    public void header(char c){
        for(int i = 0;i<50;i++) {
            System.out.print(c);
        }
    }
    public void header(String s){
        System.out.println(s);
    }
    public void header(char c,int n){
        for(int i = 0;i<n;i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Lab3 header = new Lab3();
        header.header(s.next().charAt(0));
        header.header(s.next());
        header.header(s.next().charAt(0),s.nextInt());
    }


}
