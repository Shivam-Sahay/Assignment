public class Main1 {
    public static void main(String[] args)
    {
        try {
            Class.forName("Example");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
