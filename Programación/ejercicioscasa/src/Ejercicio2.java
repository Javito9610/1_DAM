import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean correcto = false;
        do {
            System.out.println("Dígame un número negativo, el que sea.");
            try{
                int numeroNegativo = scanner.nextInt();
                if(numeroNegativo > 0){
                    System.out.println("Tiene que ser menor que cero. Prueba otra vez");
                }else{
                    System.out.println("Acertaste, bien hecho.");
                    correcto = true;
                }

            }catch(Exception Error){
                System.out.println("Ésto es una letra. Debe ser un número y negativo.");
                scanner.nextLine();
            }
        }while(!correcto);


    }
}
