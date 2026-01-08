import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
//        Diseñar un programa que me identifique los numeros pares de un array
        int []listaDeNumeros = {1,23,-23,-89, 157, 1,0,10, 27};
        ArrayList<Integer>pares= new ArrayList<>();
        for(int i=0; i<listaDeNumeros.length; i++){
            if((listaDeNumeros[i])%2==0){
                pares.add((listaDeNumeros[i]));
            }
        }
        System.out.println("Esta es la lista de números pares" + " " + pares);
//        Ahora lo mismo pero con los impares.
        ArrayList<Integer>impares = new ArrayList<>();
        for(int j=0; j<listaDeNumeros.length; j++){
            if ((listaDeNumeros[j])%2==1){
                impares.add(listaDeNumeros[j]);
            }
        }
        System.out.println("Esta es la lista de números impares" + " " + impares);
//      Escribe un programa que cuente cuántos números negativos hay en un array.
        ArrayList<Integer>negativos = new ArrayList<>();
        for (int k=0; k<listaDeNumeros.length; k++ ){
            if ((listaDeNumeros[k])<0){
                negativos.add(listaDeNumeros[k]);
            }
        }
        System.out.println("Los números negativos son" + " " + negativos);
    }
}
