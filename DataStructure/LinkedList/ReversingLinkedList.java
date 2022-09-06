//This code will reverse the linked list making head to point to null
//and last element to become head

//https://www.geeksforgeeks.org/reverse-a-linked-list/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReversingLinkedList{

  public static void main(String[] args) throws IOException{

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split(" ");

    LinkedList list = new LinkedList();
    for(String s : input)
      list.insert(Integer.parseInt(s));

    Node previous = null;
    Node current = list.head;
    Node future = null;

    while(current != null){
      future = current.next;
      current.next = previous;
      previous = current;
      current = future;
    }

    list.head = previous;

    list.show();

  }
}
