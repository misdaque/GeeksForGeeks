//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class Node
{
	int data;
	Node next;
	Node bottom;

	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}


class FlattteningLinkedList
{
    Node head;

	void printList(Node node)
    {
        //Node temp = head;
        while (node != null)
        {
            System.out.print(node.data + " ");
            node =node.bottom;
        }
        System.out.println();
    }
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		FlattteningLinkedList list = new FlattteningLinkedList();
		while(t>0)
		{
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++)
				arr[i] = sc.nextInt();

			Node temp = null;
			Node tempB = null;
			Node pre = null;
			Node preB = null;
			int flag=1;
			int flag1=1;
			for(int i=0; i<N;i++)
			{
				int m = arr[i];
				m--;
				int a1 = sc.nextInt();
				temp = new Node(a1);
				if(flag == 1)
				{
					list.head = temp;
					pre = temp;
					flag = 0;
					flag1 = 1;
				}
				else
				{
					pre.next = temp;
					pre = temp;
					flag1 = 1;
				}

				for(int j=0;j<m;j++)
				{
					int a = sc.nextInt();
					tempB = new Node(a);
					if(flag1 == 1)
					{
						temp.bottom = tempB;
						preB = tempB;
						flag1 = 0;
					}
					else
					{
						preB.bottom = tempB;
						preB = tempB;
					}
				}

			}
			//list.printList();
			GfG g = new GfG();
			Node root = g.flatten(list.head);
			list.printList(root);

		t--;
		}
	}
}
// } Driver Code Ends


/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;

	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of
    the flattened linked list. */
class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	    Node head = flattening(root);

	    head = mergeSort(head);

	    return head;

    }

    Node flattening(Node head){
        Node current = head;
        Node last = head;

        while(current != null){
            while(last.bottom != null)
                last = last.bottom;

            if(current.next != null)
                last.bottom = current.next;

            current = current.next;
        }

        return head;
    }

    Node mergeSort(Node head){

        if(head == null || head.bottom == null)
            return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.bottom;

        middle.bottom = null;

        Node list1 = mergeSort(head);
        Node list2 = mergeSort(nextOfMiddle);

        Node flatHead = merge(list1, list2);

        return flatHead;
    }

    Node getMiddle(Node head){
        Node slow = head;
        Node fast = head.bottom;

        while(fast != null && fast.bottom != null){
            slow = slow.bottom;
            fast = fast.bottom.bottom;
        }

        return slow;
    }

    Node merge(Node head1, Node head2){

        Node head = null;
        Node temp = null;

        while(head1 != null && head2 != null){

            Node n = null;

            if(head1.data < head2.data){
                n = head1;
                head1 = head1.bottom;
            }
            else {
                n = head2;
                head2 = head2.bottom;
            }

            n.bottom = null;

            if(head == null){
                head = n;
                temp = n;
            }
            else{
                temp.bottom = n;
                temp = temp.bottom;
            }
        }

        if(head1 != null)
            temp.bottom = head1;

        if(head2 != null)
            temp.bottom = head2;

        return head;
    }
}
