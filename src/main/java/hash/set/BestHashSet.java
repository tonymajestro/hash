package hash.set;

import java.util.ArrayList;

/**
 * Best (not literally) Hash Set that lets you add all integers. Handles collisions by storing
 * all values with the same hash in a List.
 */
public class BestHashSet {

    // Array of ArrayList<Integer>
    private ArrayList<Integer>[] set;

    public BestHashSet(int size) {
        set = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            set[i] = new ArrayList<Integer>();
        }
    }

    public void add(int num) {
        int location = simpleHash(num);
        ArrayList<Integer> collisions = set[location];

        // Implement add here
    }

    public boolean contains(int num) {
        int location = simpleHash(num);
        ArrayList<Integer> collisions = set[location];

        // Implement contains here
        return false;
    }

    public void remove(int num) {
        int location = simpleHash(num);
        ArrayList<Integer> values = set[location];

        // Implement remove here
    }

    /**
     * Generates a hash for the number.
     * The returned hash is in between 0 and the length of the boolean set array.
     * <p>
     * E.g. For a set of size 10:
     * simpleHash(0) = 0
     * simpleHash(3) = 3
     * simpleHash(16) = 6
     * simpleHash(1243) = 3
     * simpleHash(-2) = 2
     */
    private int simpleHash(int num) {
        return Math.abs(num) % set.length;
    }
}
