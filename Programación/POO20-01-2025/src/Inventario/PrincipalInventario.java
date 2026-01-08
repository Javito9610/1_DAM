package Inventario;

import Inventario.models.Inventario;
import Inventario.models.ItemInventario;

public class PrincipalInventario {
    public static void main(String[] args) {
        Inventario garaje =new Inventario();
        ItemInventario aceite=new ItemInventario("Aceite");
        ItemInventario Tornillos=new ItemInventario("Tornillos");
        garaje.AnadirItemAlInventario(aceite);
        garaje.AnadirItemAlInventario(Tornillos);
        boolean result=garaje.getItems().get(0).ComprarItems(10);
        garaje.getItems().get(0).VenderItems(2);
        garaje.getItems().get(0).ComprarItems(17);
        garaje.getItems().get(0).VenderItems(200000);
        garaje.ImprimirDatos();

    }
}
