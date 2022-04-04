import com.sun.jdi.ByteValue;

public class MaxPositive {
    public static void main(String[] args) {
        System.out.println("Wartości maxymalne w formacie:\n" +
                        "\t\tHEX\t\t\t\t\tBIN");
        System.out.print("BYTE:\t"+ Integer.toHexString(Byte.MAX_VALUE));
        System.out.println("\t\t\t\t\t"+ Integer.toBinaryString(Byte.MAX_VALUE));
        System.out.print("SHORT:\t"+ Integer.toHexString(Short.MAX_VALUE));
        System.out.println("\t\t\t\t"+ Integer.toBinaryString(Short.MAX_VALUE));
        System.out.print("INT:\t"+ Integer.toHexString(Integer.MAX_VALUE));
        System.out.println("\t\t\t"+ Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.print("LONG:\t"+ Long.toHexString(Long.MAX_VALUE));
        System.out.println("\t"+ Long.toBinaryString(Long.MAX_VALUE));
    }
}
