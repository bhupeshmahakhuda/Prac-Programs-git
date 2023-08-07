package DSA.LinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }
    public DoublyLinkedList(int value){
        Node newNode= new Node(value);
        head = newNode;
        tail =  newNode;
        length = 1;
    }

    public void getHead(){System.out.println("The Head is : "+head.value);}
    public void getTail(){System.out.println("The Tail is : "+tail.value);}
    public void getLength(){System.out.println("The length is : "+length);}

    public void printList(){
        System.out.println("Printing List elements!!!::::");
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp =  temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail =  newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }
}
