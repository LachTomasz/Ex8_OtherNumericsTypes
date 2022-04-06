import java.nio.charset.StandardCharsets;

public class Kodowanie {
    public static void main(String[] args) {
        String arg = args[0];
        System.out.print("String: "+arg+"\tpo zamianie na ciąg odpowiadających bajtów: ");
        byte[] kod = arg.getBytes(StandardCharsets.UTF_8);

        System.out.println(String.valueOf(arg.toCharArray()));
    }
}
