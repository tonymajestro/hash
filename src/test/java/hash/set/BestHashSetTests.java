package hash.set;

import hash.set.BestHashSet;
import org.junit.Assert;
import org.junit.Test;

public class BestHashSetTests {

    @Test
    public void testAddAndContains() {
        BestHashSet set = new BestHashSet(10);
        set.add(1);
        set.add(2);

        Assert.assertTrue(set.contains(1));
        Assert.assertTrue(set.contains(2));
    }

    @Test
    public void testRemove() {
        BestHashSet set = new BestHashSet(10);
        set.add(1);

        Assert.assertTrue(set.contains(1));

        set.remove(1);
        Assert.assertFalse(set.contains(1));
    }

    @Test
    public void testCollisions() {
        BestHashSet set = new BestHashSet(10);
        set.add(1);

        // Should contain 1
        set.add(1);

        // Should not contain 11, 21, 31, etc
        Assert.assertFalse(set.contains(11));
        Assert.assertFalse(set.contains(21));
        Assert.assertFalse(set.contains(31));
    }
}
