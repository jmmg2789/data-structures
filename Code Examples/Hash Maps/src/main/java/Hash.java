public class Hash {

    Integer[] data;

    public Hash(int size) {
        this.data = new Integer[size];
    }

    public int _hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.data.length;
        }
        return hash;
    }

    public void setHash(String key, int value) {
        int position = _hash(key);

        if (this.data[position] == null) {
            this.data[position] = value;
        } else {
            System.out.println("Error in storing value.");
        }
    }

    public int getHash(String key) {
        int position = _hash(key);

        return this.data[position];
    }

    public static void main(String[] args) {
        Hash hash = new Hash(50);


    }
}
