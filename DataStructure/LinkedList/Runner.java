//This will contain Runner Class

class Runner{
  public static void main(String[] args){
    LinkedList list = new LinkedList();

    list.insert(10);
    list.insert(20);
    list.insert(14);
    list.insert(25);

  //  list.show();

  //  list.insertAtStart(5);
//    list.insertAt(0,18);
//    list.deleteAt(5);
    System.out.println(list.countNodes());
    list.show();
  }
}
