package Task9;

public class MyQueue {

    private Node firstElementofQueue; // Початок колекції
    private Node lastElementofQueue;  // Кінець колекції
    private int size;   // Розмір колекції

    public void add(Object value) {     // Метод що додає елемент в кінець черги
        Node newNode = new Node(value);
        if (isEmpty()) {
            firstElementofQueue = newNode;
            lastElementofQueue = newNode;
        } else {
            lastElementofQueue.next = newNode;
            lastElementofQueue = newNode;
        }
        size++;
    }

    public void clear() {      // метод що очищає колекцію та замінює значення null
        firstElementofQueue = null;
        lastElementofQueue = null;
        size = 0;
    }

    public int size() {     //  метод що повертає розмір стопки
        return size;
    }

    public Object peek() {  //  метод що повертає перший елемент стопки
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return firstElementofQueue.data;
    }

    public Object poll() {  //  метод що повертає перший елемент стопки та видаляє його з колекції
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object data = firstElementofQueue.data;
        firstElementofQueue = firstElementofQueue.next;
        size--;
        return data;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private static class Node {    //inner class
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.add("Anton");
        myQueue.add("Khrystyna");
        myQueue.add("Olha");
        myQueue.add("Anton");
        myQueue.add("Julia");
        myQueue.add("Nadia");
        myQueue.add("Natalka");
        myQueue.add("Olesia");
        myQueue.add("Khrystyna");

        System.out.println(myQueue.size);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue);
    }
}
