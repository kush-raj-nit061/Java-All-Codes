package practice;

import java.util.Scanner;

public class Codechef_ChefAndDigit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            String s1 = s.next();
            int counto = 0;
            int count_One = 0;
            for(int i = 0;i<s1.length();i++){
                if(s1.charAt(i) == '0'){
                    counto +=1;
                }else{
                    count_One +=1;
                }
            }
            if(counto ==1 || count_One ==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
