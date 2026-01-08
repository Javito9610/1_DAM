package Inventario.models;

import java.util.ArrayList;

public class Inventario {
private ArrayList<ItemInventario> items;
private String nombre;

    public Inventario() {
//        con this o sin el, da igual
        this.items = new ArrayList<>();
        nombre="";
    }

    public Inventario(ArrayList<ItemInventario> items) {
        this.items = items;
        nombre="";
    }

    public Inventario(String nombre) {
        this.nombre = nombre;
        items = new ArrayList<>();
    }

    public ArrayList<ItemInventario> getItems() {
        return items;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void AnadirItemAlInventario(ItemInventario item){
        items.add(item);
    }

    public void EliminarItemDelInventario(ItemInventario item){
        items.remove(item);
    }

    public void ImprimirDatos(){
       for (int i = 0; i < items.size(); i++){
           System.out.println(items.get(i).getNombre()+" "+items.get(i).getCantidad());
       }
    }
}
