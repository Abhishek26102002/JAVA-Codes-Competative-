import java.util.*;
import java.util.HashSet;
import java.util.Set;
    
public class _73_Hashset {
public static void main(String[] args) {
    
    Set<Integer> set1=new HashSet<>();

    // set cannot add same ele twice
    // set arrange ele in random order.

    set1.add(12);  // adding an ele
    set1.add(34);  
    set1.add(90);  
    set1.add(23);  


    set1.add(23);  
    set1.add(23);  
    set1.add(23);  
    set1.add(23);  


    System.out.println(set1);
    
    set1.remove(12);          // remove
    System.out.println(set1);

    System.out.println("does set contains 32 ?"+set1.contains(34));     // contains an ele

    System.out.println(set1.isEmpty());      // is set is empty or not??
    System.out.println(set1.size());        // size of the set

    set1.clear();                        /// cleaing the set
    System.out.println(set1);

    }
}