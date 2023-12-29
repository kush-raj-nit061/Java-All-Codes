package DynamicProgramming;

public class Fibonacci {
    public static void printFibonacci(int n) {
        int prev = 1;
        int prev2 = 0;
        int curr;
        System.out.println(prev2);
        System.out.println(prev);

        for(int i = 2;i<=n;i++){
            curr=prev+prev2;
            System.out.println(curr);
            prev2=prev;
            prev = curr;
        }

    }

    public static void main(String[] args) {
        printFibonacci(5);
    }
}
