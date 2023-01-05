import java.util.Stack;

public class Exercise01 {

    Stack<Integer> stack = new Stack<Integer>();

    public Exercise01() {

    }

    public void push(Integer item) {
        stack.push(item);
    }

    public void pop() {
        System.out.println(stack.get(0));
        stack.remove(0);
    }

    public Integer peek() {
        System.out.println(stack.get(0));
        return stack.get(0);
    }

    public boolean empty() {
        return stack.empty();
    }

    public static void main(String[] args) {
        Exercise01 ex = new Exercise01();

        ex.push(1);
        ex.push(2);
        ex.peek();
        ex.pop();
        System.out.println(ex.empty());
    }

}
