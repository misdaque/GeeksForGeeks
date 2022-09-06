//{ Driver Code Starts
//Initial Template for Java

// https://practice.geeksforgeeks.org/problems/sort-a-linked-list/1

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class MergeSortInLinkedList
{

    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }

		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here

        if(head == null || head.next == null)
            return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        Node sortedList = sort(left, right);

        return sortedList;

    }

    static Node getMiddle(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static Node sort(Node head1, Node head2){
        Node sh = null;
        Node temp = null;

        while(head1 != null && head2 != null){
            Node n = null;

            if(head2.data < head1.data){
                n = head2;
                head2 = head2.next;

            }else{
                n = head1;
                head1 = head1.next;
            }
            n.next = null;

            if(sh == null){
                sh = n;
                temp = n;
            } else {
                temp.next = n;
                temp = temp.next;
            }
        }

        if(head1 != null)
            temp.next = head1;

        if(head2 != null)
            temp.next = head2;

/*        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }*/

        return sh;
    }
}
