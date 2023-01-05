import java.util.HashMap;
import java.util.Map;

public class Exercise01 {

    // given an array, return the first recurring character

    // my first attempt, time complexity O(n)
    public Integer firstRecurringCharacter(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        Map<Integer, Integer> uniqueNumbers = new HashMap<>();
        int key = 0;

        for (int num : nums) {
            if (!uniqueNumbers.containsValue(num)) {
                uniqueNumbers.put(key,num);
                key++;
            } else {
                return num;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] a1 = {2,5,1,2,3,5,1,2,4};
        int[] a2 = {2,1,1,2,3,5,1,2,4};
        int[] a3 = {2,3,4,5};
        int[] a4 = {};
        int[] a5 = {1,2,3,4,5,6,7,8,9,10,10};

        Exercise01 code = new Exercise01();

        System.out.println(code.firstRecurringCharacter(a1));
        System.out.println(code.firstRecurringCharacter(a2));
        System.out.println(code.firstRecurringCharacter(a3));
        System.out.println(code.firstRecurringCharacter(a4));
        System.out.println(code.firstRecurringCharacter(a5));

    }

}
