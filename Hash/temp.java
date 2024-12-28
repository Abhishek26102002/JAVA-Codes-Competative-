public class temp {

    public static String arrayToString(int[] arr) {
        if (arr.length == 1 && arr[0] == -1) {
            return "-1";
        }
        return "[" + arr[0] + ", " + arr[1] + "]";
    }

    public static int[] checkSorted(int[] arr) {
        if (arr.length < 2) {
            return new int[] { -1 }; // Single element or empty array is sorted
        }

        int start = -1;
        int end = -1;

        // Find the first point where order is broken
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }

        // If no break in order is found, the array is sorted
        if (start == -1) {
            return new int[] { -1 };
        }

        // Find the last point where order is broken starting from where it first broke
        for (int i = arr.length - 1; i > start; i--) {
            if (arr[i - 1] > arr[i]) {
                end = i;
                break;
            }
        }

        return new int[] { start, end };
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 3, 2, 4, 5 };

        // Testing the function with both arrays
        System.out.println("Sorted array check: " + arrayToString(checkSorted(array1)));
        System.out.println("Unsorted array check: " + arrayToString(checkSorted(array2)));
    }

}
