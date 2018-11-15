import java.lang.IndexOutOfBoundsException;
// TODO: Look at edge case scenarios for each method
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
  public void add(int data, int index) {

    Node headNode = head;

    if (index < 0) {
      throw new IndexOutOfBoundsException();
    }

    if (headNode.getNext() != null) {

      for (int i = 0; i < index; i++) {
        headNode = headNode.getNext();
      }

      Node newNode = new Node(data);
      newNode.setNext(headNode.getNext());
      headNode.setNext(newNode);
      counter++;
    }
  }


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

  // Find the kth to last element
  // Another implementation? Using the runner technique
  public int findKthElement(int index) {
    // First method would require two iterations
    // Node headNode = head;
    // int size = 0;
    //
    // while(headNode.getNext() != null) {
    //   headNode = headNode.getNext();
    //   size++;
    // }
    //
    // headNode = head;
    // for (int i = 0; i < (size-index); i++) {
    //   headNode = headNode.getNext();
    // }
    //
    // return headNode.getElement();

    Node headNode = head;
    Node headNodeK = head;

    for (int i = 0; i < index-1; i++) {
      headNodeK = headNodeK.getNext();
    }

    while (headNodeK.getNext() != null) {
      headNodeK = headNodeK.getNext();
      headNode = headNode.getNext();
    }

    return headNode.getElement();

  }

  // Reverses linked list
  public void reverse() {

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
