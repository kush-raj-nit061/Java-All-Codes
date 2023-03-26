package practice;

import java.util.Scanner;

public class Codechef_TaxSlabs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int discount;
            int amount = s.nextInt();
            int net = 0;
            if(amount<=250000){
                System.out.println(amount);
            } else if (amount>250000 && amount<=500000) {
                System.out.println(amount-5*(amount-250000)/100);
            } else if (amount>500000 && amount<=750000) {
                System.out.println(amount-12500-10*(amount-500000)/100);
            } else if (amount>750000 &&  amount<=1000000) {
                System.out.println(amount-12500-25000-15*(amount-750000)/100);
            }else if (amount>1000000 &&  amount<=1250000) {
                System.out.println(amount -12500-25000-37500- 20 * (amount-1000000) / 100);
            }
            else if (amount>1250000 &&  amount<=1500000) {
                System.out.println(amount-12500-25000-37500-50000-25*(amount-1250000)/100);
            }else {
                System.out.println(amount-12500-25000-37500-50000-62500-30*(amount-1500000)/100);
            }
        }


    }
}
