package operadores;

public class Operadores {
    public static void main(String[] args) {
        String saludo = "hola";
        int numero = 10;
        System.out.println(saludo+numero);

        int x = 2;
        int y = 3;
//        Sumar
        System.out.println(x + y);
//        Restar
        System.out.println(x - y);
//        Multiplicar
        System.out.println(x * y);
//        Division
        System.out.println(x / y);
//        Resto
        System.out.println(100 % 12);
//        Por ciento
        System.out.println(100 * 0.6);
//        Sumar uno a un numero
        x=x+1;
//        Es lo mismo que
              x+=1;
        System.out.println(x);
//        Para multiplicar por un número
        x *= 27;

        y %= 2;
        System.out.println(y);
//        manera mas rapida de sumar uno a un numero
        y++;
        System.out.println(y);
//        Tambien vale para restar uno
        y--;
        System.out.println(y);
//                Recordatorio escribir siempre en camelCase


    }
}
