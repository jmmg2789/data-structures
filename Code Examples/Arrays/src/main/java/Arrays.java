import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {
        // dynamic array
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        // 4 items * 4 addresses (in a 32 bit system) = 16 bytes of storage used for this array

        // add
        strings.add("e"); // can be O(n)
//        System.out.println(strings);

        // remove
        strings.remove(4); // O(1)
//        System.out.println(strings);

        // 'unshift' in Java (insert)
        strings.add(0,"x"); // O(n)
//        System.out.println(strings);
    }

}
