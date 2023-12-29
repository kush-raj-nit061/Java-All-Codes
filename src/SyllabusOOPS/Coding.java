package SyllabusOOPS;

public class Coding {
}



//    public static void main(String[] args){
//        int a = 10/0;
//        try {
//            int a=10/0;
//        }catch (Exception e){
//            System.out.println(e);
//        }



//        System.out.println(a);
//        System.out.println("nAAME");
//        String s = "   PNI   TQ  ";
//        System.out.println(s);
//
//        System.out.println(s.trim());
//        ?

////        String s2 = "NIT";
//        String s2 = new String("NIT");
////        s2 = "Patna";
//        System.out.println(s==s2);

//        System.out.println(s.equals(s2));
//        Animals d = new Dog();
//        d.show();

//    }
//}

class Animals{
    int id = 10;
    String color = "Default";
    void show(){
        System.out.println(color);
    }

}
class Dog extends Animals{
    int id = 20;
    String color = "Black";
    final void show(){
        String s = "kush";
        System.out.println(color);
    }
}
class Test{
    public static void main(String[] args) {
        Animals a = new Dog();
        System.out.println(a.id);
        a.show();
        System.out.println(a.color);
    }
}