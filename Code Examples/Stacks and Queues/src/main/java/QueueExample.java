import java.util.LinkedList;

public class QueueExample {

    LinkedList<String> queue = new LinkedList<>();

    public static void main(String[] args) {

        QueueExample ex = new QueueExample();

        ex.queue.add("my");
        ex.queue.add("name");
        ex.queue.add("is");
        ex.queue.add("Jose");

        System.out.println(ex.queue);
        ex.queue.addFirst("Hello");
        System.out.println(ex.queue);
        System.out.println(ex.queue.getFirst());

    }

}
