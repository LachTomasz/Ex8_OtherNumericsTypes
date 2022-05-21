import com.sun.jdi.ByteValue;

import javax.print.DocFlavor;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Dekodowanie {
    public static void main(String[] args) {
        String test;
        byte[] kod = {115, 122, 121, 102, 114};
        System.out.println("Ciąg znaków: " + Arrays.toString(kod));
        String wynik = new String(kod);
        System.out.println("Tekst: " + wynik);
        }
}
