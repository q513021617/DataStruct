package DataStruct.Linklist;

class DLNode<K, V> {
    K key;
    V value;
    DLNode<K, V> prev;
    DLNode<K, V> next;

    public DLNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public DLNode<K, V> getPrev() {
        return prev;
    }

    public void setPrev(DLNode<K, V> prev) {
        this.prev = prev;
    }

    public DLNode<K, V> getNext() {
        return next;
    }

    public void setNext(DLNode<K, V> next) {
        this.next = next;
    }
}
