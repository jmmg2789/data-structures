import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    public int[] sort(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        BubbleSort ex = new BubbleSort();

        System.out.println(Arrays.toString(ex.sort(new int[]{0, 9, 4, 5, 6, 8, 10})));
    }

}
