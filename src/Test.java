import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char arr[][][] =new char[2][][];
        arr[0] = new char[3][];
        arr[1] = new char[2][];
        arr[0][0] =new char[2];
        arr[0][1] =new char[3];
        arr[0][2] =new char[5];
        arr[1][0]=new char[2];
        arr[1][1]=new char[4];



        for (int a = 0;a<arr.length;a++){
            for (int b= 0;b<arr[a].length;b++){
                for(int c = 0;c<arr[a][b].length;c++){
                    arr[a][b][c]= s.next().charAt(0);

                }
            }

        }
        for (int a = 0;a<arr.length;a++){
            for (int b= 0;b<arr[a].length;b++){
                for(int c = 0;c<arr[a][b].length;c++){
                    System.out.print(arr[a][b][c]);
                }
                System.out.print(" ");
            }

        }

    }
}







