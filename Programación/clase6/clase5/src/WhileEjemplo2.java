import java.util.Scanner;

public class WhileEjemplo2 {
    public static void main(String[] args) {

        int opcion = 0;
        while (opcion == 0){

            System.out.println("ELIGE OPCION");
            System.out.println("1. Lo que sea");
            System.out.println("2. Lo que sea 2");
            System.out.println("3. Salir");

            Scanner scanner = new Scanner(System.in);
            try {
                int aux = scanner.nextInt();

                if (aux == 1 || aux == 2) {
                    opcion = aux;
                } else if (aux==3) {
                    System.out.println("Adiosssssss");
                    opcion=aux;
                } else {
                    System.out.println("Número incorrecto...");
                    opcion = 0;
                }
            }catch (Exception Error){
                System.out.println("Ni siquiera es un número....");
                opcion=0;
            }
            System.out.println("Se finí");
        }
    }
}
