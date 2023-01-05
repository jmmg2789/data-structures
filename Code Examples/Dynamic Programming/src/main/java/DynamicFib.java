public class DynamicFib {

    int calculations = 0;

    public Cache fibonacciMaster(int n) {
        Cache cache = new Cache();
        fib(n,cache);
        return cache;
    }

    public int fib(int n, Cache cache) {
        calculations++;

        if (cache.mem.containsKey(n)) {
            return cache.mem.get(n);
        } else {
            if (n < 2) {
                return n;
            } else {
                cache.mem.put(n,fib(n-1,cache) + fib(n-2,cache));
                return cache.mem.get(n);
            }
        }
    }

    public static void main(String[] args) {
        DynamicFib ex = new DynamicFib();

        System.out.println(ex.fibonacciMaster(35).mem);
        System.out.println(ex.calculations);
    }

}
