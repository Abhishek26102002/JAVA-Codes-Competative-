import java.util.*;

class Hero {

    int health;
    char level;
    private int age; // cannot access outside of the class
    protected String gender = "male";
    private String name;

    static int TimeToComplete; // or static int TimeToComplete=9 ;
    static {
        TimeToComplete = 9;
    }

    static int JustaFun() {
        return TimeToComplete / 10;
    }

    // getter
    int gethealth() {
        return health;

    }

    int getage() {
        return age;

    }

    char getlevel() {
        return level;
    }

    // setter
    void sethealth(int h) {
        health = h;

    }

    void setage(int x) {
        age = x;

    }

    void setlevel(char ch) {
        level = ch;

    }

    void setname(String name) {
        this.name = name;
    }

    // this is a default constrctor **must create in case of multiple parameterised
    // constructor
    Hero() {
        System.out.println("*****this is a default constrctor*******");
    }

    // consturctor
    // this.health refers to Hero ka Health
    Hero(int health) {
        this.health = health;
    }

    // consturctor
    Hero(int health, char level) {
        this.health = health;
        this.level = level;
    }

    // Assuming a basic constructor for the class
    public Hero(String name, int health, char level, int age) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.age = age;
    }

    // Deep copy constructor
    public Hero(Hero original) {
        this.name = new String(original.name);
        this.health = original.health;
        this.level = original.level;
        this.age = original.age;
    }

    void print() {
        System.out.print("\n[ ");
        System.out.print(" Name : " + this.name);
        System.out.print(" ,age : " + this.age);
        System.out.print(" ,health : " + this.health);
        System.out.print(" ,level : " + this.level);
        System.out.print(" ]\n\n");
    }

}

public class _112_OOPS {

    public static void main(String args[]) {

        {
            Hero RaOne = new Hero();

            RaOne.sethealth(78);
            RaOne.setlevel('A');

            RaOne.setage(22);// private
            RaOne.getage(); // output :RaOne ka age 25

            System.out.println("RaOne ka health " + RaOne.health);
            System.out.println("RaOne ka level " + RaOne.level);
        }

        // System.out.println("RaOne ka level "+ RaOn->level ); in c++ ; in java we use
        // only '.' Dot Operator

        {
            // paramerterised -> dosen't need setter or getter but can use it as well
            Hero GeOne = new Hero(100);
            GeOne.sethealth(18); // setter overRide the command

            System.out.println("GeOne ka health :" + GeOne.health);
            System.out.println("GeOne ka health :" + GeOne.gethealth());
        }

        {
            // new
            Hero Salman = new Hero(101, 'A');

            Salman.setname("Salman");
            Salman.sethealth(800);// OverRide
            Salman.setlevel('Z');// OverRide
            Salman.setage(56);

            System.out.println("Salman ka health " + Salman.health);
            System.out.println("Salman ka level " + Salman.level);
            Salman.print(); // print function

            // directly copy value
            Hero JamesBond = (Salman);// direct copy krne pe address m change hoga jo deep copy bhi nhi thik kr skta
            // sol? -> Hero JamesBond =new Hero(Salman)
            JamesBond.setname("Bond");
            JamesBond.print();

            // copy by copy_Constructor Method here copy constructor is called
            Hero Rock = new Hero(Salman);
            Rock.print();
        }

        {
            Hero Tony = new Hero();
            Tony.setname("Tony");
            Tony.setlevel('Q');
            Tony.setage(34);
            Tony.sethealth(41);

            Hero IronMan = new Hero();
            IronMan.setname("Iron Man");
            IronMan.setage(21);
            IronMan.setlevel('T');
            IronMan.sethealth(100);

            Tony = IronMan; // copy constructor

            Tony.print();
            IronMan.print();
        }

        {
            System.out.println(" This is Static obj in java : " + Hero.TimeToComplete); // Accessing via class name

            Hero Hritik = new Hero();
            System.out.println(Hritik.TimeToComplete); // Not recommended

            Hritik.TimeToComplete = 100;
            System.out.println(Hritik.TimeToComplete); // Not recommended

            System.out.println("Static Function :" + Hero.JustaFun());

        }

    }
}