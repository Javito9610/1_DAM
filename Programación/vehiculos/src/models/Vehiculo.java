package models;

import java.util.Scanner;

//CLASE GENERAL DE VHICULOS. AQUI ESTA LO COMUN
// ATRIBUTOS
public abstract class Vehiculo {
    Scanner scanner=new Scanner(System.in);
    private int numeroRuedas;
    private String combustible;
    private boolean manual;
    private String tipoMotor;
    private int velocidadPunta;
    private int caballos;
//    PARA COCHE, MOTO Y LANCHA
//    private int diametroVolante;
//    private int anchuraManillar;
// CONSTRUCTORA
    public Vehiculo(int numeroRuedas, String combustible, boolean manual, String tipoMotor, int velocidadPunta, int caballos) {
        this.numeroRuedas = numeroRuedas;
        this.combustible = combustible;
        this.manual = manual;
        this.tipoMotor = tipoMotor;
        this.velocidadPunta = velocidadPunta;
        this.caballos = caballos;
//        this.anchuraManillar = anchuraManillar;
//        this.diametroVolante = diametroVolante;
    }
// CONSTRUCTORA POR DEFECTO
    public Vehiculo() {
        numeroRuedas=0;
        combustible="";
        manual=false;
        tipoMotor="";
        velocidadPunta=0;
        caballos=0;
//        anchuraManillar=0;
//        diametroVolante=0;
    }




    // GETTERS Y SETTERS
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public boolean isManual() {
        return manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getVelocidadPunta() {
        return velocidadPunta;
    }

    public void setVelocidadPunta(int velocidadPunta) {
        this.velocidadPunta = velocidadPunta;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
    public abstract void arrancar(Scanner scanner);

//    public int getDiametroVolante() {
//        return diametroVolante;
//    }
//
//    public void setDiametroVolante(int diametroVolante) {
//        this.diametroVolante = diametroVolante;
//    }
//
//    public int getAnchuraManillar() {
//        return anchuraManillar;
//    }
//
//    public void setAnchuraManillar(int anchuraManillar) {
//        this.anchuraManillar = anchuraManillar;
//    }

}
