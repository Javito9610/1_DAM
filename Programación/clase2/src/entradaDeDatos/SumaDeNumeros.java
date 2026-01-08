package entradaDeDatos;

import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //         el try catch sirve para ejecutar un código y si se pruduce un fallo dentro del try se ejecuta el catch
        //         lo llamo input pero puedo llamarlo como quiera
        //         Defino antes la veriable para que sea reconocida y no me de error
        int x = -1;
        int y = -1;

        boolean haFalladoElPrimero = false;

        try {
            System.out.println("Introduce el primer número:");
            x = input.nextInt();
        // La e es una variable. Sepuede poner lo que se quiera
        } catch (Exception e) {
            haFalladoElPrimero = true;
        }
        // if (haFalladoElPrimero == true) es lo mismo que lo de abajo
        if (haFalladoElPrimero) {
            System.out.println("Ha fallado el primero");
            System.out.println("El primer numero tiene que ser un numero.");
        } else {
            // if (haFalladoElPrimero == false) es lo mismo que if (!haFalladoElPrimero)
            //         Hago limpieza de buffer
            input.nextLine();
            try {
                System.out.println("Introduce el segundo número:");
                y = input.nextInt();
                int resultado = x + y;
                System.out.println("La suma es:" + resultado);
            } catch (Exception e) {
                System.out.println("El segundo numero tiene que ser un numero:");
            }

        }
    }
}
