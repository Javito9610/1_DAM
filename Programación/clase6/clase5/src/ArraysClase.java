import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysClase {
    public static void main(String[] args) {
//        Sintaxis del arrays: tipo[] nombre = {}
        int x = 2;
        int[]listaDeNumeros = {1, 2, 3, 4, 5};
        String[]listaCompra = {"agua", "cafe", "manzana", "pera"};
        boolean[]booleano = {true, false, false, true};
        System.out.println (java.util.Arrays.toString(listaCompra));
        System.out.println(Arrays.toString(listaCompra));
        System.out.println(Arrays.toString(booleano));
//        Arrays de Scanner. El segundo arrays es como si fuese un archivo pero no lo es en realidad.
        Scanner[] scanners = {new Scanner(System.in), new Scanner(System.in)};
        System.out.println(Arrays.toString(scanners));
//        Arrays de enteros de 2000 elementos
        int[]listaNumerosEnterosLarga = new int[20];
        String[] listaPalabrasLarga = new String[20];
        boolean[] listaBooleanosLarga = new boolean[20];
        float[]listaDecimalesLarga = new float [20];
        System.out.println(Arrays.toString(listaNumerosEnterosLarga));
        System.out.println(Arrays.toString(listaPalabrasLarga));
        System.out.println(Arrays.toString(listaBooleanosLarga));
        System.out.println(Arrays.toString(listaDecimalesLarga));
//        Todos salen como cero menos string por que no es un tipo nativo.
//        INDEX---> indice
        System.out.println(listaCompra[0]);
        System.out.println(listaBooleanosLarga[19]);
//        No hay que poner Array to string porque no estas imprimiendo un array, estas imprimiendo un elemento de array
        String nombreSegundoElementoListaCompra = listaCompra[1];
        nombreSegundoElementoListaCompra += " " + "Hola";
        System.out.println(nombreSegundoElementoListaCompra);
//        Actualizo elemento
        listaDeNumeros[4] = 0;
        System.out.println(Arrays.toString(listaDeNumeros));
        listaDeNumeros = new int[20];
        System.out.println(Arrays.toString(listaDeNumeros));
//        array vs array list: el array es fijo. en los array list se pueden añadir elementos y quitarlos
        String[]compra = {"manzana", "pera"};
        compra = new String[3];
        compra[0] = "manzana";
        compra[1] = "pera";
        compra[2] = "sandia";
//        tambien con array se puede esta
        compra= new String[]{"manzana", "pera", "sandia"};
//        Ahora con arraylist
        ArrayList<String> listaEjemplo = new ArrayList<String>();
        ArrayList<Integer> listaEjemplo2 = new ArrayList<Integer>();
//        En los arraylist solo se pueden meter no primitivos y en el array, cualquiera
//        para hacerlo con un int al ser primitivo hay que buscar otra forma, como integer (no es primitivo)
//        con float, boolean, short, etc (todos los primitivos) se pone lo mismo pero sus primeras letras en mayusculas
//         el .toArray convierte el arraylist en un array para poder imprimirlo
//        add para añadir mas
        listaEjemplo.add("manzana");
        System.out.println(Arrays.toString(listaEjemplo.toArray()));
        listaEjemplo.add("pera");
        System.out.println(Arrays.toString(listaEjemplo.toArray()));
        System.out.println(compra[0]);
        System.out.println(listaEjemplo.get(1));
        listaEjemplo.remove(0);
        System.out.println(Arrays.toString(listaEjemplo.toArray()));
        System.out.println(listaEjemplo.size());
//        para borrar clear
        listaEjemplo.clear();
        listaEjemplo.add(0,"melon");
        System.out.println(Arrays.toString(listaEjemplo.toArray()));




    }
}
