Class Stack<T> {
  Class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
    }
  }

  private Node<T> top;

  public T pop() {
    if (top == null) {
      throw new ExptyStackException();
    }
    
    T item = top.data; // backup data
    top - top.next; // make next item top
    return item;
  }

  public void push(T item) {
    Node<T> t = new Node<t>(item);
    t.next = top;
    top = t; // make node top
  }

  public T peek() {
    if (top == null) {
      throw new ExptyStackException();
    }
    return top.data;
  }

  public boolean isEmpty() {
    return top == null;
  }
}

public class Test {
  public static void main (String[] args) {
    Stack<Integer> s = new Stack<Integer>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.peek());
    System.out.println(s.pop());
    System.out.println(s.isEmpty());
    System.out.println(s.pop());
    System.out.println(s.isEmpty());

    // 4,3,2,2,false,1,true
  }
}
