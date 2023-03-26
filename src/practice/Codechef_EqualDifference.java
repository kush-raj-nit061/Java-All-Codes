package practice;

import java.util.Scanner;

public class Codechef_EqualDifference {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            String s1="";
            String s2="";
            String s3="";
            for(int i = 0;i<a;i++){
               s1 = s1.concat("a");
            }
            for(int i = 0;i<b;i++){
               s2= s2.concat("b");
            }
            if(a%2==1 && b%2==1 ){
                System.out.println("-1");
            } else if (a%2 == 0 && b%2 == 1) {
                if(b==1){
                    System.out.println("-1");
                }else{
                    System.out.print(s1.substring(0,s1.length()/2));
                    System.out.print(s2);
                    System.out.println(s1.substring(s1.length()/2));
                    if(a>b){

                    }
                }
            } else if (a%2 == 1 && b%2 == 0) {
                if(a==1){
                    System.out.println("-1");
                }
            }
        }
    }

}
