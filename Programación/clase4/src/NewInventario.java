import java.util.Scanner;

public class NewInventario {
    public static Boolean comprar(Boolean seguirComprando, Scanner scanner, String tipo) {


        boolean cantidadC = false;
        while (!cantidadC) {

            System.out.println("Vas a comprar" + " "+ tipo);
            System.out.println("Cuántas unidades quieres?");

            try {
                cantidadC = true;
                int numeroDeUnidadesC = scanner.nextInt();
                System.out.println("Quieres comprar---->" + numeroDeUnidadesC + "---->" + tipo);
            } catch (Exception Error) {
                cantidadC = false;
                System.out.println("Deberías utilizar un número. Vuelva a intentarlo....");
                scanner.nextLine();
            }
        }

        scanner.nextLine();

        boolean correcto = false;
        while (!correcto) {

            System.out.println("Desea seguir comprando/ vendiendo?");
            String respuesta = scanner.nextLine();

            switch (respuesta.toLowerCase()) {
                case "si":
                    correcto = true;
                    System.out.println("Perfecto....Sigamos comprando.");
                    seguirComprando = true;
                    break;
                case "Si":
                    correcto = true;
                    System.out.println("Perfecto....Sigamos comprando.");
                    seguirComprando = true;
                    break;
                case "no":
                    seguirComprando = false;
                    correcto = true;
                    System.out.println("Perfecto....Hasta pronto.");
                    seguirComprando = false;
                    return seguirComprando;
                case "No":
                    seguirComprando = false;
                    correcto = true;
                    System.out.println("Perfecto....Hasta pronto.");
                    seguirComprando = false;
                    return seguirComprando;
                default:
                    correcto = false;
                    System.out.println("La respuesta es facil. Vuelva a intentarlo.");

            }
        }
        return seguirComprando;
    }
    public static Boolean vender(Boolean seguirComprando, Scanner scanner, String tipo){

        boolean cantidadV = false;
        while (!cantidadV) {

            System.out.println("Vas a vender" + " " + tipo);
            System.out.println("Cuántas unidades quieres vender?");

            try {
                cantidadV = true;
                int numeroDeUnidadesV = scanner.nextInt();
                System.out.println("Quieres vender---->" + numeroDeUnidadesV + " " + tipo);
            } catch (Exception Error) {
                cantidadV = false;
                System.out.println("Tiene que ser un número. Vuelva a intentarlo....");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        boolean correcto = false;
        while (!correcto) {

            System.out.println("Desea seguir comprando/ vendiendo?");
            String respuesta = scanner.nextLine();

            switch (respuesta) {
                case "si":
                    correcto = true;
                    System.out.println("Perfecto....Sigamos comprando.");
                    break;

                case "Si":
                    correcto = true;
                    System.out.println("Perfecto....Sigamos comprando.");
                    break;

                case "no":
                    seguirComprando = false;
                    correcto = true;
                    System.out.println("Perfecto....Hasta pronto.");
                    break;

                case "No":
                    seguirComprando = false;
                    correcto = true;
                    System.out.println("Perfecto....Hasta pronto.");
                    break;

                default:
                    correcto = false;
                    System.out.println("La respuesta es facil. Vuelva a intentarlo.");

            }
        }
        return seguirComprando;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean seguirComprando = true;
        while (seguirComprando) {

            boolean cantidadValida = false;
            while (!cantidadValida) {


                System.out.println("<-----------BIENVENIDO-------------->");
                System.out.println("<---¿Que acción quiere realizar---->");
                System.out.println("<---1. Comprar--->");
                System.out.println("<---2. Vender--->");
                System.out.println("<---3. Salir--->");
                System.out.println("<----------------------------------->");

                try {

                    int opcion = scanner.nextInt();

                    if (opcion == 1) {
                        cantidadValida = true;
                        boolean compraCorrecta = false;
                        while (!compraCorrecta) {

                            System.out.println("Quiere comprar");
                            System.out.println("<----------------------------------->");
                            System.out.println("<--- Qué quiere comprar?--->");
                            System.out.println("<---1. Lámparas--->");
                            System.out.println("<---2. Estanterías--->");
                            System.out.println("<---3. Sofás--->");
                            System.out.println("<----------------------------------->");


                            try {
                                int opcionMenuCompra = scanner.nextInt();
                                if (opcionMenuCompra == 1) {
                                    compraCorrecta = true;
                                    seguirComprando = comprar(seguirComprando, scanner, "Lámpara");
                                } else if (opcionMenuCompra == 2) {
                                    compraCorrecta = true;
                                    seguirComprando = comprar(seguirComprando, scanner, "Estanterias");
                                } else if (opcionMenuCompra == 3) {
                                    compraCorrecta = true;
                                    seguirComprando = comprar(seguirComprando, scanner, "Sofás");
                                } else {
                                    System.out.println("Opción no válida....");
                                }

                            } catch (Exception Error) {
                                System.out.println("Tiene que ser un número. Vuelva a intentarlo...");
                                scanner.nextLine();
                            }
                        }
                    } else if (opcion == 2) {
                        cantidadValida = true;
                        boolean ventaCorrecta = false;
                        while (!ventaCorrecta) {

                            System.out.println("Quiere vender");
                            System.out.println("<----------------------------------->");
                            System.out.println("<--- Qué quiere vender?--->");
                            System.out.println("<---1. Lámparas--->");
                            System.out.println("<---2. Estanterías--->");
                            System.out.println("<---3. Sofás--->");
                            System.out.println("<----------------------------------->");

                            try {
                                int opcionMenuVenta = scanner.nextInt();
                                if (opcionMenuVenta == 1) {
                                    ventaCorrecta = true;
                                    seguirComprando = vender(seguirComprando, scanner, "Lámparas");

                                } else if (opcionMenuVenta ==2){
                                    ventaCorrecta = true;
                                    seguirComprando = vender(seguirComprando, scanner, "Estanterias");

                                } else if (opcionMenuVenta == 3) {
                                    ventaCorrecta = true;
                                    seguirComprando = vender(seguirComprando, scanner, "Sofás");

                                } else {
                                    System.out.println("Opcion no valida. Vuelva a intentarlo....");
                                }
                            } catch (Exception Error) {
                                System.out.println("No es un número. Vuelva a intentarlo....");
                                scanner.nextLine();
                            }
                        }
                    } else if (opcion == 3) {
                        cantidadValida = true;
                        seguirComprando = false;
                        System.out.println("Ha elegido usted salir. Hasta pronto.");
                    } else {
                        System.out.println("Número incorrecto. Vuelva a intentarlo....");
                    }

                } catch (Exception Error) {
                    cantidadValida = false;
                    System.out.println("Tiene que ser un número. Vuelva a intentarlo....");
                    scanner.nextLine();
                }
            }
        }
    }

}
