import java.util.*;

public class _13_Set_Hash {
    public static void main(String[] args) {
        Set<String> data = new HashSet<>();

        data.add("JavaTpoint");
        data.add("Set");
        data.add("Example");
        data.add("Set"); // remove or doesn't add duplicate

        System.out.println(data);

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
        Set<Integer> b = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[] { 11, 31, 21, 41, 81, 91, 0 }));
        Set<Integer> c = new HashSet<>(a);

        Iterator<String> i = data.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        a.size();

        a.addAll(Arrays.asList(1, 2, 3, 4));// the val entered must be of collection framework.

        a.contains(2);

        a.isEmpty();

        a.toArray();

        a.toString();

        c.removeAll(b);

        a.clear();

        Iterator<String> it=data.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Integer[] A = { 22, 45, 33, 66, 55, 34, 77 };
        Integer[] B = { 33, 2, 83, 45, 3, 12, 55 };

        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(A));
        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(B));

        // Finding Union of set1 and set2
        Set<Integer> union_data = new HashSet<Integer>(set1);
        union_data.addAll(set2);
        System.out.print("Union of set1 and set2 without repetation is:");
        System.out.println(union_data);

        // Finding Intersection of set1 and set2
        Set<Integer> intersection_data = new HashSet<Integer>(set1);
        intersection_data.retainAll(set2);
        System.out.print("Intersection of set1 and set2 is:");
        System.out.println(intersection_data);

        // Finding Difference of set1 and set2
        Set<Integer> difference_data = new HashSet<Integer>(set1);
        difference_data.removeAll(set2);
        System.out.print("Difference of set1 and set2 is:");
        System.out.println(difference_data);

    }
}
