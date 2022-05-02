package fastcampus.algorithmlectuer.queue;

public class MyQueue<T> implements IQueue<T> { // 링크드리스트를 이용한 구현

    private Node head;
    private Node tail;
    private int size;

    public MyQueue() {
        this.size = 0;
        this.head = new Node(null); // dummy node
        this.tail = this.head;
    }

    @Override
    public void offer(T data) {
        Node node = new Node(data);
        this.tail.next = node;
        this.tail = this.tail.next;
        this.size++;
    }

    @Override
    public T poll() { // dequeue 연산
        if (this.isEmpty()) {
            throw new IllegalStateException();
        }
        Node node = this.head.next;
        this.head.next = node.next;
        node.next = null;
        this.size--;

        if (this.head.next == null) {
            this.tail = this.head;
        }
        return node.data;
    }

    @Override
    public T peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException();
        }
        return this.head.next.data;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        this.head.next = null;
        this.tail = head;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == null;
    }

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
