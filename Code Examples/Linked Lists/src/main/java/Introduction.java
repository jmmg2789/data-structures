
public class Introduction {

    // call to a linked list

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.nextNode(5);
        linkedList.nextNode(16);

        System.out.println(linkedList.toString());
    }
}
