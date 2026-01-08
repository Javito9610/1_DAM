package entradaDeDatos;


import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
//     El scanner es una libreria que tiene java que me permite meter datos por consola
//        Se utiliza cuando queremos utilizar algo que no esta en nuestra clase, pero tiene que estar en mismo paquete
//         aunque las librerias si que se pueden importar
// scanner se uede comportar como una variable
//        System.out lo pinta por consola y system.in es la entrada de consola
        Scanner input = new Scanner(System.in);
//        La manera de declarar un scanner es poniendo al principio scanner luego tienes que declarar una variable de tipo scanner y por ultimo lo que hay despues del igual es por nomenclatura, siempre tiene que ser asi

        System.out.println("Introduce tu nombre:");

//         para decir al scanner que te lo lea
       String nombre = input.nextLine();
//        este input me bloquea la consola hasta que yo apriete el enter
// despues evidentemente me devuelve un string
        System.out.println("Introduce tu edad:");

        int edad = input.nextInt();

//         Esto de aqui abajo se llama limpiar buffer porque despues del int va a fallar por alternar y volver con string por lo tanto el primer string, que es este, se lo salta y pasa al segundo.
        input.nextLine();

        System.out.println(nombre + 2);
//        si metemos en el valor del nombre un 2 el resultado sera 22 por concatenacion de un string con un número
//        las librerias son cosas que ya vienen con java. vienen con el jdk
        System.out.println("con la edad de:" + (edad + 10));
//      ¿que ocurre cuando el scanner lo utilizo mucho en un proyecto?
//      que se produce un error de buffer. Y hay que limpiar buffer. pasa si alternas varios tipos de input

        System.out.println("Introduce tu apellido:");

        String apellido = input.nextLine();

        System.out.println("Con el apellido:" + apellido);
    }
}
