package hash.map;

import org.junit.Assert;
import org.junit.Test;

public class GenericHashMapTests {

    @Test
    public void testPutAndGet() {
        GenericHashMap<String, Integer> map = new GenericHashMap<>(10);
        map.put("abc", 1);
        map.put("def", 2);

        Assert.assertEquals(1, (int) map.get("abc"));
        Assert.assertEquals(2, (int) map.get("def"));

        Assert.assertNull(map.get("not in map"));
    }

    @Test
    public void testContainsKey() {
        GenericHashMap<String, Integer> map = new GenericHashMap<>(10);
        map.put("abc", 1);
        map.put("def", 2);

        Assert.assertTrue(map.containsKey("abc"));
        Assert.assertTrue(map.containsKey("def"));
    }

    @Test
    public void testRemove() {
        GenericHashMap<String, Integer> map = new GenericHashMap<>(10);
        map.put("abc", 1);

        Assert.assertTrue(map.containsKey("abc"));

        map.remove("abc");
        Assert.assertFalse(map.containsKey("abc"));
    }
}
