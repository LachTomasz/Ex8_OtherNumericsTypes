import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Kodowanie {
    public static void main(String[] args) {
        String arg = args[0];
        System.out.print("String: "+arg+"\npo zamianie na ciąg odpowiadających bajtów: ");
        byte[] kod = arg.getBytes(StandardCharsets.UTF_8);
        for(byte b : kod) System.out.print(b+", ");
        System.out.println("\b\b.");
        System.out.println("druga opcja:");
        System.out.println(Arrays.toString(arg.getBytes()));
    }
}
