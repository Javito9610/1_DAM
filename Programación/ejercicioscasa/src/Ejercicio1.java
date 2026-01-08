import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean correcto = false;

        while (!correcto) {

            System.out.println("Dígame un número divisible entre siete y mayor que cincuenta:");

            try {
//                El scanner nextInt siempre dentro del try para por si en el caso de que de intruduzca un elemento no numerico, pueda detectarlo el catch
                int numeroDivisible = scanner.nextInt();

                if (numeroDivisible % 7 == 0 && numeroDivisible > 50) {
                    System.out.println("Correcto máquina....");
                    correcto = true;
                } else {
                    System.out.println("Incorrecto, el número no ha acertado con las características de ser mayor que 50 y divisible entre siete. Vuelva a intentarlo.....");
                }


            }catch (Exception Error){
                System.out.println("Esto es una letra. Vuelva a intentarlo");
                scanner.nextLine();
            }
        }
    }
}
