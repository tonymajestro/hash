package hash.set;

/**
 * Better hash set used to store any integer.
 * Sometimes will fail due to collisions.
 */
public class BetterHashSet {
    public boolean[] set;

    public BetterHashSet(int size) {
        set = new boolean[size];

        for (int i = 0; i < size; i++) {
            set[i] = false;
        }
    }

    public void add(int num) {
        int location = simpleHash(num);

        // Implement add here
        set[location] = true;
    }

    public boolean contains(int num) {
        int location = simpleHash(num);

        // implement contains here
        return false;
    }

    public void remove(int num) {
        int location = simpleHash(num);

        // implement remove here
    }

    /**
     * Generates a hash for the number.
     * The returned hash is in between 0 and the length of the boolean set array.
     *
     * E.g. For a set of size 10:
     *   simpleHash(0) = 0
     *   simpleHash(3) = 3
     *   simpleHash(16) = 6
     *   simpleHash(1243) = 3
     *   simpleHash(-2) = 2
     */
    private int simpleHash(int num) {
       return Math.abs(num) % set.length;
    }
}
