import java.util.*;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class _08_HashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
        map.put(1, "Mango"); // Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(1, "Grapes"); // trying duplicate key

        System.out.println(map);
        //or 
        System.out.println(map.entrySet());

        map.keySet(); // al keys
     
        map.values();
       
        map.putIfAbsent(1, "apple");
       
        map.containsValue("apple");
       
        map.remove(1, "Mango");
       
        map.remove(3);
       
        map.size();
       
        map.toString();
       
        map.isEmpty();
        
        map.get(3); // get key value
       
        map.replace(1, "Mango", "grapes");
       
        

        System.out.println("Iterating Hashmap...");
        for (Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}