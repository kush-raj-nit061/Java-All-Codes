package oops;
public class Student {
    public String name;
    private int roll;
    static int numStudent;
    public Student(int roll, String n){
        name = n;
        this.roll = roll;
        numStudent+=1;
    }
    public Student(int r){
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
