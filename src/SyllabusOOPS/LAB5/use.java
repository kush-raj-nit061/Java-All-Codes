package SyllabusOOPS.LAB5;

import java.util.Scanner;

class Retail_Store {
    int customerId=1000;
    String card;
    float discount;
    Retail_Store(String card){
        this.card = card;
    }
    Retail_Store(float dis){
        this.discount = dis;
    }
    Retail_Store(){
        customerId++;
    }
    public void printInfo(){
        System.out.println("Customer ID" + customerId);
    }
    public void setMemCard(String card){}

}
class Regular_Customer extends Retail_Store{
    float discount;
    Regular_Customer(float discount){
        this.discount = discount;
    }
    public void printInfo(){
        System.out.println("Customer ID " + customerId);
        System.out.println("Discount "+ discount);
    }
}
class PrevillegedCustomer extends Retail_Store{
    String memCard;
    PrevillegedCustomer(String memCard){
        this.memCard = memCard;
    }
    public void setMemCard(String card){
        memCard = card;
    }
    public void printInfo(){
        System.out.println("Customer ID " + customerId);
        System.out.println("Membership Type "+ memCard);
    }
}
public class use{
    public static void main(String[] args) {
        Retail_Store customer1 = null;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter customer type:");
        String sc = s.next();
        if(sc.equalsIgnoreCase("Regular")){
            customer1 = new Regular_Customer(2);
            customer1.printInfo();
        } else if (sc.equalsIgnoreCase("Previllaged")) {
            customer1 = new PrevillegedCustomer("Gold");
            customer1.printInfo();
        }else {
            customer1 = new Retail_Store();
            customer1.printInfo();
        }
    }
}
