package practice;

import java.util.Arrays;
import java.util.Scanner;

public class codeChef1 {



    public class Main {
        static int lcs(char[] X, char[] Y) {
            int m = X.length;
            int n = Y.length;
            int[][] L = new int[m + 1][n + 1];
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i == 0 || j == 0) {
                        L[i][j] = 0;
                    } else if (X[i - 1] == Y[j - 1]) {
                        L[i][j] = L[i - 1][j - 1] + 1;
                    } else {
                        L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                    }
                }
            }
            return L[m][n];
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                int n = in.nextInt();
                String s = in.next();
                char[] X = s.toCharArray();
                char[] Y = new StringBuilder(s).reverse().toString().toCharArray();
                System.out.println((lcs(X, Y)) / 2);
            }
        }




    }}



