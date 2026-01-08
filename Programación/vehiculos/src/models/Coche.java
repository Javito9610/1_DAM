package models;

import java.util.Scanner;

public class Coche extends Vehiculo {
    private int diametroVolante;

    public Coche(int numeroRuedas, String combustible, boolean manual, String tipoMotor, int velocidadPunta, int caballos, int diametroVolante) {
        super(numeroRuedas, combustible, manual, tipoMotor, velocidadPunta, caballos);
        this.diametroVolante = diametroVolante;
    }

    public Coche() {
        super();
        diametroVolante=0;
    }

    public int getDiametroVolante() {
        return diametroVolante;
    }

    public void setDiametroVolante(int diametroVolante) {
        this.diametroVolante = diametroVolante;
    }
    @Override
    public void arrancar(Scanner scanner){
        System.out.println("1.Ponga en punto muerto el coche.");
        System.out.println("2.Pise el embrague.");
        System.out.println("3.Meta la llave y gírela");

    }
}
