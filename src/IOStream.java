import java.io.*;

public class IOStream {

    public static void main(String[] args) throws IOException {


        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            out = new FileOutputStream("K:/Codes/dhariasa.txt");
            in = new FileInputStream("K:/Codes/KUSH.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.print((char) c );

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
