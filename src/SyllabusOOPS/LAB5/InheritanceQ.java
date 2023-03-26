package SyllabusOOPS.LAB5;

public class InheritanceQ {
    public static void main(String[] args) {
        area circle= new area(6);
        area triangle= new area(6,8,10);
        area rectangle = new area(5,7);
        area square = new area();
        square.areaSquare(9);

        perimeter circle1 = new perimeter(1);
        perimeter triangle1 = new perimeter(7,8,9);
        perimeter rectangle1 = new perimeter(9,3);
        perimeter square1 = new perimeter();
        square1.perimeterSquare(8);


    }
}

class shape{
    double radius;
    double firstSide;
    double secondSide;
    double thirdSide;
    double length;
    double bredth;
    double side;
    shape(){}
    shape(double r){
        radius=r;
    }
    shape(double side1,double side2,double side3){
        this.firstSide = side1;
        this.secondSide = side2;
        this.thirdSide = side3;

    }
    shape(double length,double bredth){
        this.length = length;
        this.bredth  = bredth;

    }


}

class area extends shape{
    area() {}
    area(double len, double bred) {
        super(len, bred);
        System.out.println(length*bredth);
    }

    area(double rad){
        super(rad);
        System.out.println(3.14*radius*radius);
    }
    area(double side1, double side2,double side3){
        super(side1,side2,side3);
        double s = (firstSide+secondSide+thirdSide)/2.0;
        double a = s*(s-firstSide)*(s-secondSide)*(s-thirdSide);
        double area = Math.sqrt(a);
        System.out.println(area);
    }

    public void areaSquare(double side){
        System.out.println(side*side);
    }


}

class perimeter extends shape{
    perimeter(){}
    perimeter(double len, double bred) {
        super(len,bred);
        System.out.println(2*(length+bredth));
    }

    perimeter(double rad) {
        super(rad);
        System.out.println(2*3.14*rad);
    }
    perimeter(double s1,double s2,double s3){
        super(s1,s2,s3);
        System.out.println(firstSide+secondSide+thirdSide);
    }

    public void perimeterSquare(double side){
        System.out.println(4*side);
    }

}

