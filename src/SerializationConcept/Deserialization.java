package SerializationConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Emp implements Serializable {
    int roll;
    String name;
}


public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Emp e = null;
        FileInputStream f = new FileInputStream("K:/Codes/ObjectSave.txt");
        ObjectInputStream o = new ObjectInputStream(f);
        e = (Emp) o.readObject();
        f.close();
        o.close();

        System.out.println(e.name);
        System.out.println(e.roll);
    }
}
