package practice;

import java.util.Scanner;

public class Codechef_NameReduction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            String A = s.next();
            String B = s.next();
            String c = A.concat(B);
            Boolean b = true;
            int noOfKids = s.nextInt();
            String a[] = new String[noOfKids];
            for(int i = 0;i<noOfKids;i++){
                a[i] = s.next();
            }
            String C = "";
            for(int i = 0;i<noOfKids;i++){
                C += C.concat(a[i]);
            }
            for(int i = 0;i<C.length()-1;i++){

                if(!c.contains(String.valueOf(C.charAt(i))) ){
                    b = false;
                }
            }
            if(b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
