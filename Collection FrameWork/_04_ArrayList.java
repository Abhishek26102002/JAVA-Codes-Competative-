import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class _04_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(6, 56, 35, 6, 354, 63, 56, 35));

        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        arr1.size();

        arr1.add(0, 8);

        arr1.set(0, 4);

        arr1.remove(0);
        arr2.remove(Integer.valueOf(4));// to remove the val

        arr1.get(5); // retur ele from specific position

        arr1.addAll(arr2);// add all ele fo arr2 to arr1

        arr1.contains(200); // return boolean

        arr1.clear();

  


    }
}
