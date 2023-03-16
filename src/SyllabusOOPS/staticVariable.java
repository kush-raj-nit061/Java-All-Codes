package SyllabusOOPS;

public class staticVariable {
       static int MESS_FEE = 10000;

       public static void print(){
           System.out.println(MESS_FEE);
       }

    public static void main(String[] args) {
        staticVariable st = new staticVariable();
        System.out.println(MESS_FEE);
//        MESS_FEE = 10;
        System.out.println(st.MESS_FEE);


    }


}
