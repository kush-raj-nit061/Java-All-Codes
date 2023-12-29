package DynamicProgramming;
import java.util.Scanner;
import java.util.Vector;

public class PascalsTriangle {
    static boolean isConsonant(char c) {
        return c == 'b' || c == 'c' || c == 'd';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            if (n == 3) {
                System.out.println(s);
            } else {
                int i = 0;
                Vector<Integer> index = new Vector<>();

                for (int j = 0; j < n - 1; j++) {
                    if (isConsonant(s.charAt(j)) && isConsonant(s.charAt(j + 1))) {
                        index.add(j);
                    }
                }
                int x = 0;
                if (index.size() == 0) {
                    for (int j = 0; j < n; j++) {
                        if (x != 0 && x % 2 == 0 && (x != n - 1 && x != n)) {
                            System.out.print('.');
                        }
                        System.out.print(s.charAt(j));
                        x++;
                    }
                } else {

                    for (int j = 0; j < n; j++) {
                        if (index.size() > x && index.get(x) == j + 2) {
                            System.out.print(s.charAt(j));
                            j++;
                            System.out.print(s.charAt(j));
                            j++;
                            System.out.print(s.charAt(j));
                            System.out.print('.');
                            x++;
                        } else {
                            if (!isConsonant(s.charAt(j)) && j != n - 2 && j != n - 1) {
                                System.out.print(s.charAt(j));
                                System.out.print('.');
                            } else {
                                System.out.print(s.charAt(j));
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}

