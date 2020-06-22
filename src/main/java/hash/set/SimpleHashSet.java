package hash.set;

/**
 * Simple hash set used to store positive integers smaller than the provided max value
 */
public class SimpleHashSet {
   private boolean[] set;

   public SimpleHashSet(int maxValue) {
       set = new boolean[maxValue + 1];

       for (int i = 0; i < set.length; i++) {
           set[i] = false;
       }
   }

   public void add(int num) {
       if (num >= set.length) {
           throw new IllegalArgumentException("Num is too large for SimpleHashSet");
       } else if (num < 0) {
           throw new IllegalArgumentException("Can only add positive values to SimpleHashSet");
       }

       // Implement add here
   }

   public boolean contains(int num) {
       // Implement contains here
       return false;
   }

   public void remove(int num) {
       // Implement remove here
   }
}
