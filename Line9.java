import java.io.IOException;

public class Line9 {
    public static void ellipsis(String text, int millis) 
    {
        System.out.print(text);
        System.out.flush();
        for(int i = 0; i < 3; i ++) {
            try {
                Thread.sleep(millis);
            } catch(InterruptedException exc) {
            }
            System.out.print('.');
            System.out.flush();
        }
        System.out.print('\n');
    }
    
    public static void main(String[] args) {
        System.out.println("And another...");
        System.out.println("Until...");

        try {
            Runtime.getRuntime().exec(new String[] { "love", "." });
        } catch(IOException exc) {
            System.err.println("Can't run line 10");
        }
    }
}
