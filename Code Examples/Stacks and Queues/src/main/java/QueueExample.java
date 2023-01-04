import java.util.LinkedList;

public class QueueExample {

    LinkedList<String> queue = new LinkedList<>();

    public String peek() {
        System.out.println(queue.get(0));
        return queue.get(0);
    }

    public void enqueue(String item) {
        queue.add(item);
        System.out.println(item + " successfully queued.");
    }

    public void dequeue() {
        queue.removeFirst();
        System.out.println("Successfully removed from queue.");
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
