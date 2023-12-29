package practice;

import javax.xml.namespace.QName;

//1.create a class acccount and take four atribute account number ,
// name ,e-mail, and amount which are hidden from the public
// use set and get function to update and display all the account detail.
public class account {
    private String accNo;
     String name;
    private String email;
    private String no;
    private int amount;

    public void get(){
        System.out.println(accNo);
        System.out.println(name);
        System.out.println(email);
        System.out.println(no);
        System.out.println(amount);
    }
    public void set(String accNo,String name,String email,String no,int amount){
        this.accNo = accNo;
        this.name = name;
        this.email = email;
        this.no = no;
        this.amount = amount;
    }
}
class child extends account{
   void method(){
//       accNo = "984671748191919";
       name = "Kush";
   }

}
class use{
    public static void main(String[] args) {
        account ac = new account();
        ac.get();
        ac.set("3245781523789654","kush","kushpvt1@gmail.com","8890498744",5800);
        ac.get();

    }
}
