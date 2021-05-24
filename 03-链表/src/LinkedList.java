public class LinkedList<E> extends AbstractList<E> {
    private Node<E> first;

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    @Override
    public E get(int index) {
        return node(index).elements;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = node(index);
        E prev = node.elements;
        node.elements = element;
        return prev;
    }

    @Override
    public void add(int index, E element) {
        if (index == 0) {
            first = new Node<>(element, first);
        } else {
            Node<E> prev = node(index - 1);
            prev.next = new Node<>(element, prev.next);
        }

        size++;
    }

    @Override
    public E remove(int index) {
        if (index == 0) {
            Node<E> node = first;
            first = node.next;
            return node.elements;
        } else {
            Node<E> prev = node(index - 1);
            Node<E> node = prev.next;
            prev.next = node.next;
            return node.elements;
        }

    }

    @Override
    public int indexOf(E element) {

        Node<E> node = first;
        if (element == null) {
            for(int i = 0; i < size; i++) {
                if (node.elements == element) return i;

                node = node.next;
            }

        } else {
            for(int i = 0; i < size; i++) {
                if (node.elements == element) return i;

                node = node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    public Node<E> node(int index) {
        rangeCheck(index);

        Node<E> node = first;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private static class Node<E> {
        E elements;
        Node<E> next;
        public Node(E elements, Node<E> next) {
            this.elements = elements;
            this.next = next;
        }
    }
}
