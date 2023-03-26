package practice;

import java.util.Arrays;
import java.util.Scanner;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class fastscanners
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String next()
    {
        while(st==null || !st.hasMoreTokens())
        {
            try{

                st=new StringTokenizer(br.readLine());
            }
            catch(IOException e){}
        }
        return st.nextToken();
    }
    int nextInt()
    {
        return Integer.parseInt(next());
    }
    float nextFloat()
    {
        return Float.parseFloat(next());
    }
    long nextLong()
    {
        return Long.parseLong(next());
    }
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
    String nextLine()
    {
        String s="";
        try{
            s=br.readLine();
        }
        catch(IOException e){}
        return s;
    }
}

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef_MightyFriend
{

    public static void main(String[] args) {
        fastscanner s=new fastscanner();
        PrintWriter w=new PrintWriter(System.out);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int swap = s.nextInt();
            int a[] = new int[n];
            int a1[];
            int a2[];
            int sum1=0;
            int sum2 = 0;
            if(n%2 == 0){
                a1 = new int[n/2];
            }else{
                a1 = new int[n/2+1];
            }
            a2 = new int[n/2];

            for(int i = 0;i<n;i++){
                a[i] = s.nextInt();
            }
            int k = 0;
            for(int i = 0;i<a1.length;i++){
                a1[i] = a[k];
                k+=2;

            }
            k=1;
            for(int i = 0;i<a2.length;i++){
                a2[i] = a[k];
                k+=2;

            }

            Arrays.sort(a1);
            Arrays.sort(a2);

            for (int i = 0;i<swap;i++){
                int temp = a1[a1.length-1-i];
                a1[a1.length-1-i] = a2[i];
                a2[i] = temp;
            }
            for(int i = 0;i<a1.length;i++){
                sum1 +=a1[i];
            }

            for(int i = 0;i<a2.length;i++){
                sum2 += a2[i];
            }


            if(sum2>sum1){
                w.println("YES");
            }else{
                w.println("NO");
            }
        }
        w.flush();
    }

}

