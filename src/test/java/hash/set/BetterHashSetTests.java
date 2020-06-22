package hash.set;

import hash.set.BetterHashSet;
import org.junit.Assert;
import org.junit.Test;

public class BetterHashSetTests {
    @Test
    public void testAddAndContains() {
        BetterHashSet set = new BetterHashSet(100);
        set.add(-1);
        set.add(234);

        Assert.assertTrue(set.contains(-1));
        Assert.assertTrue(set.contains(234));

        Assert.assertFalse(set.contains(12309));
    }

    @Test
    public void testRemove() {
        BetterHashSet set = new BetterHashSet(100);
        set.add(1);

        Assert.assertTrue(set.contains(1));

        set.remove(1);
        Assert.assertFalse(set.contains(1));
    }

    //
    // Tests that show why BetterHashSet isn't the best
    //

    @Test
    public void testContainsFailsOnCollisions() {
        BetterHashSet set = new BetterHashSet(10);

        // Hashes to 1
        set.add(1);

        // Should be false, but is actually true
        // 11 also hashes to 1, so the set thinks that 11, 21, 31, etc are all in the set
        Assert.assertTrue(set.contains(11));
        Assert.assertTrue(set.contains(21));
        Assert.assertTrue(set.contains(31));
    }
}

