//This java program finds the middle node in a linked list
//It uses fast node technique

class FindMiddleNode{
public static void main(String[] args){
      LinkedList list = new LinkedList();

      list.insert(1);
      list.insert(2);
      // list.insert(3);
      // list.insert(4);
      // list.insert(5);
//      list.insert(6);

      //System.out.println(list.findMiddleNode(list.head).data);


//      list.head.next.next.next.next.next = list.head.next;

      list.head.next.next = list.head;

      System.out.println(list.noOfNodesInLoop(list.head));
  }
}
