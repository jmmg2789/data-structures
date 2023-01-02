import java.sql.Time;
import java.time.LocalTime;
import java.time.temporal.TemporalAmount;

public class App {

    public void findNemo(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase("nemo")) {
                System.out.println("Found nemo!");
                break;
            }
        }
    }

    public void printFirstTwo(int[] boxes) {
        System.out.println(boxes[0]);
        System.out.println(boxes[1]);
    }

    public void printPairs(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0 ; j--) {
                System.out.println(nums[i] + " " + nums[j]);
            }
        }
    }

    public void boooo(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println("BOOO!");
        }
    }

    public static void main(String[] args) {
        String[] nemo = {"nemo"};
        int[] boxes = {0,1,2,3,4,5};
        int[] nums = {1,2,3,4,5};

        App app = new App();
//        app.findNemo(nemo);
//        app.printFirstTwo(boxes);
//        app.printPairs(nums);
        app.boooo(nums);

    }

}
