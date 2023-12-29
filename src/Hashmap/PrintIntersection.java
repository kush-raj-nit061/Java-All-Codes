package Hashmap;

import java.util.*;

public class PrintIntersection {

    public static Map<Integer, Integer> printIntersection(int[] arr1, int[] arr2){
        Scanner  s = new Scanner(System.in);
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        Map<Integer,Integer> map3 = new HashMap<>();
        Map<Integer,Integer> map4 = new HashMap<>();
        Map<Integer,Integer> map5 = new HashMap<>();
        for(int i =0;i<arr2.length;i++){

            map2.put(i,arr2[i]);

        }
        for(int i =0;i< arr1.length;i++){
            map1.put(i,arr1[i]);


        }
        int less = Math.min(arr2.length,arr1.length);
        int arrsmall[] = new int[less];
        if(map1.size() == less){
            map3 = map1;
            map4 = map2;
            arrsmall = arr1;
        }else{
            map3 = map2;
            map4= map1;
            arrsmall = arr2;
        }
        int j = 1;


        for(int i = 0;i<less;i++){
            if(map4.containsValue(arrsmall[i])){
                map5.put(j,arrsmall[i]);
                j++;
            }


        }






        return map5;

    }


    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int n1 = s.nextInt();
        int arr1[] = new int[n1];
        for(int i =0;i<n1;i++){

            arr1[i] = s.nextInt();
        }
        int n2 = s.nextInt();
        int arr2[] = new int[n2];

        for(int i =0;i<n2;i++){
            arr2[i] = s.nextInt();

        }
        Map<Integer,Integer> map = printIntersection(arr1,arr2);
        int arr[] = new int[map.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = map.get(i+1);
        }
        Arrays.sort(arr);
        for(int s1 : arr){
            System.out.println(s1);
        }


    }
}
