package DSA.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack =  new Stack(4);
        myStack.getTop();
        myStack.getHeight();

        myStack.push(1);
        myStack.pop();
        myStack.pop();

        myStack.printStack();

    }
}
