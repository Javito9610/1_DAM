package division2;

import java.util.Scanner;

public class Dividiendo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            boolean haFalladoElPrimerNumero = false;
            int x = 0;
            int y = 0;

            try {

                System.out.println("Introduce el primer número:");

                 x = input.nextInt();

            } catch (Exception Error) {

                 haFalladoElPrimerNumero = true;

            }


            if (haFalladoElPrimerNumero) {

                System.out.println("Debes introducir un número entero.");


            } else {

                input.nextLine();

                try {

                    System.out.println("Introduce el segundo número:");

                    y = input.nextInt();

                } catch (Exception Error) {

                    System.out.println("Debes introducir un número entero.");

                }

                double z = (x/y);

                System.out.println("La división es:" + z);
                System.out.println("Y el resto es:" + (x%y));

            }
    }
}
