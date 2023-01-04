public class RecursionIntro {

    int counter = 0;

    public String inception() {
        if (counter > 3) {
            return "Done!";
        }
        counter++;
        return inception();
    }

    public static void main(String[] args) {
        RecursionIntro ex = new RecursionIntro();
        System.out.println(ex.inception());
    }

}
