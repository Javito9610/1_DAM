import java.util.Arrays;
import java.util.Scanner;

public class MenuOpciones {
    public static int imprimirMenu(String titulo, String[] opciones) {
        System.out.println(titulo);
        System.out.println(Arrays.toString(opciones));
        System.out.println("¿Quieres elegir algún elemento en concreto?");
        System.out.println("--------------1. Si.-----------------------");
        System.out.println("--------------2. No.-----------------------");
        Scanner scanner = new Scanner(System.in);
        boolean eleccionCorrecta = false;
        while (!eleccionCorrecta){
            try {
                int eleccion = scanner.nextInt();
                if (eleccion == 1) {
                    System.out.println("Dime el número del elemento que quieres elegir, sabiendo que el cero corresponde al primer elemento");
                    boolean eleccionCorrecta2 = false;
                    while (!eleccionCorrecta2) {
                        try {
                            int numeroElemento = scanner.nextInt();
                            if (numeroElemento >= 0 && numeroElemento < opciones.length) {
                                System.out.println("El número del elemento que has elegiodo es el:" + " " + numeroElemento);
                                System.out.println("Y el elemento es:" + " " + opciones[numeroElemento]);
                                eleccionCorrecta2=true;
                                return numeroElemento;
                            } else {
                                System.out.println("opción incorrecta. Vuelva a intentarlo");
                            }
                        }catch (Exception error){
                            System.out.println("opción incorrecta. Vuelva a intentarlo..");
                            scanner.nextLine();
                        }
                    }

                } else if (eleccion == 2) {
                    System.out.println("Hasta pronto.");
                    eleccionCorrecta = true;
                } else {
                    System.out.println("opción incorrecta. Vuelva a intentarlo");
                }

            }catch (Exception e) {
                System.out.println("opción incorrecta. Vuelva a intentarlo..");
                scanner.nextLine();
            }
        }
        scanner.close();
        return -1;
//        return -1; al Final: Añadimos return -1; al final de imprimirMenu para por si se da la situcion en la que el usuario elige no seleccionar ningun elemento (si se elige la opción 2).
//        para que el return en ese caso devuelva algo al metodo y que no nos de error el metodo int al quedarse vacio, sin que se le retorne ningún valor
//        Tambien he elegido retornar el -1 porque es imposible que sea índice de un array ni de un arraylist ya que son a partir de cero los indices
//        De esta forma evitaremos problemas con el retorno y el valor de dicho retorno. ya que no tiene nada que ver con el índice de un array.
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dígame un título para el menú");
        String tituloaux = scan.nextLine();
        System.out.println("¿Cuantos elementos quieres añadir al menú?");
        int numeroElementoS= scan.nextInt();
        scan.nextLine();
//        consumir el error de buffer
        String[]opcionesaux=new String[numeroElementoS];
        System.out.println("Dame un elemento");
        opcionesaux[0]=scan.nextLine();
        for(int i = 1; i<numeroElementoS; i++){
            System.out.println("Dame otro elemento");
            opcionesaux[i]=scan.nextLine();
        }
        System.out.println("Por lo tanto:");
        imprimirMenu(tituloaux,opcionesaux);


    }
}
