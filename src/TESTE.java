public class TESTE {

}
class example{
    example(){
        System.out.println("Hello");
    }
}
class MultithreadingDemo extends example implements Runnable{
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

// Main Class
class Demo_getid {
    public static void main(String[] args) {
        int n = 2; // Number of threads
        for (int i = 0; i < n; i++) {
            //MultithreadingDemo object = new MultithreadingDemo();
            //object.start();

            Thread object = new Thread(new MultithreadingDemo());
            object.start();
//            object.start();
        }
    }
}