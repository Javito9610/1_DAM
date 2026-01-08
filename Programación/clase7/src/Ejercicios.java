import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
//        ejercicio 1:
        int x = 0;
        while (x <= 100) {
            System.out.println(x);
            x++;
        }
//        ejercicio 2:
        int y = 1;
        int sum = 0;
        while (y <= 50) {
            sum += y;
            y++;
        }
        System.out.println(sum);
//      ejercicio 3
        int w = 0;
        int suma = 0;
        do {

            suma += w;
            w++;
        } while (w <= 50);
        System.out.println(suma);
//      ejercicio 4
        int[] array2 = new int[10];

        // Empieza el bucle en i = 0 y termina en i = 9
        for (int i = 0; i < 10; i++) {
            array2[i] = i + 1;
        }

        System.out.println(Arrays.toString(array2));
//        ejercicio 5
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("jose");
        nombres.add("alfre");
        for(int j = 0; j < nombres.size(); j++){
            System.out.println(nombres.get(j));
        }
//              ejercicio6
        Scanner scanner = new Scanner(System.in);
        int numerofac = scanner.nextInt();
        int total= 1;

        for(int k= 1; k<=numerofac; k++ ){
            total=total*k;
        }
        System.out.println(total);
//        no me sale
//        ejercicio 7
        int[] array3 = {1,2,3,4,5};
        int sumatorio=0;
        for (int l = 0; l < array3.length; l++){
             sumatorio = sumatorio + array3[l];

        }
        System.out.println(sumatorio);
    }
}
