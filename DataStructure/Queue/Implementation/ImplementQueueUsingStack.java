import java.util.Stack;
import java.util.Queue;

class ImplementQueueUsingStack{

  Stack<Integer> s1 = new Stack<>();
  Stack<Integer> s2 = new Stack<>();

  public static void main(String[] args) {
      ImplementQueueUsingStack q1 = new ImplementQueueUsingStack();

      // q1.offer(10);
      // q1.offer(20);
      // q1.offer(30);

      q1.show();

      System.out.println("Element Polled is " + q1.poll());

      q1.show();

      System.out.println("Head Element is " + q1.peek());
  }

  public void offer(int data){
    s1.push(data);
  }

  public int poll(){

    if(s1.isEmpty())
      return -1;

    while(!s1.isEmpty()){
      s2.push(s1.pop());
    }

    int data = s2.pop();

    while(!s2.isEmpty())
      s1.push(s2.pop());

    return data;
  }

  public int peek(){
    if(s1.isEmpty())
      return -1;

    while(!s1.isEmpty()){
      s2.push(s1.pop());
    }

    int data = s2.peek();

    while(!s2.isEmpty())
      s1.push(s2.pop());

    return data;
  }

  public void show(){
    if(s1.isEmpty())
      System.out.println("Queue is Empty");

    while(!s1.isEmpty()){
      s2.push(s1.pop());
    }

    System.out.print("Data in the Queue is: ");

    while(!s2.isEmpty()){
      System.out.print(s2.peek() + " ");
      s1.push(s2.pop());
    }
    System.out.println();
  }
}
