package DSA.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }

        public String toString(){
            return "Value of Node :"+value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printLinkedList(){
        System.out.println("Printing LinkedList :::::");
        Node temp =  head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void appendValue(int value){
        Node newNode= new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //retunrs the removed value
    public Node removeLastNode(){
        if(length==0) {
            return null;
        }

        Node temp = head;
        Node pre = head;

        while(temp.next!=null){
            pre=temp;
            temp= temp.next;
        }
        tail = pre;
        tail.next= null;
        length--;
        if(length==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head= newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length==0){
            return null;
        }
        else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            if (length == 0) {
                tail = null;
            }
            return temp;
        }
    }

    public Node get(int index){
        if(length==0 || index>=length || index<0){
            return null;
        }
        Node temp = head;
        while(temp!=null && index!=0){
            temp = temp.next;
            index--;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp= get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index<0 || index>length){
            return false;
        }
        else if(index==0) {
            prepend(value);
            return true;
        }
        else if(index ==  length){
            appendValue(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index<0 || index>=length){
            return null;
        }
        else if(index == 0){
            Node node= removeFirst();
            return node;
        }
        else if(index == length-1){
            Node node = removeLastNode();
            return node;
        }

        Node prev = get(index-1);
        Node temp = get(index);
        prev.next = temp.next;
        temp.next = null;

        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;

        for(int i=0;i<length;i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void getHead(){
        System.out.println("Head : "+ head.value);
    }
    public void getTail(){
        System.out.println("Tail : "+ tail.value);
    }
    public void getLength(){
        System.out.println("length : "+ length);
    }
}