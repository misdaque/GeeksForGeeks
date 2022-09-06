//This is a concept circular Linked List...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class CircularLinkedListTraversal{
  public static void main(String[] args) throws IOException{
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split(" ");

    CircularLinkedList list = new CircularLinkedList();

    for(String s : input)
      list.insert(Integer.parseInt(s));

    System.out.println("Elements are: ";
    list.show();
    System.out.println();
    System.out.println("Size is : "+list.size());

    
  }
}
