package models;

import enumerators.OpcionesColorRiot;
import interfaces.Comun;

import java.util.Scanner;

public class Riot extends BicicletasComprar implements Comun {
    public Riot(int precio, boolean mullet, String marcaRueda, int medidaRueda, String tallaCuadro, String marcaHorquilla, String modeloHorquilla, int medidaHorquilla, String marcaDiscosFreno, int medidaDiscosFreno, String marcaManetasFrenos, String modeloManetaFrenos, boolean tijaTelescopica, String marcaTija, boolean transmisionElectronica, String marcaTransmision, String marcaPedales, String marcaManillar, int medidaManillar) {
        super(precio, mullet, marcaRueda, medidaRueda, tallaCuadro, marcaHorquilla, modeloHorquilla, medidaHorquilla, marcaDiscosFreno, medidaDiscosFreno, marcaManetasFrenos, modeloManetaFrenos, tijaTelescopica, marcaTija, transmisionElectronica, marcaTransmision, marcaPedales, marcaManillar, medidaManillar);
    }

    public Riot() {
        super();
    }
    @Override
    public void  financiacion(Scanner scanner){
        boolean correcto= false;
        while(!correcto) {
            System.out.println("Tienes dos opciones de financiación (elige una opción):\n1. Cuota mensual: $4,000 / 12 meses = $333.33 al mes.\nInterés: 0% TAE\n2. Plazo: 24 meses\nCuota mensual aproximada: $173.33\nInterés: 4% TAE");
            try{
                int opcion=scanner.nextInt();
                if (opcion==1){
                    System.out.println("Has escogido la primera opcion de financiación. Muchas gracias.");
                    correcto=true;
                }
                else if (opcion==2) {
                    System.out.println("Has escogido la segunda opcion de financiación. Muchas gracias.");
                    correcto=true;
                }else {
                    System.out.println("Tienes que elegir numero: O el '1' o el '2'. Prueba otra vez");
                }
            }catch (Exception e){
                System.out.println("Tienes que elegir numero: O el '1' o el '2'. Prueba otra vez");
                scanner.nextLine();
            }
        }

    }
    public void color(Scanner scanner){
        boolean correcto1= false;
        while (!correcto1) {
            System.out.println("Disponemos de 3 colores para este modelo: Rojo, árido, verde. Elige uno.");
            String color=scanner.nextLine();
            if (color.equalsIgnoreCase(String.valueOf(OpcionesColorRiot.ROJO))){
                System.out.println("Las has escogido en color rojo.");
                correcto1=true;
            }
            else if (color.equalsIgnoreCase(String.valueOf(OpcionesColorRiot.ÁRIDO))) {
                System.out.println("Las has escogido en color árido.");
                correcto1=true;
            }
            else if (color.equalsIgnoreCase(String.valueOf(OpcionesColorRiot.VERDE))) {
                System.out.println("Las has escogido en color verde.");
                correcto1=true;
            }else{
                System.out.println("Color incorrecto. Prueba otra vez.");
            }

        }
    }
    public void garantia() {
        System.out.println("Tienes dos años de garantia. Leer condiciones de la garantia en la web de la marca.");
    }

}
