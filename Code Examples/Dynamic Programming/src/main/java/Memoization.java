public class Memoization {

    public int addTo80(int n) {
        return n+80;
    }

    public int memoizedAddTo80(int n) {
        Cache cache = new Cache();
        if (cache.mem.containsKey(n)) {
            System.out.println(cache.mem);
            return cache.mem.get(n);
        } else {
            cache.mem.put(n,n + 80);
            System.out.println(cache.mem);
            return cache.mem.get(n);
        }

    }

    public static void main(String[] args) {
        Memoization ex = new Memoization();

        System.out.println(ex.memoizedAddTo80(5));
    }

}
