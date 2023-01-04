public class Exercise01 {

    // write two functions that finds the factorial of any number.
    // one should use recursion, the other should just use a for loop

    public int findFactorialRecursive(int num) {
        // establish base case to break recursion
        if (num == 2) {
            return 2;
        }

        // recursively continues multiplying until base case reached
        return num*findFactorialRecursive(num - 1);
    }

    public int findFactorialIterative(int num) {
        // set up a variable to hold solution
        int answer = num;

        // loop will multiply the original number by each descending number until it hits 0
        for (int i = num - 1; i > 0; i--) {
            answer *= i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Exercise01 ex = new Exercise01();
        System.out.println(ex.findFactorialIterative(5));
        System.out.println(ex.findFactorialRecursive(5));
    }

}
