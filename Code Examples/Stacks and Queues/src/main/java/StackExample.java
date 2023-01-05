import java.util.Stack;

public class StackExample {

    Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        StackExample stackExample = new StackExample();

        stackExample.stack.push("Hello");
        stackExample.stack.push("my");
        stackExample.stack.push("name");
        stackExample.stack.push("is");
        stackExample.stack.push("Jose");

        System.out.println(stackExample.stack);
        System.out.println(stackExample.stack.peek());

        stackExample.stack.push("ya heard");
        System.out.println(stackExample.stack);

        stackExample.stack.pop();
        System.out.println(stackExample.stack.peek());

    }

}
