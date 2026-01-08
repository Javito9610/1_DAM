public class Ejercicio4 {
    public static void main(String[] args) {
        int []listaDeNumeros = {1,23,-23,-89, 157, 1,0,10, 27};
//        encontrar el número mas mayor y mas menor del array:

        int mayor = listaDeNumeros[0];
        int menor = listaDeNumeros[0];

       for(int i=1; i<listaDeNumeros.length; i++){
          if(mayor < listaDeNumeros[i]) {
              mayor = listaDeNumeros[i];
          }
       }
        System.out.println(mayor);

       for(int j = 1; j<listaDeNumeros.length; j++ ){
           if(menor>listaDeNumeros[j]){
               menor=listaDeNumeros[j];
           }
       }
        System.out.println(menor);
    }
}
