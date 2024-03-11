package impl;

public class Node<E> {
    private E item;
    private Node<E> prev;
    private Node<E> next;

    public Node(E item, Node<E> prev, Node<E> next) {
        this.item = item;
        this.prev = prev;
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
