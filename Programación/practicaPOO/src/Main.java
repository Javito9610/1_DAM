import enumerators.OpcionesBicis;
import enumerators.OpcionesMenu;
import interfaces.Comun;
import models.BicicletasComprar;
import models.Reing;
import models.Slayer;

import java.util.Scanner;

public class Main {
    public static boolean comprarSlayer(Scanner scann){
        System.out.println("Has elegido la Rocky Mountain Slayer");
        System.out.println("\n");
        System.out.println("La Rocky Mountain Slayer es una bicicleta de enduro y freeride diseñada para descensos agresivos y terrenos técnicos. Ofrece geometría ajustable y configuraciones de ruedas versátiles, perfecta para aventuras extremas en montaña.");
        System.out.println("\n");
        System.out.println("Características:");
        Slayer slayer = new Slayer(
                7000,                // Precio
                true,                // Mullet
                "Maxxis",            // Marca de la rueda
                29,                  // Medida de la rueda
                "M",                 // Talla del cuadro
                "Fox",               // Marca de la horquilla
                "Factory 38",        // Modelo de la horquilla
                180,                 // Medida de la horquilla
                "Shimano",           // Marca de discos de freno
                203,                 // Medida de discos de freno
                "SRAM",              // Marca de las manetas de freno
                "Code RSC",          // Modelo de maneta de freno
                true,                // Tija telescópica
                "RockShox",          // Marca de la tija
                true,                // Transmisión electrónica
                "Shimano",           // Marca de la transmisión
                "Crankbrothers",     // Marca de pedales
                "Race Face",         // Marca del manillar
                800                  // Medida del manillar
        );
        System.out.println("Precio de la bicicleta: $" + slayer.getPrecio());
        System.out.println("Configuración mullet: " + (slayer.isMullet() ? "Sí" : "No"));
        System.out.println("Marca de la rueda: " + slayer.getMarcaRueda());
        System.out.println("Medida de la rueda: " + slayer.getMedidaRueda() + " pulgadas");
        System.out.println("Talla del cuadro: " + slayer.getTallaCuadro());
        System.out.println("Marca de la horquilla: " + slayer.getMarcaHorquilla());
        System.out.println("Modelo de la horquilla: " + slayer.getModeloHorquilla());
        System.out.println("Medida de la horquilla: " + slayer.getMedidaHorquilla() + " mm");
        System.out.println("Marca de los discos de freno: " + slayer.getMarcaDiscosFreno());
        System.out.println("Medida de los discos de freno: " + slayer.getMedidaDiscosFreno() + " mm");
        System.out.println("Marca de las manetas de freno: " + slayer.getMarcaManetasFrenos());
        System.out.println("Modelo de las manetas de freno: " + slayer.getModeloManetaFrenos());
        System.out.println("Tija telescópica: " + (slayer.isTijaTelescopica() ? "Sí" : "No"));
        System.out.println("Marca de la tija telescópica: " + slayer.getMarcaTija());
        System.out.println("Transmisión electrónica: " + (slayer.isTransmisionElectronica() ? "Sí" : "No"));
        System.out.println("Marca de la transmisión: " + slayer.getMarcaTransmision());
        System.out.println("Marca de los pedales: " + slayer.getMarcaPedales());
        System.out.println("Marca del manillar: " + slayer.getMarcaManillar());
        System.out.println("Medida del manillar: " + slayer.getMedidaManillar() + " mm");
        System.out.println("\n");

        boolean correcto = false;
        while (!correcto) {
            System.out.println("¿La quieres comprar? (Si/No)");
            String decision = scann.nextLine();
            if (decision.equalsIgnoreCase(String.valueOf("Si"))) {
                System.out.println("Color:");
                slayer.color(scann);
                System.out.println("Financiación:");
                slayer.financiacion(scann);

                System.out.println("¿Confirmas la compra? (Si/No)");
                String opcion = scann.nextLine();
                if (opcion.equalsIgnoreCase(String.valueOf("Si"))) {
                    System.out.println("Perfectoooo. Te has comprado la Rocky Mountain Slayer... Disfrútala");
                    System.out.println("Redirigiendo a menu principal...");
                    correcto = true;
                    return true; // Regresar al menú principal o finalizar la compra
                } else {
                    System.out.println("Compra cancelada.");
                    correcto = true;
                    return true;
                }
            } else if (decision.equalsIgnoreCase(String.valueOf("No"))) {
                System.out.println("Compra cancelada.");
                System.out.println("Redirigiendo al menu principal...");
                correcto = true;
                return true;
            } else {
                System.out.println("Opción no válida. Debes responder con 'Si' o 'No'.");
            }
        }
        return false;
    }

