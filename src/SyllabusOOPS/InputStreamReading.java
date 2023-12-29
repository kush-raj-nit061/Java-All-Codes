package SyllabusOOPS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReading {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = new InputStreamReader(System.in);
        FileOutputStream f = new FileOutputStream("K:/Codes/char.txt");
        FileInputStream r = new FileInputStream("K:/Codes/char.txt");
        char c ;
        do {
            c = (char) cin.read();
            f.write(c);
        } while(c != 'q');

        char ca;

        while (r.read()!=-1){
            ca=(char) r.read();
            System.out.print(ca);
        }
    }
}
