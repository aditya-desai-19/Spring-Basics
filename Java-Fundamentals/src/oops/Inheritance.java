package oops;/*
Why inheritance?
-> To promote reusability of code
 */

class Parent {
    protected String myVal = "oops.Parent";
}

public class Inheritance extends Parent {
    private String myVal2 = "Child";

    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        System.out.println(i.myVal);
    }
}