    public static boolean comprarReing(Scanner scann){
        System.out.println("Has elegido la Giant Reing");
        System.out.println("\n");
        System.out.println("La Giant Reing es una bicicleta de enduro con un enfoque agresivo para terrenos técnicos. Cuenta con una geometría versátil y una suspensión robusta que la hace ideal para descensos rápidos y maniobras difíciles.");
        System.out.println("\n");
        System.out.println("Características:");
        Reing reing = new Reing(
                5000,                // Precio
                true,                // Mullet
                "Maxxis",            // Marca de la rueda
                29,                  // Medida de la rueda
                "L",                 // Talla del cuadro
                "RockShox",          // Marca de la horquilla
                "Yari RC",           // Modelo de la horquilla
                160,                 // Medida de la horquilla
                "Shimano",           // Marca de discos de freno
                180,                 // Medida de discos de freno
                "SRAM",              // Marca de las manetas de freno
                "Guide RS",          // Modelo de maneta de freno
                true,                // Tija telescópica
                "KS",                // Marca de la tija
                false,               // Transmisión electrónica
                "SRAM",              // Marca de la transmisión
                "Crankbrothers",     // Marca de pedales
                "Race Face",         // Marca del manillar
                780                  // Medida del manillar
        );
        System.out.println("Precio de la bicicleta: $" + reing.getPrecio());
        System.out.println("Configuración mullet: " + (reing.isMullet() ? "Sí" : "No"));
        System.out.println("Marca de la rueda: " + reing.getMarcaRueda());
        System.out.println("Medida de la rueda: " + reing.getMedidaRueda() + " pulgadas");
        System.out.println("Talla del cuadro: " + reing.getTallaCuadro());
        System.out.println("Marca de la horquilla: " + reing.getMarcaHorquilla());
        System.out.println("Modelo de la horquilla: " + reing.getModeloHorquilla());
        System.out.println("Medida de la horquilla: " + reing.getMedidaHorquilla() + " mm");
        System.out.println("Marca de los discos de freno: " + reing.getMarcaDiscosFreno());
        System.out.println("Medida de los discos de freno: " + reing.getMedidaDiscosFreno() + " mm");
        System.out.println("Marca de las manetas de freno: " + reing.getMarcaManetasFrenos());
        System.out.println("Modelo de las manetas de freno: " + reing.getModeloManetaFrenos());
        System.out.println("Tija telescópica: " + (reing.isTijaTelescopica() ? "Sí" : "No"));
        System.out.println("Marca de la tija telescópica: " + reing.getMarcaTija());
        System.out.println("Transmisión electrónica: " + (reing.isTransmisionElectronica() ? "Sí" : "No"));
        System.out.println("Marca de la transmisión: " + reing.getMarcaTransmision());
        System.out.println("Marca de los pedales: " + reing.getMarcaPedales());
        System.out.println("Marca del manillar: " + reing.getMarcaManillar());
        System.out.println("Medida del manillar: " + reing.getMedidaManillar() + " mm");
        System.out.println("\n");

        boolean correcto = false;
        while (!correcto) {
            System.out.println("¿La quieres comprar? (Si/No)");
            String decision = scann.nextLine();
            if (decision.equalsIgnoreCase("Si")) {
                System.out.println("Color:");
                reing.color(scann);
                System.out.println("Financiación:");
                reing.financiacion(scann);
                scann.nextLine();
                System.out.println("¿Confirmas la compra? (Si/No)");
                String opcion = scann.nextLine();
                if (opcion.equalsIgnoreCase("Si")) {
                    System.out.println("Perfectoooo. Te has comprado la Giant Reing... Disfrútala");
                    System.out.println("Redirigiendo a menu principal...");
                    correcto = true;
                    return true; // Regresar al menú principal o finalizar la compra
                } else {
                    System.out.println("Compra cancelada.");
                    System.out.println("Redirigiendo al menú principal...");
                    correcto = true;
                    return true;
                }
            } else if (decision.equalsIgnoreCase("No")) {
                System.out.println("Compra cancelada.");
                System.out.println("Redirigiendo al menu principal...");
                correcto = true;
                return true;
            } else {
                System.out.println("Opción no válida. Debes responder con 'Si' o 'No'.");
            }
        }
        return false;
    }

