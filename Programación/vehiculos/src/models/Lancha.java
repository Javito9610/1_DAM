package models;

import java.util.Scanner;

public  class Lancha extends Vehiculo {
    private int numeroMotores;

    public Lancha(int numeroRuedas, String combustible, boolean manual, String tipoMotor, int velocidadPunta, int caballos, int numeroMotores) {
        super(numeroRuedas, combustible, manual, tipoMotor, velocidadPunta, caballos);
        this.numeroMotores = numeroMotores;
    }

    public Lancha() {
        super();
        this.numeroMotores = 0;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }
    public void arrancar(Scanner scanner){
        System.out.println("1.Verifica el combustible: Asegúrate de que haya suficiente gasolina en el tanque.\n" +
                "2.Revisa el nivel de aceite: Si el motor es de 4 tiempos, revisa el nivel de aceite.\n" +
                "3.Coloca la lancha en el agua: Nunca arranques un motor fuera del agua sin un sistema de enfriamiento (como un kit de orejeras con agua).\n" +
                "4.Conecta la batería: Si el motor usa batería, asegúrate de que esté conectada y cargada.\n" +
                "5.Verifica el sistema de ventilación: Si la lancha tiene un compartimento para el motor, ventila para evitar acumulación de gases.\n" +
                "6.Coloca el motor en posición de arranque: Baja el motor fuera de borda si está levantado.");
    }
}
