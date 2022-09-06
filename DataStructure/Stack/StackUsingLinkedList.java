class StackUsingLinkedList implements Stack{

  Node root;

  public void push(int data){
    Node node = new Node(data);

    if(root == null)
      root = node;
    else{
      node.next = root;
      root = node;
    }
  }

  public void show(){

    Node n = root;

    while(n != null){
      System.out.println(n.data);
      n = n.next;
    }
  }

  public int pop(){

    if(root == null)
      return Integer.MIN_VALUE;

    int value = root.data;
    root = root.next;

    return value;
  }

  public int peek(){
    return root.data;
  }
}
