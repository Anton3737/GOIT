package GoITCore.Task9;

public class MyLinkedLisk {

    private Node head; // Початок списку
    private Node tail; // Кінець списку
    private int size;  // Розмір списку

    public void add(Object value) {     // add(Object value) додає елемент в кінець
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void remove(int index) {     //  remove(int index) видаляє елемент із вказаним індексом
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node current = getNode(index);
        Node prevNode = current.prev;
        Node nextNode = current.next;

        if (prevNode != null) {
            prevNode.next = nextNode;
        } else {
            head = nextNode;
        }

        if (nextNode != null) {
            nextNode.prev = prevNode;
        } else {
            tail = prevNode;
        }
        size--;
    }

    public void clear() {   // clear() очищає колекцію
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }       //  size() повертає розмір колекції

    public Object get(int index) {      //  get(int index) повертає елемент за індексом
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node node = getNode(index);
        return node.data;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index < size / 2) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        } else {
            Node current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
            return current;
        }
    }

    private class Node {        //inner class представляє елемент списку
        Object data;
        Node next;
        Node prev;

        Node(Object data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        MyLinkedLisk myLinkedLisk = new MyLinkedLisk();
        myLinkedLisk.add("All");
        myLinkedLisk.add("AlA");
        myLinkedLisk.add("AlS");
        myLinkedLisk.add("AlC");
        System.out.println(myLinkedLisk.size);
        myLinkedLisk.remove(2);
        System.out.println(myLinkedLisk.get(1));

    }
}


//Завдання 2 - LinkedList
//        Напишіть свій клас MyLinkedList як аналог класу LinkedList.
//        Не можна використовувати масив. Кожний елемент повинен бути
//        окремим об'єктом-посередником (Node - нода), що зберігає посилання
//        на попередній та наступний елемент колекції (двозв'язний список).
//        Методи
//        add(Object value) додає елемент в кінець
//        remove(int index) видаляє елемент із вказаним індексом
//        clear() очищає колекцію
//        size() повертає розмір колекції
//        get(int index) повертає елемент за індексом