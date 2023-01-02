import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise02 {

    // given 2 sorted arrays, merge them

    // my first attempt, I think O(n log(n)) because of the sort before returning
    public ArrayList<Integer> mergeArrays(int[] array1, int[] array2) {
        ArrayList<Integer> merged = new ArrayList<>();

        for (int num1 : array1) {
            merged.add(num1);
        }
        for (int num2: array2) {
            merged.add(num2);
        }

        Collections.sort(merged);

        return merged;
    }

    public int[] newMerge(int[] array1, int[] array2) {
        // first check input
        if (array1.length == 0) {
            return array2;
        }
        if (array2.length == 0) {
            return array1;
        }

        int[] merged = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                merged[k] = array1[i];
                i++;
            } else {
                merged[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < array1.length) {
            merged[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length) {
            merged[k] = array2[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void main(String[] args) {
        Exercise02 exercise02 = new Exercise02();

        System.out.println(Arrays.toString(exercise02.newMerge(new int[]{0, 3, 4, 31}, new int[]{4, 6, 30})));
    }

}
