import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        System.out.println("introduce número de fílas para la pirámide");
        Scanner scan= new Scanner(System.in);
        int numeroFilas=scan.nextInt();
        int numeroEspacios=numeroFilas-1;
        int numeroEstrellas=1;
        for(int i =1; i<=numeroFilas; i++){
            for(int j=1; j<=numeroEspacios;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=numeroEstrellas; k++){
                System.out.print("*");
            }
            numeroEspacios--;
            numeroEstrellas+=2;
            System.out.println();
        }
    }
}
