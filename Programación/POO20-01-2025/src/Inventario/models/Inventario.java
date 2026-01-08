package Inventario.models;

import java.util.ArrayList;

public class Inventario {
private ArrayList<ItemInventario> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public Inventario(ArrayList<ItemInventario> items) {
        this.items = items;
    }

    public ArrayList<ItemInventario> getItems() {
        return items;
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
