import java.math.BigInteger;
import java.util.Scanner;

public class Inventario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            boolean seguirComprando = true;
            while (seguirComprando) {

                boolean cantidadValida = false;
                while (!cantidadValida) {


                    System.out.println("<-----------BIENVENIDO-------------->");
                    System.out.println("<---¿Que acción quieres realizar---->");
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

                                System.out.println("Quieres comprar");
                                System.out.println("<----------------------------------->");
                                System.out.println("<--- Qué quieres comprar?--->");
                                System.out.println("<---1. Lámparas--->");
                                System.out.println("<---2. Estanterías--->");
                                System.out.println("<---3. Sofás--->");
                                System.out.println("<----------------------------------->");


                                try {
                                    int opcionMenuCompra = scanner.nextInt();
                                    if (opcionMenuCompra == 1) {
                                        compraCorrecta = true;

                                        boolean cuantasLamparasC = false;
                                        while (!cuantasLamparasC) {

                                            System.out.println("Vas a comprar lámparas");
                                            System.out.println("Cuántas quieres?");

                                            try {
                                                cuantasLamparasC = true;
                                                int numeroDeLamparasC = scanner.nextInt();
                                                System.out.println("Quieres comprar---->" + numeroDeLamparasC + "---->Lámparas.");
                                            } catch (Exception Error) {
                                                cuantasLamparasC = false;
                                                System.out.println("Deberías utilizar un número. Vuelva a intentarlo....");
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
                                    } else if (opcionMenuCompra == 2) {

                                        compraCorrecta = true;

                                        boolean cuantasEstanteriasC = false;
                                        while (!cuantasEstanteriasC) {

                                            System.out.println("Vas a comprar estanterias");
                                            System.out.println("Cuántas quieres?");

                                            try {
                                                cuantasEstanteriasC = true;
                                                int numeroDeEstanteriasC = scanner.nextInt();
                                                System.out.println("Quieres comprar---->" + numeroDeEstanteriasC + "---->Estanterias.");
                                            } catch (Exception Error) {
                                                cuantasEstanteriasC = false;
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
                                    } else if (opcionMenuCompra == 3) {
                                        compraCorrecta = true;

                                        boolean cuantosSofasC = false;
                                        while (!cuantosSofasC) {

                                            System.out.println("Vas a comprar sofás");
                                            System.out.println("Cuántos quieres?");

                                            try {
                                                cuantosSofasC = true;
                                                int numeroDeSofasC = scanner.nextInt();
                                                System.out.println("Quieres comprar---->" + numeroDeSofasC + "---->Sofas.");
                                            } catch (Exception Error) {
                                                cuantosSofasC = false;
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

                                System.out.println("Quieres vender");
                                System.out.println("<----------------------------------->");
                                System.out.println("<--- Qué quieres vender?--->");
                                System.out.println("<---1. Lámparas--->");
                                System.out.println("<---2. Estanterías--->");
                                System.out.println("<---3. Sofás--->");
                                System.out.println("<----------------------------------->");

                                try {
                                    int opcionMenuVenta = scanner.nextInt();
                                    if (opcionMenuVenta == 1) {
                                        ventaCorrecta = true;

                                        boolean cuantasLamparasV = false;
                                        while (!cuantasLamparasV) {

                                            System.out.println("Vas a vender lámparas");
                                            System.out.println("Cuántas quieres vender?");

                                            try {
                                                cuantasLamparasV = true;
                                                int numeroDeLamparasV = scanner.nextInt();
                                                System.out.println("Quieres vender---->" + numeroDeLamparasV);
                                            } catch (Exception Error) {
                                                cuantasLamparasV = false;
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
                                    } else if (opcionMenuVenta == 2) {
                                        ventaCorrecta = true;

                                        boolean cuantasEstanteriasV = false;
                                        while (!cuantasEstanteriasV) {

                                            System.out.println("Vas a vender estanterías");
                                            System.out.println("Cuántas quieres vender?");

                                            try {
                                                cuantasEstanteriasV = true;
                                                int numeroDeEstanteriasV = scanner.nextInt();
                                                System.out.println("Quieres vender---->" + numeroDeEstanteriasV);
                                            } catch (Exception Error) {
                                                cuantasEstanteriasV = false;
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
                                    } else if (opcionMenuVenta == 3) {
                                        ventaCorrecta = true;

                                        boolean cuantosSofasV = false;
                                        while (!cuantosSofasV) {

                                            System.out.println("Vas a vender sofas");
                                            System.out.println("Cuántos quieres vender?");

                                            try {
                                                cuantosSofasV = true;
                                                int numeroDeSofasV = scanner.nextInt();
                                                System.out.println("Quieres vender---->" + numeroDeSofasV);
                                            } catch (Exception Error) {
                                                cuantosSofasV = false;
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
