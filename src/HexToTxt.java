public class HexToTxt {
    public static void main(String[] args) {
        String hex = "4B61737A74616E79";
        System.out.print(hex+" -> ");
        //Każde dwie cyfry szesnastkowe (bajt) odpowiadają jednemu znakowi.
        //Tworze tablice bajtów o rozmiarze dwa razy mniejszym od rozmiaru łańcucha.
        byte[] tmp = new byte[hex.length()/2];
        for(int i = 0; i < tmp.length; ++i)
            tmp[i] = Byte.parseByte(hex.substring(2*i,2*i+2), 16);
        System.out.println(new String(tmp));
    }
}
