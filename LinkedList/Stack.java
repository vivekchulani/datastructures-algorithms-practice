public class Stack {

  private Node head;

  // Push member on to Stack
  public void push(int data) {

    if (head == null) {
      head = new Node(data);
    }

    Node headNode = head;
    Node newNode = new Node(data);
    if (headNode.getNext() == null) {
      headNode.setNext(newNode);
    } else {
      newNode.setNext(headNode.getNext());
      headNode.setNext(newNode);
    }

  }

  // Pop member from Stack
  public int pop() {
    int element = peek();
    Node headNode = head;
    if (headNode.getNext().getNext() != null) {
      headNode.setNext(headNode.getNext().getNext());
    }
    return element;
  }

  // Peek - See top most member on stack
  public int peek() {
    Node headNode = head;

    if (headNode.getNext() != null)
      return headNode.getNext().getElement();
    return 0;
  }

  // Print elements
  public void printStack() {
    Node headNode = head;
    while(headNode.getNext() != null) {
      headNode = headNode.getNext();
      System.out.println(headNode.getElement());
    }
  }
}
