package models;

import java.util.Scanner;

public  class Helicoptero extends Vehiculo {
    private int envergaduraHelices;

    public Helicoptero(int numeroRuedas, String combustible, boolean manual, String tipoMotor, int velocidadPunta, int caballos, int envergaduraHelices) {
        super(numeroRuedas, combustible, manual, tipoMotor, velocidadPunta, caballos);
        this.envergaduraHelices = envergaduraHelices;
    }

    public Helicoptero() {
        super();
        this.envergaduraHelices =0;
    }

    public int getEnvergaduraHelices() {
        return envergaduraHelices;
    }

    public void setEnvergaduraHelices(int envergaduraHelices) {
        this.envergaduraHelices = envergaduraHelices;
    }
    public  void  arrancar(Scanner scanner){
        System.out.println("1.Inspección previa – Revisar combustible, aceite, superficies y frenos.\n" +
                "2.Cabina – Sentarse, cinturón ajustado, frenos activados, interruptores eléctricos apagados.\n" +
                "3.Batería y sistemas – Encender batería, luces según sea necesario, verificar instrumentos.\n" +
                "4.Combustible y potencia – Mezcla en rica, válvula de combustible abierta, acelerador ¼.\n" +
                "5.Encendido – Girar llave a START, ajustar a 1000 RPM, verificar presión de aceite.\n" +
                "6.Instrumentos – Revisar presión de aceite, temperatura y carga del alternador.\n" +
                "7.Chequeo final – Ajustar mezcla, probar frenos, encender luces de taxi, solicitar rodaje.");
    }
}
