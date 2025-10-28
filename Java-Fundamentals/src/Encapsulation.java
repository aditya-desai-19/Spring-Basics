/*
Why encapsulation?
-> Better control
-> Security
*/

public class Encapsulation {
    private String name = "Aditya";

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        System.out.println(e.getName());
        e.setName("Rohit");
        System.out.println(e.getName());
    }
}
