package SyllabusOOPS.LAB5;

import java.util.Scanner;

public class RetailStore {
//    final int ID1 = 1001;//ID of silver membership
//    final int ID2 = 1002;//ID of gold membership
//    final int ID3 = 1003;//ID of platinum membership
    int id;
    String name;
    double billingAmount;

}

class RegularCustomer extends RetailStore{
    double billingAmount;
    static final double discount = 10;
    public static void finalPrice(double billingAmount){
        double price = billingAmount-(discount/100*billingAmount);
        System.out.println("Final Amount is " + price);
    }


}

class PrevilegedCustomer extends RetailStore{
    int id;


    public static void gifts(int id){

        System.out.println();

        switch (id){
            case 1001 :
                System.out.println("CONGRATULATIONS YOU HAVE WON A Free GIFT HAMPER");
                break;

            case 1002 :
                System.out.println("CONGRATULATIONS YOU HAVE WON A CADBURY CELEBRATION PACK");
                break;
            case 1003 :
                System.out.println("CONGRATULATIONS YOU HAVE WON A SHOPPING GIFT CARD WORTH 500🤷‍♂");
                break;

        }
    }

}
class MAIN{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        RetailStore n1 = new RetailStore();
        n1.id = s.nextInt();
        if(n1.id == 0){
            n1 = new RegularCustomer();
            n1.billingAmount = s.nextDouble();
            RegularCustomer.finalPrice(n1.billingAmount);
        } else if (n1.id==1001) {
            n1 = new PrevilegedCustomer();
            n1.id = 1001;
            PrevilegedCustomer.gifts(n1.id);
        }else if (n1.id==1002) {
            n1 = new PrevilegedCustomer();
            n1.id = 1002;
            PrevilegedCustomer.gifts(n1.id);
        }else if (n1.id==1003) {

            n1 = new PrevilegedCustomer();
            n1.id = 1003;
            PrevilegedCustomer.gifts(n1.id);
        }


    }
}


