import com.sun.jdi.ByteValue;

public class Txt2Hex {
    public static void main(String[] args) {
        String text = "Kasztany";
        byte[] textByte = text.getBytes();
        for(byte b : textByte) System.out.print(Integer.toHexString(b).toUpperCase());

    }
}
