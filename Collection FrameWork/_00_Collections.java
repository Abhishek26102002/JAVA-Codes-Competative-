import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _00_Collections {
    public static void main(String[] args) {

        // 0. Collections.sort(arr);
        // 1.            .binarySearch(arr, key);
        // 2.            .reverse(arr);
        // 3.            .shuffle(numbers);
        // 4.            .swap(arr, index , index);
        // 5.            .fill(arr, whatValue);
        // 6.            .frequency(arr, whatnumber);
        // 7.            .copy(destinationList, sourceList);
        // 8.            .addAll(arr, "ele1", "ele1", "ele3"); // here is String
        // 9.            .max(numbers);
        // 10.           .min(numbers);
        // 11. boolean isDisjoint = Collections.disjoint(list1, list2);
        // 12.           .replaceAll(arr, oldVal, newVAl)
        // 13.           .rotate(letters, distance);
        // 14.           .sort(numbers, Collections.reverseOrder());  // sort in reverse Orders

        {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(3);
            numbers.add(5);
            numbers.add(7);
            numbers.add(9);

            int index = Collections.binarySearch(numbers, 5);
            System.out.println("Index of 5: " + index); // Output: 2
        }

        {
            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            Collections.reverse(names);
            System.out.println("Reversed names: " + names); // Output: [Charlie, Bob, Alice]
        }

        {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                numbers.add(i);
            }

            Collections.shuffle(numbers);
            System.out.println("Shuffled numbers: " + numbers); // Output: shuffled list of numbers
        }

        {
            List<String> letters = new ArrayList<>();
            letters.add("A");
            letters.add("B");
            letters.add("C");

            System.out.println("Before swap: " + letters); // Output: [A, B, C]
            Collections.swap(letters, 0, 2);
            System.out.println("After swap: " + letters); // Output: [C, B, A]

        }

        {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);

            Collections.fill(numbers, 0);
            System.out.println("Filled list: " + numbers); // Output: [0, 0, 0]
        }

        {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(2);
            numbers.add(3);

            int frequencyOfTwo = Collections.frequency(numbers, 2);
            System.out.println("Frequency of 2: " + frequencyOfTwo); // Output: 2
        }

        {
            List<Integer> sourceList = new ArrayList<>();
            sourceList.add(1);
            sourceList.add(2);
            sourceList.add(3);

            List<Integer> destinationList = new ArrayList<>(4); // Ensure capacity
            destinationList.add(0); // Add an extra element

            // Copy elements from sourceList to destinationList
            Collections.copy(destinationList, sourceList);

            System.out.println("Destination List after copy: " + destinationList); // Output: [1, 2, 3]
        }

        {
            List<String> fruits = new ArrayList<>();
            Collections.addAll(fruits, "Apple", "Banana", "Orange");

            System.out.println("Fruits: " + fruits); // Output: [Apple, Banana, Orange]
        }

        {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(8);
            numbers.add(3);

            Integer maxNumber = Collections.max(numbers);
            System.out.println("Maximum number: " + maxNumber); // Output: 8
        }

        {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(8);
            numbers.add(3);

            Integer minNumber = Collections.min(numbers);
            System.out.println("Minimum number: " + minNumber); // Output: 3
        }

        {
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);

            List<Integer> list2 = new ArrayList<>();
            list2.add(4);
            list2.add(5);
            list2.add(6);

            boolean isDisjoint = Collections.disjoint(list1, list2);
            System.out.println("Lists are disjoint: " + isDisjoint); // Output: true
        }

        {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(2);

            Collections.replaceAll(numbers, 2, 5);
            System.out.println("List after replacement: " + numbers); // Output: [1, 5, 3, 5]
        }

        {
            List<String> letters = new ArrayList<>();
            letters.add("A");
            letters.add("B");
            letters.add("C");
            letters.add("D");

            Collections.rotate(letters, 2);
            System.out.println("List after rotation: " + letters); // Output: [C, D, A, B]
        }

        {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(2);
            numbers.add(8);

            // Sort numbers in reverse order
            Collections.sort(numbers, Collections.reverseOrder());
            System.out.println("Numbers sorted in reverse order: " + numbers); // Output: [8, 5, 2]
        }

    }
}
