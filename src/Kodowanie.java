public class Kodowanie {
    public static void main(String[] args) {
        String arg = args[0];
        System.out.print("String: "+arg+"\tpo zamianie na ciąg odpowiadających bajtów: ");
        System.out.println(String.valueOf(arg.toCharArray()));
    }
}
