import java.lang.IndexOutOfBoundsException;

public class LinkedList {

  private Node head;
  private int counter;

  // Add a node at the end of the linked list
  public void addToEnd(int data) {

    if (head == null) {
      head = new Node(data);
    }

    Node headNode = head;
    Node newNode = new Node(data);

    if (headNode != null) {

      while (headNode.getNext() != null) {
        headNode = headNode.getNext();
      }

      headNode.setNext(newNode);
      counter++;
    }
  }

  // Add node at a given index


  // Add node at the beginning of a linked list
  public void addToFront(int data) {

    if (head == null || head.getNext() == null) {
      head = new Node(data);
      Node newNode = new Node(data);
      head.setNext(newNode);
    } else {
      Node headNode = head;
      Node newNode = new Node(data);
      newNode.setNext(headNode.getNext());
      headNode.setNext(newNode);
    }
    counter++;
  }


  // Delete a node in the linked list
  public boolean remove(int index) throws IndexOutOfBoundsException {

    if (index < 0) {
      throw new IndexOutOfBoundsException();
    }

    Node headNode = head;
    if (headNode.getNext() != null) {

    for (int i = 0; i < index; i++) {
        headNode = headNode.getNext();
    }

    headNode.setNext(headNode.getNext().getNext());
    counter--;
    return true;
    }

    return false;

  }


  // Get value of element at a given index
  public int get(int index) throws IndexOutOfBoundsException {

    if (index < 0) {
      throw new IndexOutOfBoundsException();
    }

    Node headNode = head;
    if (headNode.getNext() != null) {
      headNode = headNode.getNext();
    }

    for (int i = 0; i < index; i++) {
      headNode = headNode.getNext();
    }

    return headNode.getElement();

  }


  // Print elements in a linked list
  public void printList() {
    Node headNode = head;
    for (int i = 0; headNode.getNext() != null; i++) {
      headNode = headNode.getNext();
      System.out.println(String.valueOf(i) + " Element: " + headNode.getElement());
    }
  }

  // Retrieve size of linked list
  public int size() {
    return counter;
  }

}
