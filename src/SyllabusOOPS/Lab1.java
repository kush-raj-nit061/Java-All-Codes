package SyllabusOOPS;

import java.lang.*;
import java.util.Random;
//public class Lab2{
//    int number = 2102061;
//}


public class Lab1 {

    public void main(){
        int id = 2102061;
    }

    String name = "Kush";
    public static void main(String[] args) {
//
        int length = 12; // Length of the random string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz"; // Characters to choose from
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            randomString.append(randomChar);
        }

        System.out.println(randomString.toString());

    }




}
