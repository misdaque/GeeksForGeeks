//Follow this link for the question: https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1/?page=1&category[]=Linked%20List&sortBy=submissions


class LinkedList_Intersection
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here

         Node temp1 = head1;
         //Node temp2 = head2;

         while(temp1.next != null){
             temp1 = temp1.next;
         }

         temp1.next = head1;

         Node slow = head2;
         Node fast = head2;

         if(slow.next != null){
            slow = head2.next;
            fast = head2.next.next;
         }

         while(slow != fast
         && fast != null && fast.next != null
         && slow != null && slow.next != null ){
             fast = fast.next.next;
             slow = slow.next;
         }

         if(fast == null || fast.next == null || slow == null || slow.next == null)
            return -1;

         slow = head2;

         while(slow != fast){
             slow = slow.next;
             fast = fast.next;
         }

         return slow.data;
	}
}
