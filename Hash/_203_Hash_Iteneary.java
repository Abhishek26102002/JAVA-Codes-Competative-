import java.util.*;
// can be optimised do once by own
public class _203_Hash_Iteneary {
    public static String getStart(HashMap<String, String> ticket) {
        HashMap<String, String> revmap = new HashMap<>();

        for (String key : ticket.keySet()) {
            revmap.put(ticket.get(key), key); // val , key pair
        }

        for (String key : ticket.keySet()) {
            if (!revmap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("Chennai", "Benguluru");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi", "Goa");

        String start = getStart(ticket);

        while (ticket.containsKey(start)) {
            System.out.print(start + "->");
            start = ticket.get(start);
        }
        System.out.print(start);
    }

}
