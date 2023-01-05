import java.util.ArrayList;

public class Exercise03 {

    // implement a function that reverses a string using iteration and recursion

    public String reverseIterative(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public String reverseRecursive(String str) {
        if (str.isEmpty()) {
            return "";
        } else {
            return reverseRecursive(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        Exercise03 ex = new Exercise03();

        System.out.println(ex.reverseIterative("yoyo mastery"));
        System.out.println(ex.reverseRecursive("yoyo mastery"));
    }

}
