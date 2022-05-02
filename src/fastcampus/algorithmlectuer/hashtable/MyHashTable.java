package fastcampus.algorithmlectuer.hashtable;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyHashTable<K, V> implements IHashTable<K, V> {

    private static final int DEFAULT_BUCKET_SIZE = 1024;

    private List<Node>[] buckets;
    private int size;
    private int bucketSize;

    public MyHashTable() {
        this.buckets = new List[DEFAULT_BUCKET_SIZE];
        this.bucketSize = DEFAULT_BUCKET_SIZE;
        this.size = 0;

        for (int i = 0; i < bucketSize; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    public MyHashTable(int bucketSize) {
        this.buckets = new List[DEFAULT_BUCKET_SIZE];
        this.bucketSize = DEFAULT_BUCKET_SIZE;
        this.size = 0;

        for (int i = 0; i < bucketSize; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value) {
        int idx = this.hash(key);
        List<Node> bucket = this.buckets[idx];
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                node.data = value;
                return;
            }
        }
        Node node = new Node(key, value);
        bucket.add(node);
        this.size++;
    }

    public V get(K key) {
        int idx = this.hash(key);
        List<Node> bucket = this.buckets[idx];
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                return node.data;
            }
        }
        return null;
    }

    public boolean delete(K key) {
        int idx = this.hash(key);
        List<Node> bucket = this.buckets[idx];
        for (Iterator<Node> iterator = bucket.iterator(); iterator.hasNext(); ) {
            Node node = iterator.next();
            if (node.key.equals(key)) {
                iterator.remove();
                this.size--;
                return true;
            }
        }
        return false;
    }

    public boolean contains(K key) {

        int idx = this.hash(key);
        List<Node> bucket = this.buckets[idx];
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    private int hash(K key) {
        int hash = 0;
        for (Character ch : key.toString().toCharArray()) {
            hash += (int) ch;
        }
        return hash % this.bucketSize;
    }

    public class Node {
        K key;
        V data;

        Node(K key, V data) {
            this.key = key;
            this.data = data;
        }
    }

}
