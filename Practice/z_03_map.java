import java.util.HashMap;
import java.util.Map;

public class z_03_map {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        // map is akey and val set key must be unique.

        map1.put(1, "One"); // Add
        map1.put(2, "Two");
        map1.put(3, "Three");
        map1.put(4, "four");
        map1.putIfAbsent(5, "five");

        map1.remove(4);// to remove a key
        map1.remove(1, map1);

        map1.replace(1, "Qbit"); // replace

        map1.get(1);

        map1.containsKey(1);
        map1.containsValue("one");

        map1.isEmpty();
        map1.clear();

        for (Integer k : map1.keySet()) {
            System.out.println(k);
        }
        for (String v : map1.values()) {
            System.out.println(v);
        }

        // to avoid false override
        // method 1:
        if (!map1.containsKey(3)) {
            map1.put(3, "Anything");
        }

        // method-2:
        map1.putIfAbsent(3, "Anything u want to add");

    }

}
