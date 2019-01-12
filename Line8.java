import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Line8 {
    public static void main(String[] args) {
        System.out.println("So, scared, he ran away, but he got stuck in a virtual machine...");

        // Compile and run C# for line 9
        try {
            Process p1 = Runtime.getRuntime().exec(new String[] { "csc", "-out:Line9.exe", "Line9.cs"});
            p1.waitFor();
        } catch(IOException | InterruptedException exc) {
            System.err.println("Failed to compile Line9.cs");
        }

        try {
            Process p2 = Runtime.getRuntime().exec(new String[] { "mono", "./Line9.exe"});  // FIXME: What if .NET/.NET core
            // Java is not at all verbose.
            BufferedReader stdout = new BufferedReader(new InputStreamReader(p2.getInputStream()));
            for(String line = ""; line != null; line = stdout.readLine()) {
                if(line.length() == 0) {
                    continue;
                }
                System.out.println(line);
            }
            p2.waitFor();
        } catch(IOException | InterruptedException exc) {
            System.err.println("Failed to run Line9.exe (mono)");
        }
    }
}
