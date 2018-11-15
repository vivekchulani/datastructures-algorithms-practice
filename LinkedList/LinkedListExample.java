public class LinkedListExample {

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


  // Get value of element at a given index


  // Print elements in a linked list
  

  // Retrieve size of linked list
  public int size() {
    return counter;
  }

}
