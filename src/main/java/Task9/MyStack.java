package Task9;

public class MyStack {
    private Node top; // Вершина стеку
    private int size; // Розмір стеку

    public void push(Object value) {        //  push(Object value) додає елемент в кінець
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void remove(int index) {     //  remove(int index) видаляє елемент за індексом
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            top = top.next;
        } else {
            Node current = top;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public void clear() {       //  clear() очищає колекцію
        top = null;
        size = 0;
    }

    public int size() {     //  size() повертає розмір колекції
        return size;
    }

    public Object peek() {      //  peek() повертає перший елемент стеку
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public Object pop() {       //  pop() повертає перший елемент стеку та видаляє його з колекції
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("Hallo");
        myStack.push("my");
        myStack.push("name");
        myStack.push("is");
        myStack.push("Anton");

        System.out.println(myStack.size());

        System.out.println(myStack.isEmpty());

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());

        System.out.println(myStack.size());
    }
}
