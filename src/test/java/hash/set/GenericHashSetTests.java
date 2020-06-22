package hash.set;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GenericHashSetTests {
    @Test
    public void testAddAndContains() {
        GenericHashSet<String> set = new GenericHashSet<String>(10);
        set.add("abc");
        set.add("def");

        Assert.assertTrue(set.contains("abc"));
        Assert.assertTrue(set.contains("def"));
    }

    @Test
    public void testRemove() {
        GenericHashSet<String> set = new GenericHashSet<String>(10);
        set.add("abc");

        Assert.assertTrue(set.contains("abc"));

        set.remove("abc");
        Assert.assertFalse(set.contains("abc"));
    }

    @Test
    public void testCustomClass() {
        GenericHashSet<Node> set = new GenericHashSet<Node>(10);
        set.add(new Node(10, "abc"));
        set.add(new Node(20, "def"));

        Assert.assertTrue(set.contains(new Node(10, "abc")));
        Assert.assertTrue(set.contains(new Node(20, "def")));

        set.remove(new Node(10, "abc"));
        Assert.assertFalse(set.contains(new Node(10, "abc")));
    }

    private static class Node {
        int num;
        String str;

        public Node(int num, String str) {
            this.num = num;
            this.str = str;
        }

        @Override
        public boolean equals(Object other) {
            Node node = (Node) other;
            return node.num == num && node.str.equals(str);
        }

        @Override
        public int hashCode() {
            int stringHash = str.hashCode();
            return Arrays.hashCode(new int[] { num, stringHash });
        }
    }
}
