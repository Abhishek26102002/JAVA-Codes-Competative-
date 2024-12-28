import java.util.*;
import java.util.Stack;

/*add, add, addAll, addAll, addElement, capacity, clear, clone, contains, containsAll, copyInto, elementAt, elements, ensureCapacity, equals, firstElement, forEach, get, hashCode, indexOf, indexOf, insertElementAt, isEmpty, iterator, lastElement, lastIndexOf, lastIndexOf, listIterator, listIterator, remove, remove, removeAll, removeAllElements, removeElement, removeElementAt, removeIf, removeRange, replaceAll, retainAll, set, setElementAt, setSize, size, sort, spliterator, subList, toArray, toArray, toString, trimToSize */ 

public class _68_Stack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        // syso(Stack); // Output: Stack after adding elements: [1, 2, 3]

        Stack<Integer> anotherStack = new Stack<>();

        anotherStack.add(4);
        anotherStack.add(5);

        stack.addAll(anotherStack);// Output: Stack after adding anotherStack: [1, 2, 3, 4, 5]
        stack.capacity();
        stack.clear();// clear() - Clearing all elements from the stack
        stack.contains(3); // contains(Object obj) - Checking if the stack contains a specific element
        stack.elementAt(1);

        stack.ensureCapacity(10); // ensureCapacity(int minCapacity) - Ensuring that the stack has a minimum
                                  // capacity

        stack.firstElement();// firstElement() - Getting the first element of the stack

        stack.forEach(elem -> System.out.print(elem + " ")); // Output: Stack elements using forEach: 6 7
        stack.get(0); // Output: Element at index 0: 6
        stack.indexOf(7); // Output: Index of element 7: 1

        stack.insertElementAt(8, 1);
        stack.isEmpty(); // Output: Is stack empty? false

        {
            var iterator = stack.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            // Output: Stack elements using iterator: 6 8 7
        }

        stack.lastElement(); // Output: Last element of the stack:
        stack.lastIndexOf(8); // Output: Last index of element 8: 3

        {

            var listIterator = stack.listIterator();
            while (listIterator.hasNext()) {
                System.out.print(listIterator.next() + " "); // Output: Stack elements using listIterator: 6 8 7 8
            }
        }

        {

            System.out.print("\nStack elements using listIterator from index 1: ");
            var listIteratorFromIndex = stack.listIterator(1);
            while (listIteratorFromIndex.hasNext()) {
                System.out.print(listIteratorFromIndex.next() + " ");// Output: Stack elements using listIterator from
                                                                     // index 1: 8 7 8
            }
        }

        // remove(Object obj) - Removing the first occurrence of an element
        stack.remove(8);
        System.out.println("\nStack after removing first occurrence of 8: " + stack); // Output: Stack after removing
                                                                                      // first occurrence of 8: [6, 7,
                                                                                      // 8]

        // remove(int index) - Removing the element at a specific index
        stack.remove(1);
        System.out.println("Stack after removing element at index 1: " + stack); // Output: Stack after removing element
                                                                                 // at index 1: [6, 8]

        // removeAll(Collection<?> c) - Removing all occurrences of elements in a
        // collection
        stack.removeAll(List.of(6, 8));
        System.out.println("Stack after removing all occurrences of 6 and 8: " + stack); // Output: Stack after removing
                                                                                         // all occurrences of 6 and 8:
                                                                                         // []

        // removeAllElements() - Removing all elements from the stack
        stack.removeAllElements();
        System.out.println("Stack after removing all elements: " + stack); // Output: Stack after removing all elements:
                                                                           // []

        // removeElement(Object obj) - Removing the first occurrence of an element
        stack.removeElement(7);
        System.out.println("Stack after removing first occurrence of 7: " + stack); // Output: Stack after removing
                                                                                    // first occurrence of 7: []

        // removeElementAt(int index) - Removing the element at a specific index
        stack.add(9);
        stack.add(10);
        stack.removeElementAt(1);
        System.out.println("Stack after removing element at index 1: " + stack); // Output: Stack after removing element
                                                                                 // at index 1: [9, 10]

        // removeIf(Predicate<? super E> filter) - Removing elements based on a
        // predicate
        stack.removeIf(element -> element % 2 == 0);
        System.out.println("Stack after removing even elements: " + stack); // Output: Stack after removing even
                                                                            // elements: [9]

        // removeRange(int fromIndex, int toIndex) - Removing elements within a
        // specified range
        stack.add(11);
        stack.add(12);
        stack.removeRange(1, 3); // Type - List , ArrayList , Vector etc....
        System.out.println("Stack after removing elements in the range [1, 3]: " + stack); // Output: Stack after
                                                                                           // removing elements in the
                                                                                           // range [1, 3]: [9, 12]

        // replaceAll(UnaryOperator<E> operator) - Replacing each element with the
        // result of applying an operator
        stack.replaceAll(element -> element * 2);
        System.out.println("Stack after doubling each element: " + stack); // Output: Stack after doubling each element:
                                                                           // [18, 24]

        // retainAll(Collection<?> c) - Retaining only the elements in the stack that
        // are also in a specified collection
        stack.retainAll(List.of(18, 30));
        System.out.println("Stack after retaining elements 18 and 30: " + stack); // Output: Stack after retaining
                                                                                  // elements 18 and 30: [18]

        // set(int index, E element) - Setting the element at a specific index
        stack.set(0, 27);
        System.out.println("Stack after setting element at index 0 to 27: " + stack); // Output: Stack after setting
                                                                                      // element at index 0 to 27: [27]

        // setElementAt(E obj, int index) - Setting the element at a specific index
        stack.setElementAt(36, 0);
        System.out.println("Stack after setting element at index 0 to 36: " + stack); // Output: Stack after setting
                                                                                      // element at index 0 to 36: [36]

        // setSize(int newSize) - Setting the size of the stack
        stack.setSize(3);
        System.out.println("Stack after setting size to 3: " + stack); // Output: Stack after setting size to 3: [36, 0,
                                                                       // 0]

        // size() - Getting the size of the stack
        System.out.println("Size of the stack: " + stack.size()); // Output: Size of the stack: 3

        // sort(Comparator<? super E> c) - Sorting the elements in the stack
        stack.add(18);
        stack.sort(null);
        System.out.println("Stack after sorting: " + stack); // Output: Stack after sorting: [0, 18, 36]

        // spliterator() - Obtaining a spliterator over the elements in the stack
        System.out.print("Stack elements using spliterator: ");
        var spliterator = stack.spliterator();
        spliterator.forEachRemaining(elem -> System.out.print(elem + " "));
        // Output: Stack elements using spliterator: 0 18 36

        // subList(int fromIndex, int toIndex) - Obtaining a view of the portion of the
        // stack between the specified indices
        List<Integer> subList = stack.subList(1, 3);
        System.out.println("\nSublist of the stack: " + subList); // Output: Sublist of the stack: [18, 36]

        // toArray() - Converting the stack to an array
        Object[] array = stack.toArray();
        System.out.print("Array from stack: ");
        for (Object elem : array) {
            System.out.print(elem + " ");
        }
        // Output: Array from stack: 0 18 36

        // toArray(T[] a) - Converting the stack to an array of a specified type
        Integer[] intArray = new Integer[stack.size()];
        intArray = stack.toArray(intArray);
        System.out.print("\nInteger array from stack: ");
        for (int elem : intArray) {
            System.out.print(elem + " ");
        }
        // Output: Integer array from stack: 0 18 36

        // toString() - Getting a string representation of the stack
        System.out.println("\nString representation of the stack: " + stack.toString()); // Output: String
                                                                                         // representation of the stack:
                                                                                         // [0, 18, 36]

        // trimToSize() - Trimming the capacity of the stack to its current size
        stack.trimToSize();
        System.out.println("Stack after trimming capacity: " + stack); // Output: Stack after trimming capacity: [0, 18,
                                                                       // 36]
    }
}
