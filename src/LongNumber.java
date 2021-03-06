public class LongNumber {
    public static void main(String[] args) {
        long n  = Long.MAX_VALUE;

        System.out.println("n = "+n);
        System.out.println("BIN = "+Long.toBinaryString(n));
        System.out.println("Hex = "+Long.toHexString(n)+"\n");

        long m = n+1;
        System.out.println("m = "+m);
        System.out.println("BIN: "+Long.toBinaryString(m));
        System.out.println("HEX: "+Long.toHexString(m)+"\n");

        Long max = n;
        System.out.println("Zamiana na typ int. max = "+max.intValue());
        System.out.println("BIN: "+Integer.toBinaryString(max.intValue()));
        System.out.println("HEX: "+Integer.toHexString(max.intValue())+"\n");

        System.out.println("Zamiana na typ int. m = "+(int)m);
        System.out.println("BIN: "+Integer.toBinaryString((int)m));
        System.out.println(("HEX: "+Integer.toHexString((int)m)));

    }
}
