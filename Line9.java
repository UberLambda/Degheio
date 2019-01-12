import java.io.IOException;

public class Line9 {
    public static void main(String[] args) {
        System.out.println("And another...");
        System.out.println("Until...");

        try {
            Runtime.getRuntime().exec(new String[] { "love" });
        } catch(IOException exc) {
            System.err.println("Can't run line 10");
        }
    }
}
