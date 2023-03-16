package SyllabusOOPS;
//
//import oops.Student;
//
//public class Lab2 {
//    // Program 1------
//
//
////    String name;
////    int rollNo;
////    Lab2(String a ,int b){
////        name = a;
////        rollNo = b;
////
////    }
////
////    public static void main(String[] args) {
////        Lab2 student = new Lab2("Kush", 61);
////    }
//
//
//    // Program 2------
//
//    String name;
//    int rollNo;
//
//    public void Student(){
//        int roll=61;
//        String Name="Kush";
//        System.out.println(roll);
//        System.out.println(Name);
//    }
//
//    public static void main(String[] args) {
//
//        Lab2 student = new Lab2();
//        student.Student();
////        System.out.println(student.rollNo+" "+student.name);
//        int rollNo;
//        int Name;
////        System.out.println(rollNo," ",Name);
//    }
////}


// Program 3------
public class Lab2 implements Cloneable {

    int data1;
    int data2;

    public static void main(String[] args) throws CloneNotSupportedException {
        Lab2 obj1 = new Lab2();
        obj1.data1 = 10;
        obj1.data2 = 20;
        System.out.println(obj1.data1 + " " + obj1.data2);

        Lab2 obj2 = (Lab2) obj1.clone();
        System.out.println(obj2.data1 + " " + obj2.data2);




    }
}











//
//// Program 4------
//
////    public static void main(String[] args) {
////        for(int i = 0;i<4;i++){
////            for(int j = 0;j<=i;j++) {
////                System.out.print("* ");
////            }
////            System.out.println();
////        }
////    }
//

////        }
//
//}