package DSA.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);

        linkedList.printLinkedList();
        linkedList.appendValue(12);
        linkedList.printLinkedList();
        linkedList.getLength();

        //returns the node that is removed
//        System.out.println(linkedList.removeLastNode().value);
//        System.out.println(linkedList.removeLastNode().value);
//        System.out.println(linkedList.removeLastNode());

        linkedList.prepend(123);
        linkedList.printLinkedList();

//        System.out.println(linkedList.removeFirst().value);
//        System.out.println(linkedList.removeFirst().value);

        System.out.println("Printing the Element:: "+linkedList.get(3));
        linkedList.set(0,1);
        linkedList.printLinkedList();
        System.out.println(linkedList.insert(0,134));
        linkedList.printLinkedList();

        System.out.println(linkedList.remove(2));
        linkedList.printLinkedList();
        linkedList.reverse();
        linkedList.printLinkedList();
        System.out.println(linkedList.get(1));
        linkedList.prepend(1234);
        linkedList.printLinkedList();
    }
}
