package Interfaces;
interface Box<T> {
    void set(T item);
    T get();
}
class StringBox implements Box<String> {
    private String item;

    public void set(String item) {
        this.item = item;
    }

    public String get() {
        return item;
    }
}

class IntegerBox implements Box<Integer> {
    private Integer item;

    public void set(Integer item) {
        this.item = item;
    }

    public Integer get() {
        return item;
    }
}
public class Generic {
    public static void main(String[] args) {
        Box<String> strBox = new StringBox();
        strBox.set("Food ");
        System.out.println("String Box contains: " + strBox.get());

        Box<Integer> intBox = new IntegerBox();
        intBox.set(456);
        System.out.println("Integer Box contains: " + intBox.get());
    }
}




