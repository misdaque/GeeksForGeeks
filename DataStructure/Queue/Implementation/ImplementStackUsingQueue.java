import java.util.Queue;
import java.util.ArrayDeque;

class ImplementStackUsingQueue{

  Queue<Integer> q1 = new ArrayDeque<>();
  Queue<Integer> q2 = new ArrayDeque<>();

  public static void main(String[] args) {
    ImplementStackUsingQueue s = new ImplementStackUsingQueue();

    s.push(10);
    s.push(20);
    s.push(30);

    s.show();

    System.out.println("Peek: " + s.peek());

    //s.pop();

    s.show();
  }

  public void push(int data){
    while(!q1.isEmpty())
      q2.offer(q1.poll());

    q1.offer(data);

    while(!q2.isEmpty())
      q1.offer(q2.poll());
  }

  public int pop(){

    return q1.poll();
  }

  public int peek(){
    return q1.peek();
  }

  public void show(){
    if(q1.isEmpty())
      System.out.println("Stack is Empty");

    while(!q1.isEmpty())
      q2.offer(q1.poll());

    System.out.print("Stack values are: ");
    while(!q2.isEmpty()){
      System.out.print(q2.peek() + " ");
      q1.offer(q2.poll());
    }

    System.out.println();

  }
}
