public class LinkedList<T> {

    private static class Node<T> {

        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this(data, null);
        }

        public Node(T data, Node<T> next) {
            this(data, next, null);
        }

        public Node(T data, Node<T> next, Node<T> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public T getData() {
            return data;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public Node<T> getNext() {
            return next;
        }

        public Node<T> getPrev() {
            return prev;
        }
    }

    /**
     * This is the first node in the list.
     */
    private Node<T> head;

    /**
     * This is the last node in the list.
     */
    private Node<T> tail;

    /**
     * This is the number of entries in the list.
     */
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    /**
     * This method adds the given {@code data} to the start of the list.
     * 
     * @param data the data to be added into the list.
     */
    public void addFirst(T data) {
        if (head != null) {
            Node<T> temp = new Node<>(data, head, null);
            head.prev = temp;
            head = temp;
        } else {
            Node<T> temp = new Node<>(data);
            head = temp;
            tail = temp;
        }
        size++;
    }

    /**
     * This method adds the given {@code data} to the end of the list.
     * 
     * 
     * 
     */
    public void addLast(T data) {
        if (tail != null) {
            Node<T> temp = new Node<>(data, null, tail);
            tail.next = temp;
            tail = temp;
        } else {
            Node<T> temp = new Node<>(data);
            head = temp;
            tail = temp;
        }
        size++;
    }

    /**
     * This method returns and removes the first entry of the list.
     * 
     * @return the last entry of the list.
     */
    public T removeFirst() {
        // TODO

        // This return statement is only to let the code compile as is.
        // When you are ready, replace this return statement with the correct
        // value.
        if (head == null) {
            return null;
        }

        T res = head.getData();
        if (head.getNext() != null) {
            head = head.getNext();
            head.prev = null;
        } else {
            head = null;
            tail = null;
        }

        size--;
        return res;
    }

    /**
     * This method returns and removes the last entry of the list.
     * 
     * @return the last entry of the list.
     */
    public T removeLast() {
        // TODO

        // This return statement is only to let the code compile as is.
        // When you are ready, replace this return statement with the correct
        // value.

        if ((tail == null) || (head == null)) {
            return null;
        }

        T res = tail.getData();
        if (tail.prev != null) {
            tail = tail.prev;
            tail.next = null;
        } else {
            head = null;
            tail = null;
        }

        size--;
        return res;
    }

    public String toString() {
        String res = "[";
        Node<T> walker = head;

        if (size == 0) {
            return "[]";
        }

        for (int i = 0; i < size - 1; i++) {
            res += walker.getData();
            res += ", ";

            walker = walker.getNext();
        }
        res += walker.getData() + "]";

        return res;
    }
}