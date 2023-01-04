import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] nums) {
        int length = nums.length;

        for(int i = 0; i < length; i++) {
            int temp = nums[i];
            int j = i -1;

            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j = j -1;
            }
            nums[j + 1] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        InsertionSort ex = new InsertionSort();

        System.out.println(Arrays.toString(ex.sort(new int[]{0, 9, 4, 5, 6, 8, 10})));
    }

}
