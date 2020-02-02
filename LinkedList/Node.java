package LinkedList;

class Node<T> {
    Node<T> next;
    T data;

    public Node(T data) {
        this.next = null;
        this.data = data;
    }
    public boolean isNull(){
        return this.data == null;
    }
}