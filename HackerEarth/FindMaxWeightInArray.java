//Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/max-difference-3-a5f48242/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class findMaxWeightInArray {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testCases = br.readLine();

        int no = Integer.parseInt(testCases.trim());

        while(no > 0){

        String length = br.readLine();
        String name = br.readLine();

        String[] input = name.trim().split(" ");

        int[] arr = new int[input.length];

        for(int i = 0 ; i < input.length ; i++)
            arr[i] = Integer.parseInt(input[i]);

        int maxIndex = findMax(arr);
        int minIndex = findMin(arr);

        if(input.length > 2){

            int[] s2 = new int[arr.length - 2];

            for(int i = 0, j = 0 ; i < arr.length && j < s2.length; i++){
                if(i != maxIndex && i != minIndex)
                    s2[j++] = arr[i];
            }

            int max2 = findMax(s2);
            int min2 = findMin(s2);

            System.out.println((arr[maxIndex] - arr[minIndex]) + (s2[max2] - s2[min2]));


        } else {
            System.out.println(arr[maxIndex] - arr[minIndex]);
        }
        no--;
        }

    }

    private static int findMax(int[] arr){
        int max = arr[0];
        int indexMax = 0;

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                indexMax = i;
            }
        }

        return indexMax;
    }

    private static int findMin(int[] arr){
        int min = arr[0];
        int indexMin = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                indexMin = i;
            }
        }

        return indexMin;
    }
}
