import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {

        int []listaDeNumeros = {1,23,-23,-89, 157, 1,0,10, 27};
        int []listaDeNumerosAux = new int[9];

//        tenemos que invertir los valores, es decir, poner el primero en el último y asi sucesivamente con todos; cambiarlos de posición.
//        Para invertir un array o un arraylist siempre hay que utilizar un array auxiliar, porque sino hace efecto espejo y cuando el cambio se encuentra en el medio del array, los siguientes elementos del array se reflejan con los primeros que ha cambiado
        for(int i=0 ; i<listaDeNumeros.length; i++){

                listaDeNumerosAux[i]=listaDeNumeros[(listaDeNumeros.length-1)-i];

        }
        System.out.println(Arrays.toString(listaDeNumerosAux));
    }
}
