package Task9;

public class MyStack {
    private Node topofthestack;
    private int size;

    public void push(Object value) {
        Node newNode = new Node(value);
        newNode.next = topofthestack;
        topofthestack = newNode;
        size++;
    }

    public void remove(int index) {          // метод що видаляє елемент колекції
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            topofthestack = topofthestack.next;
        } else {
            Node current = topofthestack;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public void clear() {      // метод що очищає колекцію та замінює значення null
        topofthestack = null;
        size = 0;
    }

    public int size() {    //  метод що повертає розмір стопки
        return size;
    }

    public Object peek() {      //  метод що повертає перший елемент стопки
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return topofthestack.data;
    }

    public Object pop() {       //  метод що повертає останній елемент стопки та видаляє його з колекції
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Object data = topofthestack.data;
        topofthestack = topofthestack.next;
        size--;
        return data;
    }

    public boolean isEmpty() {          // метод повертає булеве значення true  у випадку якщо колекція порожня і навпаки
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
        myStack.push("LastElement");

    }
}

//Завдання 4 - Stack
//        Написати свій клас MyStack як аналог класу Stack, який працює за принципом LIFO (last-in-first-out).
//
//        Можна робити за допомогою Node або використати масив.
//
//        Методи
//
//        push(Object value) додає елемент в кінець
//        remove(int index) видаляє елемент за індексом
//        clear() очищає колекцію
//        size() повертає розмір колекції
//        peek() повертає перший елемент стеку
//        pop() повертає перший елемент стеку та видаляє його з колекції