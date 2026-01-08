import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x=0;

        ArrayList<String> list = new ArrayList<>();

        boolean añadirMas = true;
        while (añadirMas) {

            System.out.println("Dígame el producto que escoge.");

            String valor = scanner.nextLine();

            list.add(x, valor);

            boolean eleccionCorrecta = false;
            while (!eleccionCorrecta) {

                System.out.println("¿Quiere añadir algun elemento más a la lista?");
                System.out.println("------------------1. Si----------------------");
                System.out.println("------------------2. No----------------------");

                try {

                    int y = scanner.nextInt();


                    if (y == 1) {
                        System.out.println("Sigamos añadiendo.");
                        x++;
                        añadirMas = true;
                        eleccionCorrecta = true;
                        scanner.nextLine();
                    } else if (y == 2) {
                        System.out.println("Su lista será:");
                        System.out.println(Arrays.toString(list.toArray()));
                        añadirMas = false;
                        eleccionCorrecta = true;
                    } else {
                        System.out.println("Valor introducido incorrecto vuelva a intentar.");
                        eleccionCorrecta = false;
                        scanner.nextLine();
                    }

                } catch (Exception Error) {
                    System.out.println("Valor introducido incorrecto, vuelva a intentar.");
                    eleccionCorrecta = false;
                    scanner.nextLine();
                }
            }

        }
        boolean cambiarElemento = true;
        while (cambiarElemento) {
            boolean elementoCorrecto = false;
            while (!elementoCorrecto) {

                System.out.println("¿Desea cambiar algún elemento?");
                System.out.println("------------1. Si-------------");
                System.out.println("------------2. No-------------");

                try {

                    int z = scanner.nextInt();

                        if (z == 1) {
                            System.out.println("Digame el número del elemento de la lista que quiere cambiar, teniendo en cuenta que el cero corresonde al primer elemento:");



                            try {

                                int w = scanner.nextInt();
                                scanner.nextLine();
//                                Uso de scanner.nextLine() después de scanner.nextInt(): Esto es importante para limpiar el buffer después de leer un entero y evitar saltarse la siguiente entrada.

                                if (w >= 0 && w < (list.size())) {

                                    System.out.println("Digame el valor por el que lo quiere sustituir:");
                                    String valorSust = scanner.nextLine();

                                    list.set(w, valorSust);

                                    elementoCorrecto = true;

                                } else {
                                    System.out.println("El valor no pertenece a ninguno de los índices de la lista, de hecho no es ni un número. Inténtelo de nuevo:");

                                    elementoCorrecto = false;

                                }
                            }catch (Exception Error){

                                System.out.println("El valor no pertenece a ninguno de los índices de la lista, de hecho no es ni un número. Inténtelo de nuevo:");

                                elementoCorrecto = false;

                                scanner.nextLine();

                            }

                        }else if (z == 2) {
                            System.out.println("Pues su lista final será:");
                            System.out.println(list);

                            cambiarElemento=false;
                            elementoCorrecto=true;
                        }else {
                            System.out.println("Valor introducido incorrecto. vuelva a intentarlo.");

                            scanner.nextLine();
                        }

                }catch (Exception Error) {
                    System.out.println("Valor introducido incorrecto. Vuelva a intentarlo");

                    scanner.nextLine();
                }
            }
        }
    }
}
