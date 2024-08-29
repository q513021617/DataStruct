package DataStruct.Linklist;

public class LRUTest {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");
        System.out.println(cache.get(1)); // 输出a
        cache.put(4, "d");
        System.out.println(cache.get(2)); // 输出null
        System.out.println(cache.get(1)); // 输出a
        cache.put(5, "e");
        cache.clear();
        System.out.println(cache.size()); // 输出0
    }
}
