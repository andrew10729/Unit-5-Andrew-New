public class Slogan {
    private String phrase;
    private static int Count = 0;

    public Slogan(String slogan) {
        phrase = slogan;
        Count = Count + 1;

    }

    public static int getCount() {
        return Count;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
