import java.util.LinkedList;
import java.util.Queue;

public class _156_Queue_circularTour {

    int tour(int petrol[], int distance[]) {

        int defict = 0;
        int remaining = 0; // Petrol -distance
        int start = 0;

        for (int i = 0; i < petrol.length; i++) {

            remaining += petrol[i] - distance[i];

            if (remaining < 0) {
                defict += remaining;
                start = i + 1;
                remaining = 0;
            }
        }
        if (defict + remaining >= 0) {
            return start;
        } else {
            return -1; // petrol pump ka index return krna hai

        }

    }

}
