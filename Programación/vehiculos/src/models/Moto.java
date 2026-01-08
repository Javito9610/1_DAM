package models;

import java.util.Scanner;

public  class Moto extends Vehiculo {
    private int anchuraManillar;

    public Moto(int numeroRuedas, String combustible, boolean manual, String tipoMotor, int velocidadPunta, int caballos, int anchuraManillar) {
        super(numeroRuedas, combustible, manual, tipoMotor, velocidadPunta, caballos);
        this.anchuraManillar = anchuraManillar;
    }

    public Moto() {
        super();
        anchuraManillar=0;
    }

    public int getAnchuraManillar() {
        return anchuraManillar;
    }

    public void setAnchuraManillar(int anchuraManillar) {
        this.anchuraManillar = anchuraManillar;
    }
    @Override
    public void arrancar(Scanner scanner){
        System.out.println("De que tipo es?");
        System.out.println("1.Botón de encendido.");
        System.out.println("2.kickstart");
        int tipo=scanner.nextInt();
        if (tipo==1){
            System.out.println("1.Coloca la llave en el switch y gírala a la posición ON.");
            System.out.println("2.Verifica el punto muerto (neutral): Asegúrate de que la luz verde del tablero esté encendida o mueve la moto suavemente para comprobar que no está en una marcha.");
            System.out.println("3.Acciona el freno (en algunas motos es obligatorio para el encendido).");
            System.out.println("4.Presiona el botón de encendido (starter) mientras giras un poco el acelerador si es necesario.");
            System.out.println("5.Deja que el motor se estabilice antes de acelerar y empezar a rodar.");
        } else if (tipo==2) {
            System.out.println("1.Coloca la llave en ON.");
            System.out.println("2.Asegúrate de que esté en punto muerto.");
            System.out.println("3.Si la moto tiene carburador, abre el cebador (choke) si el motor está frío.");
            System.out.println("4.Pisa la palanca de arranque con fuerza y decisión hasta que el motor encienda.");
            System.out.println("5.Cierra el cebador una vez que el motor se mantenga estable.");


        }else {
            System.out.println("Mal...");
        }


    }
}
