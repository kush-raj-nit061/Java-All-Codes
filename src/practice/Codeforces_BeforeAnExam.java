package practice;

import java.util.Scanner;

public class Codeforces_BeforeAnExam {
    public static void main(String[] args){



        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int sumHours = s.nextInt();
        int dummy=0;
        for(int i = 0;i<t;i++){
            int mintime = s.nextInt();
            int maxtime = s.nextInt();
            dummy += maxtime;
        }

        if(dummy >= sumHours){
            System.out.println("YES");
        }


















    }
}
