package SyllabusOOPS;

public class Coding {
    public Coding(){
        System.out.println("I like Java");
    }
    public Coding(String s){
        System.out.println("I like "+ s);
    }
    public Coding(String s, int n){
        int length = s.length();
        System.out.println("Length of String " + length + " " + n );
    }

    public static void main(String[] args) {
        Coding c = new Coding();
        Coding d = new Coding("lets Java");
        Coding e = new Coding("lets Java",10);
    }
}
