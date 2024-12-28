import java.util.*;
import java.util.LinkedList;
import java.util.List;

    
public class _70_Linkedlist {
public static void main(String[] args) {

    List<Integer> list1=new LinkedList<>();

    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);
    list1.add(6);
    list1.add(7);


    System.out.println(list1);
    System.out.println(list1.get(5));
  

    // list1.addAll(list2);
    // System.out.println(list1);

    list1.remove(0);
    System.out.println(list1);
    
    list1.remove(Integer.valueOf(4));// to remove direct the element
    System.out.println(list1);
    
    list1.set(0, 3294);
    System.out.println(list1);

    // // to empty the list 
    list1.clear();// this removes all the elements form the list
    System.out.println(list1);
    
   

    
    }
}