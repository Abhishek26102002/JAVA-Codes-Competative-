import java.util.TreeMap;
import java.util.Map;
import java.util.Map;

public class _77_TreeMap {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new TreeMap<>();
        // map is akey and val set key must be unique.

        map1.put(3, "Three");
        map1.put(2, "Two");  
        map1.put(1, "One");  // Add
        map1.put(4, "four");

        System.out.println(map1);
        // @overRide
        map1.put(3, "Four");

        // to avoid false override
        // method 1:
        // if(!map1.containsKey(3)){
        // map1.put(3, "Anything");
        // }

        // method-2:
        // map1.putIfAbsent(3, "Anything u want to add");


        map1.remove(4);// to remove a key

        
        map1.replace(1, "Qbit");  // replace
        System.out.println(map1.get(1));


        // for each loop to print each ele individualy
        for (Map.Entry<Integer, String> entries : map1.entrySet()) {
            System.out.println(entries);
            System.out.println();
            System.out.println(entries.getKey()); // only iterrate keys
            System.out.println(entries.getValue()); // only iterrate values
        }
        for (Integer k : map1.keySet()) {
            System.out.println(k);
        }
        for (String v : map1.values()) {
            System.out.println(v);
        }



        System.out.println(map1.containsKey(1)); // contains a key
        System.out.println(map1.containsValue("Bbit")); // contains a val
        System.out.println(map1.isEmpty());
        map1.clear(); // to clear  amap
        System.out.println(map1);











    }
}