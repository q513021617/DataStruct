package DataStruct.Linklist;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K, V> {
    private int capacity;  // 缓存容量
    private Map<K, DLNode<K, V>> map;  // 哈希表
    private DLNode<K, V> head;  // 双向链表头节点
    private DLNode<K, V> tail;  // 双向链表尾节点
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
// 初始化双向链表
        this.head = new DLNode<>(null, null);
        this.tail = new DLNode<>(null, null);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    /** * 添加数据到缓存中 */
    public void put(K key, V value) {
        DLNode<K, V> node = map.get(key);
        if (node != null) {
// 如果已经存在该节点，则将其移动到链表头部
            removeNode(node);
        } else {
// 如果不存在该节点，则需要添加新节点
            node = new DLNode<>(key, value);
            map.put(key, node);
            if (map.size() > capacity) {
// 如果缓存已满，则需要淘汰最近最少使用的节点
                DLNode<K, V> removedNode = removeLast();
                map.remove(removedNode.key);
            }
        }
        // 将新节点添加到链表头部
        addFirst(node);
    }
    /** * 从缓存中获取数据 */
    public V get(K key) {
        DLNode<K, V> node = map.get(key);
        if (node != null) {
            // 如果存在该节点，则将其移动到链表头部，并返回其值
            removeNode(node);
            addFirst(node);
            return node.value;
        }
        return null;
    }
    /** * 获取当前缓存的大小 */
    public int size() {
        return map.size();
    }
    /** * 清空缓存 */
    public void clear() {
        map.clear();
        head.next = tail;
        tail.prev = head;
    }
    /** * 从双向链表中移除指定节点 */
    private void removeNode(DLNode<K, V> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    /** * 将节点添加到双向链表头部 */
    private void addFirst(DLNode<K, V> node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    /** * 从双向链表尾部移除节点，并返回该节点 */
    private DLNode<K, V> removeLast() {
        DLNode<K, V> node = tail.prev;
        if (node == head) {
            return null;
        }
        removeNode(node);
        return node;
    }
}
