//Url: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/equal-operation-2-95be3ed1/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class EqualOperation {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while(T > 0){
            int N = Integer.parseInt(br.readLine().trim());

            if(N <= 1){
                System.out.println("0");
                return;
            }

            String[] input = br.readLine().trim().split(" ");

            int[] arr = new int[N];

            for(int i = 0 ; i < N; i++)
                arr[i] = Integer.parseInt(input[i]);

            int gcd = findGCD(arr[0], arr[1]);

            for(int i = 2; i < N; i++)
                gcd = findGCD(gcd, arr[i]);

            long count = 0;

            for(int i = 0; i < N; i++){
                count += (long)(arr[i] / gcd) - 1;
            }

            System.out.println(count);
            T--;
        }
    }

    private static int findGCD(int num1, int num2){

        if(num2 == 0)
            return num1;

        return findGCD(num2, num1%num2);
    }
}
