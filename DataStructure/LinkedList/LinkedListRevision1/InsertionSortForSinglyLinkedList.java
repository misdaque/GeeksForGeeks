//{ Driver Code Starts
//Initial Template for Java

// https://practice.geeksforgeeks.org/problems/insertion-sort-for-singly-linked-list/1

import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class InsertionSortForSinglyLinkedList
{
    Node head;
    Node tail;
	public void addToTheLast(Node node)
	{
	  if (head == null)
	  {
	   head = node;
	   tail = node;
	  }
	  else
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			InsertionSortForSinglyLinkedList llist = new InsertionSortForSinglyLinkedList();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++)
			{
				int a = sc.nextInt();
				llist.addToTheLast(new Node(a));
			}

        Solution ob = new Solution();
		head = ob.insertionSort(llist.head);
		llist.printList(head);

        t--;
        }
    }}
// } Driver Code Ends


//User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution
{
    public static Node insertionSort(Node head_ref)
    {
        //code here

        Node current = head_ref.next;
        Node prev = head_ref;

        while(current != null){

            if(current.data < prev.data){

                //Isolating the element which has to be sorted

                Node temp = current;
                current = current.next;
                prev.next = current;
                temp.next = null;

                Node n = head_ref;


                //Iterating till we find a suitable position for temp.data till the current element
                while(n != current){

                    if(temp.data < head_ref.data){
                        temp.next = head_ref;
                        head_ref = temp;
                        break;
                    }

                    if(temp.data >= n.data && temp.data < n.next.data){
                        temp.next = n.next;
                        n.next = temp;
                        break;
                    }

                    n = n.next;
                }

            } else {
                current = current.next;
                prev = prev.next;
            }
        }

        return head_ref;
    }
}
