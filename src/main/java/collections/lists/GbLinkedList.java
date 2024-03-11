package collections.lists;

import impl.GbList;
import impl.Node;
import java.util.Iterator;


public class GbLinkedList<E> implements GbList<E>, Iterable<E>{
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public GbLinkedList() {
        lastNode = new Node<>(null, firstNode, null);
        firstNode = new Node<>(null, null, lastNode);
    }

    @Override
    public void addLastElement(E e) {
        Node<E> temp = lastNode;
        temp.setItem(e);
        lastNode = new Node<E>(null, temp, null);
        temp.setNext(lastNode);
        size++;
    }

    @Override
    public void addFirstElement(E e) {
        Node<E> temp = firstNode;
        temp.setItem(e);
        firstNode = new Node<>(null, null, temp);
        temp.setPrev(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElemByIndex(int index) {
        Node<E> requiredIndex = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            requiredIndex = getNextElem(requiredIndex);
        }
        return requiredIndex.getItem();
    }
    private Node<E> getNextElem(Node<E> current){
        return current.getNext();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElemByIndex(counter++);
            }
        };
    }

    @Override
    public String toString() {
        Iterator<E> it = iterator();
        if (! it.hasNext())
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
}
