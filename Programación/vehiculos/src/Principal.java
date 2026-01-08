import models.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Que vehiculo quieres coger?");
        System.out.println("1.Coche.");
        System.out.println("2.Moto.");
        System.out.println("3.Avión.");
        System.out.println("4.Helicóptero.");
        System.out.println("5.Lancha.");

        int tipoVehiculo= scanner.nextInt();
        switch (tipoVehiculo){
            case 1:
                Vehiculo coche=new Coche();
                coche.setCaballos(333);
                System.out.println(coche.getCaballos());
                break;
            case 2:
                Vehiculo moto=new Moto(2, "gasolina", true,"combustion",250,100,30);
                break;
            case 3:
                Vehiculo avion=new Avion(6,"queroseno",false,"combustion",444,400,60);
                avion.arrancar(scanner);
                break;
            case 4:
                Vehiculo helicoptero=new Helicoptero(0,"queroseno",false,"combustion",200,300,20);
                break;
            case  5:
                Vehiculo lancha=new Lancha(0,"diesel",false,"combustion",150,100,5);
                break;
            default:
                System.out.println("mal..");
        }
    }
}
