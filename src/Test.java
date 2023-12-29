import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test<T extends Number> {
    private  T data;
    public Test(T data){
        this.data = data;
    }
    public double square(){
        return data.doubleValue()+ data.doubleValue();
    }

    public static void main(String[] args) {
        Test<Integer> integerTest = new Test<>(5);
//        Test<String> stringTest = new Test<String>("Hello");

        double result1=integerTest.square();

//        double result2= stringTest.square();

    }


}



