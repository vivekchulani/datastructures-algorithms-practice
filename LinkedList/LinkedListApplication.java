public class LinkedListApplication {

  public static void main(String[] args) {
    LinkedList linkedlist = new LinkedList();
    linkedlist.addToEnd(234);
    linkedlist.addToEnd(211);
    linkedlist.addToEnd(48);
    linkedlist.addToFront(15422);
    linkedlist.addToFront(15);
    linkedlist.printList();
    System.out.println("Linked List size: " + linkedlist.size());
    System.out.println("Element at index 0 is: " + linkedlist.get(0));
    System.out.println("Element at index 4 is: " + linkedlist.get(4));
    linkedlist.remove(2);
    linkedlist.printList();
    System.out.println("Linked List size: " + linkedlist.size());
    linkedlist.add(255, 3);
    System.out.println("Element at index 3 is: " + linkedlist.get(3));
    linkedlist.printList();

  }

}
