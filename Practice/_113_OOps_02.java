import java.util.*;

class Human {
    private String name;
    private int age;
    private int weight;

    public void setname(String name) {
        this.name = name;
    }

    public void setage(int age) {
        this.age = age;

    }

    public void setweight(int weight) {
        this.weight = weight;

    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public int getweight() {
        return weight;
    }
}

class male extends Human {
    private String color;

    void sleep() {
        // System.out.println("Sleeps 8Hr a Day");
    }
}

// -------------------

class A {
    void sayHello() {
        System.out.println("Hello Abhi");
    }

    void sayHello(String name) {
        System.out.println("HEllo Abhi this is a same but with String name :" + name);

    }

    int sayHello(int n, String name) {
        System.out.println("Hello with data Stirng : " + name + " ,and type int :" + n);
        return 1;
    }
}

// -----------------------------
// Java Runtime Polymorphism Example:
class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {

    @Override

    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {

    @Override

    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {

    @Override

    float getRateOfInterest() {
        return 9.7f;
    }
}

public class _113_OOps_02 {
    public static void main(String args[]) {

        {
            male Abhi = new male();
            Abhi.sleep();
            Abhi.setage(28);

            // System.out.println("Age is " + Abhi.getage());
        }

        {

            A obj1 = new A();
            obj1.sayHello();
            obj1.sayHello("Moreen ");
            obj1.sayHello(12, "Moreen");

        }

        {
            // --------------------------------------------------------------------------------
            // Java Runtime Polymorphism Example:

            Bank b;
            b = new SBI();
            System.out.println("\nSBI Rate of Interest: " + b.getRateOfInterest());
            b = new ICICI();
            System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
            b = new AXIS();
            System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
        }

    }
}
