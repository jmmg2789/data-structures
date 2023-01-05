import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] nums) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            int min = i;
            int temp = nums[i];
            for (int j = i+1; j < length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            nums[i] = nums[min];
            nums[min] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        SelectionSort ex = new SelectionSort();

        System.out.println(Arrays.toString(ex.sort(new int[]{0, 9, 4, 5, 6, 8, 10})));
    }

}
