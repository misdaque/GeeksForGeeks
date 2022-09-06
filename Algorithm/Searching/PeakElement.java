//{ Driver Code Starts
import java.util.*;
class PeakElement{
	public static void main(String[] args){
		      int[] arr = new int[]{1, 2, 4, 8, 10, 6};

          int f = peakElement(arr, arr.length);
			    System.out.println(f);
	}

// } Driver Code Ends


/*Complete the function below*/
	public static int peakElement(int[] arr,int n)
    {
       //add code here

       if(n == 1)
        return 1;

        if(n == 2){
            if(arr[0] == arr[1])
                return 0;
            else
                return 1;
        }


       int start = 0;
       int end = n - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid > 0 && mid < n - 1){

                if(arr[mid] > arr[mid -1] && arr[mid] > arr[mid + 1])
                    return 1;

                if(arr[mid + 1] > arr[mid])
                    start = mid + 1;

                else if(arr[mid - 1] > arr[mid])
                    end = mid - 1;

            } else if(mid == n - 1){
                if(arr[n - 1] > arr[n - 2])
                    return 1;
                else
                    return 0;
            } else if (mid == 0){
                if(arr[0] > arr[1])
                    return 1;
                else
                    return 0;
            }
        }

        return n;

    }
  }
