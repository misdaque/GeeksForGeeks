/*
  This code contains code to merge two arrays in a new array.
  The given two arrays are already sorted.
  It will create a new array.

  This won't sort the same array but the concept will be used in mergeSort

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class MergeUsingNewArray{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String size = br.readLine().trim();

    int n = Integer.parseInt(size.split(" ")[0]);
    int m = Integer.parseInt(size.split(" ")[1]);

    int[] a = new int[n];
    int[] b = new int[m];

    String[] inpt = br.readLine().trim().split(" ");

    for(int i = 0 ; i < n ; i++)
      a[i] = Integer.parseInt(inpt[i]);

    inpt = br.readLine().trim().split(" ");

    for(int i = 0 ; i < m ; i++)
      b[i] = Integer.parseInt(inpt[i]);

    int[] c = new int[n + m];

    int i = 0 , j = 0 , k = 0;

    while(i < n && j < m){
      if(a[i] < b[j])
        c[k++] = a[i++];
      else
        c[k++] = b[j++];
    }

    for( ; i < n ; i++)
      c[k++] = a[i];

    for( ; j < m ; j++)
      c[k++] = b[j];

    for(int l : c)
      System.out.print(l + " ");

  }
}
