import java.util.logging.XMLFormatter;

public class Casting1 {
    public static void main(String[] args) {
        // De entero a entero pequeño
        int numeroEntero = 36;
        byte numeroPequeño = (byte) numeroEntero;
        System.out.println(numeroEntero);
        System.out.println(numeroPequeño);
        // De decimal a entero
        float numeroCientificoLargo = 3.1f;
        // Distintos tipos de redondeo:
        int X = (int)Math.round(numeroCientificoLargo);
        int Y = (int) Math.ceil(numeroCientificoLargo);
        int Z = (int) Math.floor(numeroCientificoLargo);

        System.out.println(X);
        System.out.println(Y);
        System.out.println(Z);
        // De numero int a char
        int numero = 65;
        char caracter = (char) numero;
        System.out.println(caracter);
        char caracter2 = (char) ((numero + 1));
        System.out.println(caracter2);
        // Conversiones de string a numeros
        String leer = "12";
        byte numeroMuyPequeño= Byte.parseByte(leer);
        short numPequeño = Short.parseShort(leer);
        int numEntero = Integer.parseInt(leer);
        long numLargo = Long.parseLong(leer);
        float numDecimal = Float.parseFloat(leer);
        double numDecimalLago = Double.parseDouble(leer);
        System.out.println(numeroMuyPequeño);
        System.out.println(numPequeño);
        System.out.println(numEntero);
        System.out.println(numLargo);
        System.out.println(numDecimal);
        System.out.println(numDecimalLago);

    }
}
