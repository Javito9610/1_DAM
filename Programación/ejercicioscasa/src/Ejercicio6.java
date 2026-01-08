import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Escribe un programa que rellene un array con los números del -1 al -10 y luego los imprima.
        //Para añadir cualquier cosa a una lista y guardarlo, hay que utilizar un arraylist
        ArrayList<Integer>listaDeNumeros = new ArrayList<>();
        for(int i=-10; i<=-1; i++){
            listaDeNumeros.add(i);
        }
        System.out.println("La lista de numeros negativos del -10 al -1 es:" + " " + listaDeNumeros);
    }
}
