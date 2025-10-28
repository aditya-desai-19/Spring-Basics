package generics;

/*
Why generics were introduced?
-> Same class can work with different data type
-> No runtime errors like earlier if we don't specify any type we can add values of any data
type to the class and it would compile but throw runtime error.
 */

class Box<T> {
    private T val;

    public Box(T newVal) {
        this.val = newVal;
    }

    public T getVal() {
        return this.val;
    }
}

public class Generics {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(5);
        System.out.println(b1.getVal());

        Box<String> b2 = new Box<>("Aditya");
        System.out.println(b2.getVal());
    }
}
