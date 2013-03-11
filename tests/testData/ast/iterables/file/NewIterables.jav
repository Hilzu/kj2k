import java.util.*;

public class NewIterables {
    public void test() {
        List<Object> xs = new ArrayList<Object>();
        Deque<Object> ys = new LinkedList<Object>();
        ArrayList<Integer> zs = new ArrayList<Integer>();
        Iterable<Object> is = new Vector<Object>();
        Collection<Object> js = new TreeSet<Object>();
        Set<Object> ks = new HashSet<Object>();
        SortedSet<Object> ws = new TreeSet<Object>();
        Map<Object, Object> as = new HashMap<Object, Object>();
        SortedMap<Object, Object> bs = new TreeMap<Object, Object>();
        xs.add(null);
        zs.add(3);
        zs.add(4);
        ys.add(null);
        js.add("null");
        ks.add(null);
        ws.add("null");
        as.put(null, null);
        bs.put("null", null);
    }
}