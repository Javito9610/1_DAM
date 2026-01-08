package models;

import interfaces.Comun;

import java.util.Scanner;

public class Slayer extends BicicletasComprar implements Comun {
    public Slayer(int precio, boolean mullet, String marcaRueda, int medidaRueda, String tallaCuadro, String marcaHorquilla, String modeloHorquilla, int medidaHorquilla, String marcaDiscosFreno, int medidaDiscosFreno, String marcaManetasFrenos, String modeloManetaFrenos, boolean tijaTelescopica, String marcaTija, boolean transmisionElectronica, String marcaTransmision, String marcaPedales, String marcaManillar, int medidaManillar) {
        super(precio, mullet, marcaRueda, medidaRueda, tallaCuadro, marcaHorquilla, modeloHorquilla, medidaHorquilla, marcaDiscosFreno, medidaDiscosFreno, marcaManetasFrenos, modeloManetaFrenos, tijaTelescopica, marcaTija, transmisionElectronica, marcaTransmision, marcaPedales, marcaManillar, medidaManillar);
    }

    public Slayer() {
        super();
    }
    public void financiacion(Scanner scanner){
        System.out.println("No disponemos de financiación para este modelo.");
        System.out.println("Tendrias que pagarla de una vez. ¿Estás de acuerdo?");
    }
    public void color(Scanner scanner){
        System.out.println("Solo la tenemos en color negro.");
    }
    public void garantia(){
        System.out.println("Dispones de una garantia de 4 años, salvo caso de mal uso. Consulta los terminos mas detalladamente en la web de la marca.");
    }
}
