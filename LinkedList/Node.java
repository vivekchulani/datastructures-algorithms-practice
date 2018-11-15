public class Node {

  private Node next;
  private int element;

  public Node() {
    this.next = null;
  }

  public Node(int data) {
    this.element = data;
    this.next = null;
  }

  public void setNext(Node node) {
    this.next = node;
  }

  public Node getNext() {
    return next;
  }

  public void setElement(int data) {
    this.element = data;
  }

  public int getElement() {
    return element;
  }

}