    public static boolean comprarRiot(Scanner scann){
        System.out.println("Has elegido la Ghost Riot");
        System.out.println("\n");
        System.out.println("La Ghost Riot es una bicicleta de trail ligera y ágil, diseñada para afrontar senderos rápidos y técnicos con facilidad. Su geometría moderna y componentes de alta gama la hacen perfecta para ciclistas exigentes.");
        System.out.println("\n");
        System.out.println("Características:");
        Reing riot = new Reing(
                4500,                // Precio
                false,               // Mullet
                "Schwalbe",          // Marca de la rueda
                29,                  // Medida de la rueda
                "M",                 // Talla del cuadro
                "Fox",               // Marca de la horquilla
                "Performance 36",    // Modelo de la horquilla
                150,                 // Medida de la horquilla
                "Shimano",           // Marca de discos de freno
                180,                 // Medida de discos de freno
                "Shimano",           // Marca de las manetas de freno
                "XT",                // Modelo de maneta de freno
                true,                // Tija telescópica
                "Fox Transfer",      // Marca de la tija
                false,               // Transmisión electrónica
                "Shimano",           // Marca de la transmisión
                "Crankbrothers",     // Marca de pedales
                "Race Face",         // Marca del manillar
                780                  // Medida del manillar
        );
        System.out.println("Precio de la bicicleta: $" + riot.getPrecio());
        System.out.println("Configuración mullet: " + (riot.isMullet() ? "Sí" : "No"));
        System.out.println("Marca de la rueda: " + riot.getMarcaRueda());
        System.out.println("Medida de la rueda: " + riot.getMedidaRueda() + " pulgadas");
        System.out.println("Talla del cuadro: " + riot.getTallaCuadro());
        System.out.println("Marca de la horquilla: " + riot.getMarcaHorquilla());
        System.out.println("Modelo de la horquilla: " + riot.getModeloHorquilla());
        System.out.println("Medida de la horquilla: " + riot.getMedidaHorquilla() + " mm");
        System.out.println("Marca de los discos de freno: " + riot.getMarcaDiscosFreno());
        System.out.println("Medida de los discos de freno: " + riot.getMedidaDiscosFreno() + " mm");
        System.out.println("Marca de las manetas de freno: " + riot.getMarcaManetasFrenos());
        System.out.println("Modelo de las manetas de freno: " + riot.getModeloManetaFrenos());
        System.out.println("Tija telescópica: " + (riot.isTijaTelescopica() ? "Sí" : "No"));
        System.out.println("Marca de la tija telescópica: " + riot.getMarcaTija());
        System.out.println("Transmisión electrónica: " + (riot.isTransmisionElectronica() ? "Sí" : "No"));
        System.out.println("Marca de la transmisión: " + riot.getMarcaTransmision());
        System.out.println("Marca de los pedales: " + riot.getMarcaPedales());
        System.out.println("Marca del manillar: " + riot.getMarcaManillar());
        System.out.println("Medida del manillar: " + riot.getMedidaManillar() + " mm");
        System.out.println("\n");

        boolean correcto = false;
        while (!correcto) {
            System.out.println("¿La quieres comprar? (Si/No)");
            String decision = scann.nextLine();
            if (decision.equalsIgnoreCase("Si")) {
                System.out.println("Color:");
                riot.color(scann);
                System.out.println("Financiación:");
                riot.financiacion(scann);
                System.out.println("¿Confirmas la compra? (Si/No)");
                String opcion = scann.nextLine();
                if (opcion.equalsIgnoreCase("Si")) {
                    System.out.println("Perfectoooo. Te has comprado la Ghost Riot... Disfrútala");
                    System.out.println("Redirigiendo a menú principal...");
                    correcto = true;
                    return true; // Regresar al menú principal o finalizar la compra
                } else {
                    System.out.println("Compra cancelada.");
                    System.out.println("Redirigiendo al menú principal...");
                    correcto = true;
                    return true;
                }
            } else if (decision.equalsIgnoreCase("No")) {
                System.out.println("Compra cancelada.");
                System.out.println("Redirigiendo al menú principal...");
                correcto = true;
                return true;
            } else {
                System.out.println("Opción no válida. Debes responder con 'Si' o 'No'.");
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡¡¡Bienvenido a nuestra tienda de bicis!!!");

        boolean seguirComprando = true;
        while (seguirComprando) {
            System.out.println("¿Qué opción quieres realizar? (Utiliza letras, no números)");
            System.out.println("1. Comprar.");
            System.out.println("2. Vender.");
            System.out.println("3. Salir.");

            String opcion1 = scanner.nextLine();
            if (opcion1.equalsIgnoreCase(String.valueOf(OpcionesMenu.COMPRAR))) {
                System.out.println("Has elegido comprar:");
                boolean compraExitosa = false;
                while (!compraExitosa) {
                    System.out.println("Tenemos 3 modelos: Rocky Mountain Slayer, Giant Reign, Ghost Riot. Elige uno.");
                    String modelo = scanner.nextLine();
                    if (modelo.equalsIgnoreCase(String.valueOf(OpcionesBicis.ROCKY_MOUNTAIN_SLAYER.name().replace("_", " ")))) {
                        compraExitosa = comprarSlayer(scanner);

                    } else if (modelo.equalsIgnoreCase(String.valueOf(OpcionesBicis.GIANT_REING.name().replace("_", " ")))) {
                        compraExitosa = comprarReing(scanner);

                    } else if (modelo.equalsIgnoreCase(String.valueOf(OpcionesBicis.GHOST_RIOT.name().replace("_", " ")))) {
                        System.out.println("Modelo Ghost Riot seleccionado. No implementado.");
                        compraExitosa = comprarRiot(scanner);
                    } else {
                        System.out.println("Opción incorrecta. Vuelve a intentarlo.");
                    }
                }
            } else if (opcion1.equalsIgnoreCase(String.valueOf(OpcionesMenu.VENDER))) {
                System.out.println("Has elegido vender.");
                System.out.println("Introduce producto, cantidad e importe total:");
                System.out.println("Producto:");
                String producto=scanner.nextLine();
                System.out.println("Cantidad:");
                int cantidad = scanner.nextInt();
                System.out.println("Precio:");
                int importe= scanner.nextInt();
                scanner.nextLine();
                if(importe>30 && importe<1000){
                    int regateo = importe - 30;
                    System.out.println("Yo puedo ofrecerte: "+(regateo));
                    boolean tratoCorrecto=false;
                    while(!tratoCorrecto) {
                        System.out.println("¿Hay trato?");
                        String trato = scanner.nextLine();
                        if (trato.equalsIgnoreCase(String.valueOf("Si"))) {
                            System.out.println("Me has vendido " + cantidad + " " + producto + " " + "por el precio de: " + regateo+" "+"Euros");
                            System.out.println("\n");
                            System.out.println("Es un placer hacer trato contigo muchas gracias.");
                            System.out.println("\n");
                            System.out.println("Redirigiendo a menú principal...");
                            System.out.println("\n");
                            tratoCorrecto=true;
                        } else if (trato.equalsIgnoreCase(String.valueOf("No"))) {
                            System.out.println("Una pena. Gracias de todas formas.");
                            System.out.println("\n");
                            System.out.println("Redirigiendo a menú principal...");
                            System.out.println("\n");
                            tratoCorrecto=true;
                        } else {
                            System.out.println("Escoge bien la respuesta: 'Si' o 'No'. Elige de nuevo. ");
                        }
                    }
                }else if(importe >= 150){
                    int regateo1 = importe - 150;
                    System.out.println("Yo puedo ofrecerte: "+(regateo1));
                    boolean tratoCorrecto1=false;
                    while(!tratoCorrecto1) {
                        System.out.println("¿Hay trato?");
                        String trato = scanner.nextLine();
                        if (trato.equalsIgnoreCase(String.valueOf("Si"))) {
                            System.out.println("Me has vendido " + cantidad + " " + producto + " " + "por el precio de: " + regateo1+" "+"Euros");
                            System.out.println("\n");
                            System.out.println("Es un placer hacer trato contigo muchas gracias.");
                            System.out.println("\n");
                            System.out.println("Redirigiendo a menú principal...");
                            System.out.println("\n");
                            tratoCorrecto1=true;
                        } else if (trato.equalsIgnoreCase(String.valueOf("No"))) {
                            System.out.println("Una pena. Gracias de todas formas.");
                            System.out.println("\n");
                            System.out.println("Redirigiendo a menú principal...");
                            System.out.println("\n");
                            tratoCorrecto1=true;
                        } else {
                            System.out.println("Escoge bien la respuesta: 'Si' o 'No'. Elige de nuevo. ");
                        }
                    }

                }else {
                    System.out.println("Importe demasiado bajo para negociar.");
                    System.out.println("Redirigiendo a menú principal...");
                }


            } else if (opcion1.equalsIgnoreCase(String.valueOf(OpcionesMenu.SALIR))) {
                System.out.println("Has elegido salir. ¡Hasta pronto!");
                seguirComprando = false;
            } else {
                System.out.println("Opción incorrecta. Prueba otra vez.");
            }
        }
    }
}
