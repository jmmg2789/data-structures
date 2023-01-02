import java.util.ArrayList;

public class MyArray {

    int length = 0;
    ArrayList<String> data = new ArrayList<>();

    public MyArray(int length, ArrayList<String> data) {
        this.length = length;
        this.data = data;
    }

    public String getData(int index) {
        return data.get(index);
    }

    public void addData(String data) {
        this.data.add(data);
        this.length++;
    }

    public void removeLast() {
        this.data.remove(this.length-1);
        this.length--;
    }

    public void removeData(int index) {
        String item = getData(index);
        shiftItems(index);
    }

    public void shiftItems(int index) {
        for (int i = 0; i < this.length - 1; i++) {

        }
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray(0,new ArrayList<>());

        myArray.addData("hello");
        System.out.println(myArray);
    }

}
