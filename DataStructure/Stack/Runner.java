class Runner{
  public static void main(String[] args){
    Stack stack = new StackUsingLinkedList();

    stack.push(2);
    stack.push(4);
    stack.push(5);

  //  stack.show();
//    stack.pop();

//    stack.show();
 //   System.out.println(stack.pop());
//    stack.pop();
    System.out.println(stack.peek());
  }
}
