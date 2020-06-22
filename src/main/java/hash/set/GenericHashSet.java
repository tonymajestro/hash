package hash.set;

import java.util.ArrayList;

public class GenericHashSet<T> {

    // Array of ArrayList<T>
    private ArrayList<T>[] map;

    public GenericHashSet(int size) {
        map = new ArrayList[size];

        for (int i = 0; i < size; i++) {
            map[i] = new ArrayList<T>();
        }
    }

    public void add(T value) {
        // value key to generate hash
        int hash = value.hashCode();

        // Convert hash to array location
        int location = getLocation(hash);

        ArrayList<T> values = map[location];

        // Implement add implementation here
    }

    public boolean contains(T value) {
        // value key to generate hash
        int hash = value.hashCode();

        // Convert hash to array location
        int location = getLocation(hash);

        ArrayList<T> values = map[location];

        // Finish contains here
        return false;
    }

    public void remove(T value) {
        // value key to generate hash
        int hash = value.hashCode();

        // Convert hash to array location
        int location = getLocation(hash);

        ArrayList<T> values = map[location];

        // Finish remove here
    }

    /**
     * Finds the array index for the given number
     * The returned index is in between 0 and the length of the boolean set array.
     * <p>
     * E.g. For a set of size 10:
     * simpleHash(0) = 0
     * simpleHash(3) = 3
     * simpleHash(16) = 6
     * simpleHash(1243) = 3
     * simpleHash(-2) = 2
     */
    private int getLocation(int hash) {
        return Math.abs(hash) % map.length;
    }
}
