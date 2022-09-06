
class LinkedList{
    Node head;

    public void insert(int data){
      Node newNode = new Node(data);

      if(head == null)
        head = newNode;
      else{
        Node node = head;

        while(node.next != null){
          node = node.next;
        }

        node.next = newNode;
      }

    }

    public void show(){
      if(head == null)
        System.out.println("List is Empty");
      else{

        Node node = head;

        while(node != null ){
          System.out.println(node.data);
          node = node.next;
        }
      }
    }

    public void delete(int data){
      if(head == null){
        System.out.println("Nothing to delete");
        return;
      }
      Node temp = head;
      if(head.data == data){
        head = head.next;
        temp.next = null;
        return;
      }
      Node prev = null;
      while(temp != null && temp.data != data){
        prev = temp;
        temp = temp.next;
      }

      if(temp != null){
        prev.next = temp.next;
        temp.next = null;
      }
    }

    public void deleteAt(int index){
      if(index >= countNodes()){
        System.out.println("Index Out of Bounds");
        return;
      }

      Node temp = head;
      Node prev = null;
      while(index > 0){
          prev = temp;
          temp = temp.next;
          index--;
      }
      prev.next = temp.next;
      temp = null;
    }

    public void deleteAll(){
      head = null;
    }

    public int countNodes(){
      Node temp = head;
      int count = 0;

      while(temp != null){
        count++;

        temp = temp.next;
      }
      return count;
    }

    public boolean find(int data){
      Node temp = head;

      while(temp != null){

         if(temp.data == data)
          return true;

         temp = temp.next;
      }

      return false;
    }

    public int get(int index){
      Node temp = head;

      while(index > 0){
        temp = temp.next;
        index--;
      }

      return temp.data;
    }

    public int findMid(){
      Node fast = head;
      Node slow = head;

      while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
      }

      return slow.data;
    }

    public void reverse(){

      Node prev = null;
      Node next = head;
      Node current = head;

      while(current != null){
        next = current.next;

        current.next = prev;
        prev = current;
        current = next;
      }

      head = prev;
    }

    public void reverseOdd(){

    }

    public Node findMidNode(){
      Node slow = head;
      Node fast = head;

      while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }

      return slow;
    }

    public boolean isPalindrome(){
      Node slow = head;
      Node fast = head;

      while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }

      Node midNode = slow;

      boolean isOdd = true;

      if(fast == null)
        isOdd = false;

      System.out.println("Is Odd? " +isOdd);

      System.out.println("Palindrome? " +checkPalindromeIfOdd(midNode));

      return true;
    }

    private boolean checkPalindromeIfOdd(Node midNode){
        Node prev = midNode;
        Node next = midNode.next;
        Node current = midNode.next;

        //To reverse half List
        while(current != null){
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
        }

        Node temp2 = prev;
        Node temp = head;

        boolean isPalindrome = true;

        while(temp != midNode){
          if(temp.data != temp2.data)
            isPalindrome = false;

          temp = temp.next;
          temp2 = temp2.next;
        }

        current = prev;
        prev = null;
        next = current;

        //To resverse back the remaining half
        while(current != midNode){
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
        }

        return isPalindrome;
    }

    public boolean checkPalindromeIfEven(Node midNode){
      Node prev = null;
      Node next = midNode;
      Node current = midNode;

      while(current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }

      Node temp = head;
      Node temp2 = prev;

      boolean isPalindrome = true;

      while(temp != midNode){
        if(temp.data != temp2.data){
            isPalindrome = false;
            break;
        }

        temp = temp.next;
        temp2 = temp2.next;
      }

      current = prev;
      next = current;
      prev = null;

      while(current != midNode){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }

      return isPalindrome;
    }


}
