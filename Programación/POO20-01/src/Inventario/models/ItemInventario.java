package Inventario.models;

public class ItemInventario {
    private String nombre;
    private int cantidad;
    private float IVA;

    public ItemInventario(String nombre, int cantidad, float IVA) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.IVA = IVA;
    }

    public ItemInventario(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public ItemInventario(String nombre) {
        this.nombre = nombre;
    }

    public ItemInventario() {
        nombre="";

    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean ComprarItems(int cantidad){
        if (cantidad<0){
            System.out.println("No puedes comprar items negativos.");
            return false;
        }

        this.cantidad+=cantidad;
        System.out.println("Has comprado"+" "+cantidad+" "+"de"+" "+ nombre);
        return true;
    }

    public boolean VenderItems(int cantidad){
        if (cantidad<0){
            System.out.println("No puedes vender items negativos.");
            return false;
        } else if (cantidad>this.cantidad) {
            System.out.println("No puedes vender mas items de los que tenemos, asique vas a vender todos los que tienes. ");
            cantidad=this.cantidad;
        }
        this.cantidad-=cantidad;
        System.out.println("Has vendido"+" "+cantidad+" "+"de"+" "+ nombre);
        return true;
    }


}
