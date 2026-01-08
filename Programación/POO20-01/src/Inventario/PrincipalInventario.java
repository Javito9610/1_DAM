package Inventario;

import Inventario.models.Inventario;
import Inventario.models.ItemInventario;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalInventario {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        Inventario garaje =new Inventario();
//        ItemInventario aceite=new ItemInventario("Aceite");
//        ItemInventario Tornillos=new ItemInventario("Tornillos");
//        garaje.AnadirItemAlInventario(aceite);
//        garaje.AnadirItemAlInventario(Tornillos);
//        boolean result=garaje.getItems().get(0).ComprarItems(10);
//        garaje.getItems().get(0).VenderItems(2);
//        garaje.getItems().get(0).ComprarItems(17);
//        garaje.getItems().get(0).VenderItems(200000);
//        garaje.ImprimirDatos();
        ArrayList<Inventario> inventarios= new ArrayList<Inventario>();
//      while mientras que el usuario no introduzca una opcion correcta
        System.out.println("¿Que nombre le quieres dar al inventario?");
        String nombre = input.nextLine();
        Inventario nuevoInventario = new Inventario(nombre);
        inventarios.add(nuevoInventario);
//      while mientras que el usuario no introduzca una opcion correcta
        System.out.println("¿que nombre le quieres dar al item?");
        String nombreItem = input.nextLine();
        ItemInventario item = new ItemInventario(nombreItem);
        System.out.println("Quieres añadir este item al inventario recien creado?");
//        SI
        nuevoInventario.AnadirItemAlInventario(item);
        System.out.println(inventarios.get(0).getItems().get(0).getNombre());
    }
}
