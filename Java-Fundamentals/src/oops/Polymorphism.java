package oops;

/*
oops.Polymorphism means multiple forms
Why polymorphism?
-> for code reusability
 */
class Bike {
    protected void ride() {
        System.out.println("Riding bike");
    }
}

class RoyalEnfield extends Bike {
    public void ride() {
        System.out.println("Riding royal enfield");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Bike b = new Bike();
        RoyalEnfield r = new RoyalEnfield();
        b.ride();
        r.ride();
    }
}
