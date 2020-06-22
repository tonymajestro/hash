package hash.map;

import java.util.ArrayList;

/**
 * Generic HashMap. Collisions are handled using an ArrayList.
 */
public class GenericHashMap<TKey, TValue> {

    // Array of ArrayList<Pair<TKey, TValue>>
    // Each array list stores list of all keys that map to the same
    // hashcode.
    private ArrayList<Pair<TKey, TValue>>[] map;

    public GenericHashMap(int size) {
        map = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            map[i] = new ArrayList<Pair<TKey, TValue>>();
        }
    }

    public void put(TKey key, TValue value) {
        // value key to generate hash
        int hash = key.hashCode();

        // Convert hash to array location
        int location = getLocation(hash);

        // Get list of collisions
        ArrayList<Pair<TKey, TValue>> collisions = map[location];

        // Check if the key already exists
        Pair<TKey, TValue> pair = find(key, collisions);

        // Implement put here
    }

    public TValue get(TKey key) {
        // value key to generate hash
        int hash = key.hashCode();

        // Convert hash to array location
        int location = getLocation(hash);

        ArrayList<Pair<TKey, TValue>> collisions = map[location];

        // Check if the key already exists
        Pair<TKey, TValue> pair = find(key, collisions);

        // Implement get here
        return null;
    }

    public boolean containsKey(TKey key) {
        // value key to generate hash
        int hash = key.hashCode();

        // Convert hash to array location
        int location = getLocation(hash);

        ArrayList<Pair<TKey, TValue>> collisions = map[location];

        // Check if the key already exists
        Pair<TKey, TValue> pair = find(key, collisions);

        // Implement contains key here
        return false;
    }

    public void remove(TKey key) {
        // value key to generate hash
        int hash = key.hashCode();

        // Convert hash to array location
        int location = getLocation(hash);

        ArrayList<Pair<TKey, TValue>> collisions = map[location];

        // Check if the key already exists
    }

    private Pair<TKey, TValue> find(TKey key, ArrayList<Pair<TKey, TValue>> collisions) {
        int index = findIndex(key, collisions);
        if (index < 0) {
            return null;
        } else {
            return collisions.get(index);
        }
    }

    /**
     * Finds the index of the Pair contains the
     */
    private int findIndex(TKey key, ArrayList<Pair<TKey, TValue>> collisions) {
        // Implement find index
        return -1;
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

    private static class Pair<TKey, TValue> {
        TKey key;
        TValue value;

        Pair(TKey key, TValue value) {
            this.key = key;
            this.value = value;
        }
    }
}
