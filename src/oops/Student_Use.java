package oops;
class student{
    public String name;
    private int roll;
    static int numStudent;
    public student(int roll, String n){
        name = n;
        this.roll = roll;
        numStudent+=1;
    }
    public student(int r){
        roll = r;
    }
    public void print (){
        System.out.println(name +" " + roll);
    }
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }

}
public class Student_Use {
    public static void main(String[] args) {

        Student s1 = new Student(50,"kush");
        s1.name = "kush";
        s1.setRoll(5);
        System.out.println(s1.getRoll()+s1.name);
        Student s2 = new Student(50,"adi");
        int numStudent = s1.numStudent;
        System.out.println(Student.numStudent);
        s1.print();
    }
}
