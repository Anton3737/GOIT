package Task9;

public class MyArrayList {

    private Object[] array;
    private int size;          // розмір масиву
    private int capacity = 10;

    public MyArrayList() {
        array = new Object[1];
        size = 0;
    }

    public int size() {
        return array.length;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = (array.length * 3) / 2 + 1;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    //добавляем элемент в конец списка
    public boolean add(Object value) {
        if (size == array.length) {  //если в массиве места нет
            ensureCapacity(); //вызываем метод, который отвечает за увеличение массива
        }
        array[size] = value; //записываем в конец списка новое значення
        size++;  //увеличиваем значення переменной размера списка
        return true;
    }

    public void clear() {
        final Object[] es = array;
        for (int i = 0; i < size; i++) {
            es[i] = null;
        }
    }

    public void remove(int removeIndex) {
        if (removeIndex < 0 || removeIndex > array.length) {
            System.out.println("Invalid index");
        } else {
            System.arraycopy(array, removeIndex + 1, array, removeIndex, size - removeIndex - 1);
            array[size - 1] = null;
            size--;
        }
    }

    public Object get(int get) {
        if (get < 0 || get >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[get];
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Hallo");
        myArrayList.add("Hallo1");
        myArrayList.add("Hallo2");
        myArrayList.add("Hallo3");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        System.out.println("------------------------");

        System.out.println(myArrayList.size());

        System.out.println("------------------------");

        myArrayList.clear();
        myArrayList.remove(2);

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        System.out.println(myArrayList.size());

        System.out.println("------------------------");

        System.out.println(myArrayList.get(2));

    }
}


//Завдання 1 - ArrayList
//        Напишіть свій клас MyArrayList як аналог класу ArrayList.
//        Можна використовувати 1 масив для зберігання даних.
//        Методи
//        add(Object value) додає елемент в кінець +
//        remove(int index) видаляє елемент із вказаним індексом +
//        clear() очищає колекцію +
//        size() повертає розмір колекції  +
//        get(int index) повертає елемент за індексом  +