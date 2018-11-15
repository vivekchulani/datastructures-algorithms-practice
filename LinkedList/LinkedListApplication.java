public class LinkedListApplication {

  public static void main(String[] args) {
    LinkedList linkedlist = new LinkedList();
    linkedlist.addToEnd(234);
    linkedlist.addToEnd(211);
    linkedlist.addToEnd(48);
    linkedlist.addToFront(15422);
    linkedlist.addToFront(15);
    linkedlist.printList();
    System.out.println(linkedlist.get(0));
    System.out.println(linkedlist.get(4));
  }

}
