import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Esto es un uno");
                break;
            case 25:
                System.out.println("Esto es un 25");
                break;
            default:
                System.out.println("Numero raro");
        }

        switch (opcion){
            case 1:
                System.out.println("1");
                int x = 2;
                int y = 4;
                System.out.println(x+y);
                break;
            case 2:
                System.out.println("2");
                int x_Numero = 2;
                int y_Edad = 4;
                System.out.println(x_Numero+y_Edad);
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Esto es un default");

        }

    }
}
