// This is an example to Quick sort
// Video can be found at this link: https://www.youtube.com/watch?v=h8eyY7dIiN4

import java.util.Random;

class QuickSort{
  public static void main(String[] args){
    Random rand = new Random();

    int[] arr = new int[10];

    System.out.print("Array before Sorting: ");
    for(int i = 0 ; i < arr.length ; i++){
      arr[i] = rand.nextInt(100);
      System.out.print(arr[i] + ", ");
    }

    System.out.println();

    quickSort(arr, 0, arr.length - 1);

    System.out.print("After Sorting: ");
    for(int i : arr)
      System.out.print(i + ", ");

  }

  private static void quickSort(int[] arr, int lowIndex, int highIndex){
    if(lowIndex >= highIndex)
      return;

    int pivot = arr[highIndex];

    int leftPointer = lowIndex;
    int rightPointer = highIndex;

    while(leftPointer < rightPointer){

      while(arr[leftPointer] <= pivot && leftPointer < rightPointer)
        leftPointer++;

      while(arr[rightPointer] >= pivot && leftPointer < rightPointer)
        rightPointer--;

      swap(arr, leftPointer, rightPointer);

    }

    swap(arr, leftPointer, highIndex);

    quickSort(arr, lowIndex, leftPointer - 1);
    quickSort(arr, leftPointer + 1, highIndex);
  }

  private static void swap(int[] arr, int leftIndex,int rightIndex){
    int temp = arr[leftIndex];
    arr[leftIndex] = arr[rightIndex];
    arr[rightIndex] = temp;
  }
}
