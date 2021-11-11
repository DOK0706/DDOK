package chap10;
interface Box<T> {
    void addItem(T t, int index);
}
class Item<T> implements Box<T> {
    private final T[] array;

    public Item() {
        array = (T[]) new Object[10];
    }

    @Override
    public void addItem(T t, int index) {
        array[index] = t;
    }

    void Print(int index) {
        System.out.println(array[index]);
    }
}
public class Test1 {
    public static void main(String[] args) {
        Item<String> strObject = new Item<String>();
        strObject.addItem("Hello", 0);
        strObject.Print(0);
    }
}
