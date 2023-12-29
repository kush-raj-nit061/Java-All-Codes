import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {

    public static void main(String[] args) throws IOException {
        FileOutputStream f = null;
        FileInputStream f2 = null;
        try{
            f = new FileOutputStream("K:/Codes/ghar.txt");
            f2 =new FileInputStream("K:/Codes/dhari.txt");

        }catch (Exception e){}
        finally {
            int c;
            while ((c = f2.read()) != -1){
                f.write((char) c);
                System.out.print(c);
            }

        }
    }



















//    public static void main(String[] args) throws IOException {
//        FileInputStream f = null;
//        try {
//           f = new FileInputStream("K:/Codes/kush.txt");
//        }catch (Exception e){
//            System.out.println("EXCEPTION");
//        }finally {
//            int c;
//            while ((c = f.read()) !=-1){
//                System.out.print((char) c);
//            }
//            f.close();
//
//        }
//
//
//    }
}
