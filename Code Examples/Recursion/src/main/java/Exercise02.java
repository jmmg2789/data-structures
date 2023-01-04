import java.util.ArrayList;

public class Exercise02 {

    // given a number N, return the index value of the fibonacci sequence
    // where the sequence is:
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
    // pattern is that each value is the sum of the 2 previous values
    // for example, N = 5 -> 2+3

    public int fibonacciIterative(int n) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);

        for (int i = 2; i < n + 1; i++) {
            sequence.add(sequence.get(i-2) + sequence.get(i-1));
        }

        return sequence.get(n);
    }

    public int fibonacciRecursive(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        Exercise02 ex = new Exercise02();
        System.out.println(ex.fibonacciRecursive(3));
        System.out.println(ex.fibonacciIterative(3));
    }

}
