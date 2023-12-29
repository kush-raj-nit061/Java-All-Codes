package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumFrequencyNumber {

    public static int maxfreq(int arr[] ){
        Map<Integer,Integer> map = new HashMap<>();
        int key = arr[0];
        int max = 1;
        for (int j : arr) {

            if (map.containsKey(j)) {
                int value = map.get(j);
                map.put(j, value + 1);
                if(value+1>max){
                    key = j;
                    max=value+1;
                }
            } else {
                map.put(j, 1);
            }

        }

        return key;



    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();

        }
        int a = maxfreq(arr);
        System.out.println(a);


    }



}
