package oops;

public class fraction {
    private int num;
    private int den;

    public fraction(int num,int den){
        this.num = num;
        this.den = den;
    }

    public void print(){
        System.out.println(num + "/" + den);
    }

    public int getNumerator(){
        return num;
    }

    public void setNumerator(int num){
        this.num = num;
    }

    public int getDenominator(){
        return den;
    }

    public void setDenominator(int num){
        this.den = num;
    }

    public void increment(){
        num = num+den;
        System.out.println(num+"/"+den);
    }

}
