import java.util.ArrayList;

public class MyLinkedList {
    // 'creating' a linked list from scratch

    ArrayList<Integer> nodes = new ArrayList<>();
    int head;
    int value;
    Integer next;
    int tail;
    int length;

    public MyLinkedList(int value) {
        this.head = value;
        this.value = value;
        this.next = null;
        this.tail = this.head;
        this.length = 1;
        append(value);
    }

    public void nextNode(int value) {
        this.value = value;
        this.next = null;
        this.tail = value;
        this.length++;
        append(value);
    }

    public void append(int value) {
        nodes.add(head);
        nodes.add(value);
        nodes.add(next);
        nodes.add(tail);
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "nodes=" + nodes +
                ", head=" + head +
                ", value=" + value +
                ", next=" + next +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}
