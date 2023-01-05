import java.util.ArrayList;

public class Exercise01 {

    // we want to return a string in reverse, given a string
    // we are given a string, and we want to reverse the order of it

    // my implementation
    public String reverse(String string) {
        // check input first
        if (string == null || string.length() < 2 || string.isEmpty()) {
            return "Invalid input";
        }

        // want to have an empty string where we will build the reverse
        String reverse = "";
        // set up an array to save the given string
        ArrayList<String> str = new ArrayList<>();

        // save each character in the string in an array
        for (int i = 0; i < string.length(); i++) {
            str.add(String.valueOf(string.charAt(i)));
        }
        // loop backwards from our list and add each character to our empty string
        for (int i = str.size() - 1; i >= 0; i--) {
            reverse += str.get(i);
        }
        // returns the reversed string
        return reverse;
    }

    public static void main(String[] args) {
        Exercise01 exercise01 = new Exercise01();
        String string = "Hi my name is Jose";

        System.out.println(string);
        System.out.println(exercise01.reverse(string));
    }

}
