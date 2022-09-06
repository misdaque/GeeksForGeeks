//This is the place where all action happens

class LinkedList{
  Node head;

  public void insert(int data){

    Node node = new Node();
    node.data = data;

    if(head == null)
      head = node;
    else{
      Node n = head;

      while(n.next != null){
        n = n.next;
      }
      n.next = node;
    }
  }

  public void show(){
    Node node = head;

    while(node != null){
      System.out.println(node.data);
      node = node.next;
    }

  //  System.out.println(node.data);
  }

  public void insertAtStart(int data){
    Node node = new Node();
    node.data = data;
    node.next = null;

    if(head == null)
      head = node;
    else{
      node.next = head;
      head = node;
    }
  }

  public void insertAt(int index, int data){
    if(index == 0){
        insertAtStart(data);
        return;
    }
    Node node = new Node();
    node.data = data;
    node.next = null;

    Node n = head;
    for(int i = 1 ; i < index; i++){
      n = n.next;
    }
    node.next = n.next;
    n.next = node;
  }

  public void deleteAt(int index){
    if(index == 0 ){
      head = head.next;
      return;
    }
    Node n = head;
    Node n1 = null;
    for(int i = 1 ; i < index ; i++){
      n = n.next;
      if(n.next == null) return;
    }
    n1 = n.next;
    n.next = n1.next;
    n1 = null;
  }

  public int countNodes(){
    Node n = head;

    int count = 0;
    while(n != null){
      count++;
      n = n.next;
    }
    return count;
  }

  public Node findMiddleNode(Node head){
    Node slowNode = head, fastNode = head;

    if(slowNode.next == null)
      return slowNode;

    while(true){

      if(fastNode == null || fastNode.next == null)
        return slowNode;

      slowNode = slowNode.next;

      fastNode = fastNode.next.next;
    }
  }

  public boolean isLoopPresent(Node head){
    if(head.next == null)
      return false;

    Node slowNode = head, fastNode = head;

    while(true){
      slowNode = slowNode.next;
      fastNode = fastNode.next.next;

      if(fastNode == null || fastNode.next == null)
        return false;

      if(fastNode == slowNode)
        return true;
    }
  }

  public int noOfNodesInLoop(Node head){
    int count = 0;

    if(head.next == null)
      return count;

    Node slowNode = head, fastNode = head;

    while(true){
      slowNode = slowNode.next;
      fastNode = fastNode.next.next;

      count++;

      if(fastNode == null || fastNode.next == null)
        return 0;

      if(fastNode == slowNode)
        return count(slowNode);

    }
  }

  private int count(Node temp){
        Node n = temp;

        int count = 1;

        while(n.next != temp){
            count++;
            n = n.next;
        }
        return count;
    }
}
