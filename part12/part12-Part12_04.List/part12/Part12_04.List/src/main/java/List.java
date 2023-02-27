public class List {
    private Node head;
    private Node tail;
    private int size;

    public List() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = new Node(value);
        if (index == 0) {
            node.setNext(head);
            head = node;
        } else if (index == size) {
            tail.setNext(node);
            tail = node;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.getNext();
            }
            node.setNext(prev.getNext());
            prev.setNext(node);
        }
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getValue();
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        int value;
        if (index == 0) {
            value = head.getValue();
            head = head.getNext();
        } else if (index == size - 1) {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.getNext();
            }
            value = prev.getNext().getValue();
            prev.setNext(null);
            tail = prev;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.getNext();
            }
            value = prev.getNext().getValue();
            prev.setNext(prev.getNext().getNext());
        }
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
