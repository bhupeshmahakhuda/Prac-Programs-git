package DSA.LinkedList;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(10);
        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.getLength();
        doublyLinkedList.printList();

        //appending list
        doublyLinkedList.append(7);
        doublyLinkedList.append(8);
        doublyLinkedList.printList();

        //removing the last item from list
//        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();

        doublyLinkedList.printList();

    }
}
