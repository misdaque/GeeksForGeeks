// import java.io.BufferredReader;
 import java.io.IOException;
// import java.io.InputStreamReader;

class Runner{

  public static void main(String[] args) throws IOException {
  //  BufferredReader br = new BufferedReader(new InputStreamReader(System.in));

      LinkedList list = new LinkedList();

       list.insert(1);
       // list.insert(1);
       // list.insert(1);
       // list.insert(1);
       // list.insert(1);
       // list.insert(1);
       //list.insert(1);

       list.show();

       list.isPalindrome();
       System.out.println("After Palindrome Check");
       list.show();
  }
}
