import java.util.LinkedList;

public class QueueExample {

    LinkedList<String> queue = new LinkedList<>();

    public String peek() {
        if (queue.size() == 0) {
            return "No item in queue.";
        } else {
            System.out.println(queue.get(0));
            return queue.get(0);
        }
    }

    public void enqueue(String item) {
        if (item == null) {
            System.out.println("Cannot add null item.");
        } else {
            queue.add(item);
            System.out.println(item + " successfully queued.");
        }
    }

    public void dequeue() {
        if (queue.size() == 0) {
            System.out.println("No items in queue.");
        } else {
            queue.removeFirst();
            System.out.println("Successfully removed from queue.");
        }
    }

    public static void main(String[] args) {

        QueueExample ex = new QueueExample();

//        ex.queue.add("my");
//        ex.queue.add("name");
//        ex.queue.add("is");
//        ex.queue.add("Jose");
//
//        System.out.println(ex.queue);
//        ex.queue.addFirst("Hello");
//        System.out.println(ex.queue);
//        System.out.println(ex.queue.getFirst());

        ex.enqueue("Ya boi");
        ex.peek();
        ex.enqueue("Ya girl");
        ex.peek();
        System.out.println(ex.queue);
        ex.dequeue();
        ex.peek();

    }

}
