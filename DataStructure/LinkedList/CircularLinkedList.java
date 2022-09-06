class CircularLinkedList{
  Node head;
  int count = 0;

  public void insert(int data){
    Node node = new Node();
    node.data = data;

    if(head == null){
      head = node;
      head.next = head;
    }
    else{
      Node n = head;
      if(head.next == head){
        head.next = node;
        node.next = head;
      }
      else{
        while(n.next != head)
          n = n.next;

        n.next = node;
        node.next = head;
      }
    }
    count++;
  }

  public void show(){

    if(head != null){
      Node n = head;

      do {
        System.out.println(n.data);
        n = n.next;
      } while (n != head);
    }
  }

  public int size(){
    return count;
  }

  public Node lastNode(){
    Node lastNode = head;

    if(lastNode != null){
      do{
        lastNode = lastNode.next;
      }while( lastNode.next != head);
    }
      return lastNode;
  }

  public void makeCircularAt(int index){
      if(head == null !! head.next == head)
        return;

      Node n = head;

      for(int i = 0 ; i < index ; i++){
        n = head.next;
      }

      lastNode().next = n;
  }
}
