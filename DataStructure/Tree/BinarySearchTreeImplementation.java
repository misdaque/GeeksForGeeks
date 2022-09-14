class BinarySearchTreeImplementation{
  Node root = null;

  public void insert(int data){
    root = insertItt(root, data);
  }

  public Node insertRec(Node root, int data){
    Node node = new Node(data);

    if(root == null){
      root = node;
      return root;
    }

    if(data <= root.data)
      root.left = insertRec(root.left, data);
    else
      root.right = insertRec(root.right, data);

    return root;
  }

  public Node insertRecRevision(Node root, int data){

    if(root == null){
      Node node = new Node(data);
      root = node;
      return root;
    }

    if(data < root.data)
      root.left = insertRecRevision(root.left, data);
    else if(data > root.data)
      root.right = insertRecRevision(root.right, data);

    return root;
  }

  public Node insertItt(Node root, int data){
    Node node = new Node(data);

    if(root == null)
      return node;

    Node temp = root;
    Node prev = null;

    while(temp != null){
      prev = temp;

      if(data < temp.data)
        temp = temp.left;
      else if(data > temp.data)
        temp = temp.right;
      else
        return root;
    }

    if(temp == null){
      if(data < prev.data)
        prev.left = node;
      else
        prev.right = node;
    }

    return root;
  }

  public void display(){

    Node temp = root;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.left;
    }

    temp = root.right;

    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.right;
    }
  }

  public void inOrderRec(Node node){
    if(node != null){
      inOrderRec(node.left);
      System.out.print(node.data + " ");
      inOrderRec(node.right);
    }
  }

  public void inOrder(){
    inOrderRec(root);
  }

  public void postOrder(Node node){
    if(node != null){
      System.out.print(node.data + " ");
      postOrder(node.right);
      postOrder(node.left);
    }
  }

  public void preOrder(Node node){
    if(node != null){
      System.out.print(node.data + " ");
      postOrder(node.left);
      postOrder(node.right);
    }
  }

  public void descOrder(){
    descOrder(root);
  }

  private void descOrder(Node node){
    if(node != null){
      descOrder(node.right);
      System.out.print(node.data + " ");
      descOrder(node.left);
    }
  }
}
