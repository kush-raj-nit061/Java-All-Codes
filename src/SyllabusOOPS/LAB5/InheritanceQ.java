package SyllabusOOPS.LAB5;

public class InheritanceQ {
}

class shape{
    double radius;
    double side1;
    double side2;
    double side3;
    double length;
    double bredth;
    double side;
    shape(){}
    shape(double r){
        radius=r;
    }
    shape(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    shape(double length,double bredth){
        this.length = length;
        this.bredth  = bredth;

    }


}

class area extends shape{
    area() {}
    area(double l, double b) {
        super(l, b);
        System.out.println(l*b);
    }

    area(double r){
        super(r);
        System.out.println(3.14*r*r);
    }
    area(double s1, double s2,double s3){
        super(s1,s2,s3);
        double s = (side1+side2+side3)/2.0;
        double a = s*(s-side1)*(s-side2)*(s-side3);
        double area = Math.sqrt(a);
        System.out.println(area);
    }

    public void areaSq(double side){
        System.out.println(side*side);
    }


}

class perimeter extends shape{
    perimeter(){}
    perimeter(double l, double b) {
        super(l,b);
        System.out.println(2*(length+bredth));
    }

    perimeter(double r) {
        super(r);
        System.out.println(2*3.14*r);
    }
    perimeter(double s1,double s2,double s3){
        super(s1,s2,s3);
        System.out.println(s1+s2+s3);
    }

    public void perSq(double side){
        System.out.println(4*side);
    }

}
class use{
    public static void main(String[] args) {
        area circle= new area(10);
        area triangle= new area(3,4,5);
        area rectangle = new area(10,20);
        area square = new area();
        square.areaSq(5);

        perimeter circle1 = new perimeter(5);
        perimeter triangle1 = new perimeter(5,3,4);
        perimeter rectangle1 = new perimeter(5,4);
        perimeter square1 = new perimeter();
        square1.perSq(5);


    }

}
