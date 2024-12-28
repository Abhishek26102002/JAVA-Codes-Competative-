import java.util.*;

class Hero {

  private  int health;
   private char level;// private cannot be acces outside of class
    // but by getter and setter we can accessa nd modify values

    // getter
    int getHealth() {
        return health;

    }

    char getlevel() {
        return level;
    }

    // setter
    void setHealth(int h) {
        health = h;

    }

    void setlevel(char ch) {
        level = ch;

    }

    Hero(int health) {
        this.health = health;
    }

    Hero(int health, char level) {
        this.health = health;
        this.level = level;
    }

    Hero() {
        System.out.println("this is a default constrctor");
    }

    void print() {
        System.out.println("health is " + this.health);
        System.out.println("level is " + this.level);

    }

    Hero(Hero temp){
        System.out.println("Copy connstructor is called");
        this.health=temp.health;//temp.health is dynamic allocation
        this.level=temp.level;
        
    }

};

public class _112_OOP {
    public static void main(String args[]) {

        // Hero hh = new Hero(10); // This is a object

        // parameterised constructor mai val pass krna padhta hai

        Hero temp = new Hero(97, 'Z');
        // System.out.println(temp.health);
        // System.out.println(temp.level);
        temp.print();

        // once the parameterised constructor is initiate the default constructor is
        // deleted automatically

        // here if we creat a new object then default can initialized again
        Hero suresh = new Hero();
        suresh.setHealth(100);
        suresh.setlevel('R');
        // System.out.println("Health of suresh is "+suresh.health);
        // System.out.println("Health of suresh is "+suresh.level);
        suresh.print();

        //Copy constructor
        Hero R=(suresh);// suresh value is copied to R. directly
        R.print();

        //copy constructor is called through reference
        Hero W=new Hero(R);// Here copy constructor is called through function class
        W.print();


        // Hero h1 = new Hero();
        // h1.level='A';
        // h1.health=87;

        // To access object
        // h1.setHealth(89);

        // h1.setlevel('D');// setting private values

        // System.out.println("Health of our hero is " + h1.getHealth());
        // System.out.println("Level of our hero is " + h1.getlevel());// to access
        // private files
    }
}