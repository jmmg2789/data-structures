import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise01 {

    // Given 2 arrays, create a function that lets a user know (T/F) whether
    // these two arrays contain any common items

    // For example
    // char[] array1 = {'a','b','c','x'};
    // char[] array2 = {'z','y','i'};
    // should return false since no common items
    // -----------------
    // char[] array1 = {'a','b','c','x'};
    // char[] array2 = {'z','y','x'};
    // should return true due to both containing 'x'

    // we have 2 parameters and the function returns true/false

    // brute force solution, inefficient, O(n^2)
    public boolean inefficientSolution(char[] array1, char[] array2) {

        for (char value1 : array1) {
            for (char value2 : array2) {
                if (value1 == value2) {
                    return true;
                }
            }
        }
        return false;
    }

    // my first try solution
    public boolean containCommonItems(char[] array1, char[] array2) {

        for (char c : array1) {
            if (Arrays.asList(array2).contains(c)) {
                return true;
            }
        }

        return false;
    }

    // better implementation, O(n)
    public boolean checkEquality(char[] array1, char[] array2) {
        // convert first array into an object and only need to loop through the second
        // to check if it contains the property in the first 'object'

        while (array1.length > 0 && array2.length > 0) {
            Map<Character, Boolean> values = new HashMap();

            for (char c : array1) {
                if (!values.containsKey(c)) {
                    values.put(c, true);
                }
            }
            for (char c : array2) {
                if (values.containsKey(c)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        char[] array1 = {'a','b','c','x'};
        char[] array2 = {'z','y','x'};

        Exercise01 test = new Exercise01();

//        System.out.println(test.containCommonItems(array1,array2));
        System.out.println(test.checkEquality(array1,array2));

    }

}
