public class practica {
    public static void main(String[] args) {
        int numeroFilas=5;
        for(int i=1; i<=numeroFilas; i++){
            for(int k=1; k<=(numeroFilas-i);k++){
                System.out.print(" ");/*para que no haya saltoo de linea y cada iteracion la imprima en la misma linea */
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print(j);/*para que no haya saltoo de linea y cada iteracion la imprima en la misma linea */
            }
            System.out.println();/*para el salto de linea*/
        }
    }
}
