package SerializationConcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializing {


    public static void main(String[] args) throws IOException {
        Emp emp = new Emp();
        emp.roll = 210;
        emp.name = "kujishas";
        FileOutputStream s = new FileOutputStream("K:/Codes/ObjectSave.txt");
        ObjectOutputStream o = new ObjectOutputStream(s);
        o.writeObject(emp);
        System.out.println("Craeted successfully");
        o.close();

    }
}
