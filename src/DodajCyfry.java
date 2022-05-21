import java.nio.charset.StandardCharsets;
import java.lang.Character;
public class DodajCyfry {
    public static void main(String[] args) {
        String arg = args[0];
        long Wynik = 0;
        int cyfra;
        String temp;
        //postać tekstu - łańcucha znaków (cyfr)
        // reprezentujących tę liczbę
        System.out.println("Podana liczba to: " + arg);
        byte[] cyfry = arg.getBytes();
        for (byte b: cyfry) Wynik +=(b-48);
        System.out.println("Suma cyfr w tej liczbie: " + Wynik);
        System.out.println("======================================");
        //jako wartość typu long

        try {
            long Liczba = Long.decode(arg);
            System.out.println(Liczba);

        }
        catch (Exception e){
            System.out.println("Podałeś liczbę w złym formacie");
        }
    }
}
