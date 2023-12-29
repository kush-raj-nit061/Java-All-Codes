package practice;

public class HandleArithmeticException {

    public static void main(String[] args) {
//        int a = 5/0;
//        System.out.println(a);
        try{
            String b = null;
            int a = 0/0;
            System.out.println(a);
}
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Exception Handled");
//            int c = 10/0;
//            System.out.println(c);
        }

    }
}
