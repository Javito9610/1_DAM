import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        ArrayList<String> listaElementos = new ArrayList<>();
//        Creo un arraylist ya que a partir de ahora va a ser el metodo de traspaso de datos desde la consola al archivo y viceversa
//        En este arrayList se van almacenar algunos cambios. Todos los cambios se almacenaran en los archivos y en este arraylist todos menos el de añadir elemento
//        Los arrayList se llenaran en cada metodo debido a la lectura de los archivos. Y por cosecuencia tambien se llenara este.
        Scanner input = new Scanner(System.in);
//        Declaro el escaner para ser utilizado en cada uno de los metodos del codigo.
        System.out.println("Bienvenido al gestor de inventarios de tus tres almacenes");
        System.out.println("---------------------------------------------------------");
//        Presentacion del main "Funcion principal"

        boolean finProceso = false;
//        Introducimos un booleano que condicione el bucle while desde el principio, para que comience a funcionar
        while (!finProceso) {
            int opcion = menuInventario("Estás en el menú de inventarios", input);
//            Cuando nombramos a "opcion" (int) y lo igualamos al metodo "menuInventario", nos metemos directamente en dicho metodo
//            para trabajar en el y que nos devuelva un numero valido para poder utilizar en el condicional if
//            Antes de entrar en un bucle, condicional, etc o nada mas entrar, a los metodos siempre hay que nombrarlos con una variable para evitar redundancias tanto en el codigo como e la visualizacion
            if (opcion == 1) {
                System.out.println("¡¡¡¡BIENVENIDO A SEGOVIAAA!!!!");
                finProceso = menuOperaciones("Segovia", listaElementos, input);
//            Invocamos al metodo "menuOperaciones" que es un metodo donde estan cada una de las opciones para
//            cada uno de los inventarios.
//            Es un metodo que devuelve un booleano para determinar se salimos del programa o no. En este caso
//            devolvera un false.
            } else if (opcion == 2) {
                System.out.println("¡¡¡¡BIENVENIDO MADRIDDD!!!!");
                finProceso = menuOperaciones("Madrid", listaElementos, input);
//            Lo mismo que para opción 1
            } else if (opcion == 3) {
                System.out.println("¡¡¡¡BIENVENIDO A CADIZZZ!!!!");
                finProceso = menuOperaciones("Cádiz", listaElementos, input);
//            Lo mismo que para opción 1
            } else if (opcion == 4) {
                System.out.println("Gracias. ¡Hasta pronto!");
                finProceso = true;
//            Salida del programa
            } else {
                System.out.println("Valor Incorrecto. Por favor, elige una opción válida.");
            }
        }
    }

    public static int menuInventario(String titulo, Scanner scanner) {
        System.out.println(titulo);
        System.out.println("¿A qué inventario quieres acceder?");
        System.out.println("1. Inventario almacén Segovia");
        System.out.println("2. Inventario almacén Madrid");
        System.out.println("3. Inventario almacén Cádiz");
        System.out.println("4. Salir del sistema");
//        Introduzco las opciones de los distintos tipos de inventarios distribuidos por el pais
        boolean menuInventarioCorrecto = false;
//        Declaro un booleano creando la condicion "False" para activar el bucle while y que funcione la primera iteracion.
        int numInventario = -1;
//        Declaro la variable "numInventario" para que cuando la introduzca el usuario, si no cumple la condicion if
//        o es una letra, retorne o devuelva un -1
        while (!menuInventarioCorrecto) {
            try {
//        Try-catch para descartar la introduccion de letras
                numInventario = scanner.nextInt();
                if (numInventario < 1 || numInventario > 4) {
                    System.out.println("Introduce un número válido.");
//        Descartamos la introduccion de cualquier numero que no este en dicho intervalo
                } else {
                    menuInventarioCorrecto = true;
//        Opcion correcta. Retornamos el valor de dicho numero.
                }
            } catch (Exception e) {
                System.out.println("Tienes que introducir un número.");
                scanner.nextLine();
//        Introduce una letra y salta error
//        El scanner.nextLine() lo he introducido para limpieza de buffer y evitar errores en el buffer
            }
        }
        return numInventario;
    }

    public static boolean menuOperaciones(String lugar, ArrayList<String> listaElementos, Scanner scanner) {
        boolean salir = false;
        while (!salir) {
    //       Declaro un booleano creando la condicion "False" para activar el bucle while y que funcione la primera iteracion
            System.out.println("Te encuentras en el inventario del almacén de " + lugar);
            System.out.println("¿Qué operación quieres realizar?");
            System.out.println("--------------------------------");
            System.out.println("1. Sumar Cantidad a elemento.");
            System.out.println("2. Añadir elementos.");
            System.out.println("3. Borrar cantidad a elemento.");
            System.out.println("4. Visualizar inventario.");
            System.out.println("5. Salir del inventario.");
            System.out.println("---Si no tienes ningún elemento en tu inventario, pulsa 3, Añadir");
    //       Presento todas las opciones
    //       Abro el bucle while
            try {
    //       Creo ell try-catch para descartar que el usuario introduzca cualquier cosa que no sea un numero
                int eleccionMenuOperaciones = scanner.nextInt();
    //       Introducción del valor elegido por el usuario mediante el escaner.
                switch (eleccionMenuOperaciones) {
    //       Se introduce un switch-case debido al numero de condiciones.
                    case 1:
                        sumarCantidadElemento(lugar, listaElementos, scanner);
    //       No devuelve nada porque no es necesario.
    //       Lo unico que se busca con estos metodos es modificar la estructura de un archivo mediante los "arraylist"
    //       que actuan como intermediario, los "buffered reader y buffered writer" y los "File reader y File writer"
                        break;
                    case 2:
                        añadirElemento(lugar, scanner);
    //       No devuelve nada porque no es necesario.
    //       Lo unico que se busca con estos metodos es modificar la estructura de un archivo mediante los "arraylist"
    //       que actuan como intermediario, los "buffered reader y buffered writer" y los "File reader y File writer"
                        break;
                    case 3:
                        restarCantidadElemento(lugar, listaElementos, scanner);
    //       No devuelve nada porque no es necesario.
    //       Lo unico que se busca con estos metodos es modificar la estructura de un archivo mediante los "arraylist"
    //       que actuan como intermediario, los "buffered reader y buffered writer" y los "File reader y File writer"
                        break;
                    case 4:
                        visualizarInventario(lugar, listaElementos, scanner);
    //       No devuelve nada porque no es necesario.
    //       Lo unico que se busca con estos metodos es modificar la estructura de un archivo mediante los "arraylist"
    //       que actuan como intermediario, los "buffered reader y buffered writer" y los "File reader y File writer"
                        break;
                    case 5:
                        System.out.println("Volviendo al menú de inventarios...");
                        salir = true;
    //       El booleano salir = true cambia la condicion del bucle y sale de dicho bucle
    //       Pero salimos al bucle que tenemos en nivel superior porque la funcion devuelve un false
    //       por lo que en el bucle anterior, el de la funcion "main", seguiriamos manteniendo la condicion false
    //       y no saldriamos de dicho bucle hasta pulsar a "salir".
                        break;
                    default:
                        System.out.println("Valor incorrecto. Tienes que introducir un número del 1 al 5.");
    //       Instruccion si el valor introduciodo es incorrecto
                }
            } catch (Exception e) {
                System.out.println("Valor incorrecto. Tienes que introducir un número del 1 al 5.");
                scanner.nextLine();
    //       Instruccion si el valor introduciodo es incorrecto y limpieza de buffer
            }
        }
        return false;
    }

    public static void añadirElemento(String lugar, Scanner scanner) throws IOException {
//        "Throws" explicado en la ultima clase, como sustituto del "try-catch" para evitar dicha estructura
//        y poder File y buffered sin necesidad de try-catch
        String inventarioLugar = "Inventario" + lugar;
//        Denomino dicha variable por agilizar proceso a la hora de declarar los "File" y "Buffered"
        FileWriter writer = new FileWriter(inventarioLugar, true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
//        Los declaro.
        ArrayList<String> listaElementosNuevos = new ArrayList<>();
//        Declaro un arraylist independiente a este metodo ya que con el lo que se busca es
//        añadir elementos nuevos a dicho arraylist y por consecuencia al archivo
        boolean numeroElementosCorrecto = false;
//        Volvemos a crear un booleano en false para que nos de paso a la primera iteración del bucle while
        System.out.println("¿Cuántos elementos quieres introducir en la lista?");
        while (!numeroElementosCorrecto) {
            try {
//        Introducimos try-catch para descartar la introduccion en el int, de cualquier elemento que no sea un entero.
                int numeroElementos = scanner.nextInt();
//        Introduccion por parte del usuario.
                scanner.nextLine();
//        Limpieza de buffer
                for (int i = 0; i < numeroElementos; i++) {
                    System.out.println("Dime elemento:");
                    String nombreElemento = scanner.nextLine();
                    listaElementosNuevos.add(nombreElemento);
//        Con este bucle lo que se busca por cada iteracion de cero a "numElementos" es:
//       1. Pedir al usuario que introduzca elemento.
//       2. Introduccion.
//       3. Añadir dicho elemento al arraylist en orden
                }
                System.out.println("Ya se han guardado todos los elementos.");
                for (String elemento : listaElementosNuevos) {
//       Este modelo indica que se va a hacer una iteraccion con cada uno de los elemento del arraylist
                    bufferedWriter.write(elemento + "_0");
                    bufferedWriter.newLine();
//       Lo que se busca en cada iteracion de este bucle es:
//       1. Introduccion de cada elemento del arraylist en el archivo
//       2. Salto de linea.
                }
                numeroElementosCorrecto = true;
//       Como no hay condicionante de intervalo numerico, con cualquier numer que se introduzca, el boolean se declarara como true
            } catch (Exception e) {
                System.out.println("Tienes que introducir un número.");
                scanner.nextLine();
//       Condicion cuando no se introduce un numero y limpieza de buffer.
            }
        }
        bufferedWriter.close();
        writer.close();
//        Cerrada de buffered primero y despues de writer
        System.out.println("Operación Finalizada con exito. Redirigiendo al menú de tu inventario------->");
    }

    public static void visualizarInventario(String lugar, ArrayList<String> listaElementos, Scanner scanner) throws IOException {
        listaElementos.clear();
//        Limpiamos el Arraylist por si ha quedado algun elemento dentro, en alguna operacion anterior.
//        Asi podremos llenarlo de nuevo con los elemento almacenados en el archivo.
        String inventarioLugar = "Inventario" + lugar;
//        Denomino dicha variable por agilizar proceso a la hora de declarar los "File" y "Buffered"
        FileReader reader = new FileReader(inventarioLugar);
        BufferedReader bufferedReader = new BufferedReader(reader);
//        Declaro "buffered" y "reader"
        String linea;
//        Declaro una variable de tipo string para posteriormente utilizarla como condicion de while y para añadir la linea en cada posicion del arraylist
        while ((linea = bufferedReader.readLine()) != null) {
//        Mientras no sea nula la linea leida del archivo...
            listaElementos.add(linea);
//        Se plasmara dicha linea en el arraylist.
        }
        System.out.println("En este inventario tienes:");
//        Ahora lo unico que hay que hacer es separar en dos cadenas cada uno del los elementos del arraylist mediante un regex
//        ,declarar cada parte como una variable de tipo String e int respectivamente
//        y reflejar con un sout cada una de las partes de dicho elemento.
//        Y esto se hace en cada iteracion referida a cada elemento, hasta llegar al ultimo del arraylist
        for (String item : listaElementos) {
            if (item.contains("_")) {
                String[] partes = item.split("_");
//       Herramienta aprendida en la ultima clase para separar un elemento "String" en dos cadenas de elementos o mas
//       Se denomina un elemento String "partes" para denominar a cada elemento String "item" del arraylist y partirlo en dos cadenas
                if (partes.length == 2) {
//       Si tiene dos partes se declararan dos variables para cada una de las partes, String e int respectivamente.
                    String parte1 = partes[0];
                    int parte2 = Integer.parseInt(partes[1]);
                    System.out.println(parte1 + ": " + parte2);
//       Se refleja con un sout.
                } else {
                    System.out.println("No tiene dos cadenas la línea: " + item);
//       Condicion si no contiene dos cadenas. Pueden ser mas..
                }
            }
        }
        bufferedReader.close();
        reader.close();
//        Lo cierro, aunque en "reader" no es obligatorio cerrarlo
        System.out.println("Operación Finalizada con exito. Redirigiendo al menú de tu inventario------->");
    }

    public static void sumarCantidadElemento(String lugar, ArrayList<String> listaElementos, Scanner scanner) throws IOException {
//        Limpiamos el Arraylist por si ha quedado algun elemento dentro, en alguna operacion anterior.
//        Asi podremos llenarlo de nuevo con los elemento almacenados en el archivo.
        listaElementos.clear();
        String inventarioLugar = "Inventario" + lugar;
//        Denomino dicha variable por agilizar proceso a la hora de declarar los "File" y "Buffered"
        FileReader reader = new FileReader(inventarioLugar);
        BufferedReader bufferedReader = new BufferedReader(reader);
//        Los declaro.
        String linea;
//        Declaro una variable de tipo string para posteriormente utilizarla como condicion de while y para añadir
        while ((linea = bufferedReader.readLine()) != null) {
//        Mientras no sea nula la linea leida del archivo...
            listaElementos.add(linea);
//        Se plasmara dicha linea en el arraylist.
        }
        bufferedReader.close();
        reader.close();
//        Lo cierro, aunque en "reader" no es obligatorio cerrarlo
//        Ahora lo unico que hay que hacer es separar en dos cadenas cada uno del los elementos del arraylist mediante un regex
//        ,declarar cada parte como una variable de tipo String e int respectivamente
//        Sumar un int a la parte2 de la particion generada en cada elemento de arraylist mediante el regex
//        Y esto se hace en cada iteracion referida a cada elemento, hasta llegar al ultimo del arraylist

        for (int i = 0; i < listaElementos.size(); i++) {
            String item = listaElementos.get(i);
            if (item.contains("_")) {
                String[] partes = item.split("_");
//       Herramienta aprendida en la ultima clase para separar un elemento "String" en dos cadenas de elementos o mas
//       Se denomina un elemento String "partes" para denominar a cada elemento String "item" del arraylist y partirlo en dos cadenas
                if (partes.length == 2) {
//       Si tiene dos partes se declararan dos variables para cada una de las partes, String e int respectivamente.
                    String parte1 = partes[0];
                    int parte2 = Integer.parseInt(partes[1]);
                    System.out.println("Añadir la cantidad a " + parte1);
//       Añadimos la instruccion al usuario para que este introduzca una cantidad de cada parte1
                    boolean numCorrecto = false;
                    while(!numCorrecto) {
                        try {
//       Utilizamos try-catch para evitar la introduccion de cualquier elemento que no sea un numero
                            int parte2Suma = scanner.nextInt();
//       El usuario introduce una cantidad
                            scanner.nextLine();
//       Limpieza de buffer.
                            if (parte2Suma >= 0) {
//       Si el numero introducido es mayor que cero
                                parte2 += parte2Suma;
//       Se sumara a la parte2, el valor introducido por el ususario.
                                listaElementos.set(i, parte1 + "_" + parte2);
//       Se sustituiran los elementos del arraylist que ya teniamos debido a la lectura del archivo, por los nuevos elementos introducidos mediante .set desde el primero hasta el ultimo por cada iteracion
                                System.out.println("Ahora " + parte1 + " tiene: " + parte2);
                                numCorrecto=true;
                            } else {
                                System.out.println("Tiene que ser mayor que cero.");
//       Si el numero introducido es menor que cero
                            }
                        } catch (Exception e) {
                            System.out.println("Tienes que introducir un número.");
                            scanner.nextLine();
//       Si el valor introducido no es un numero
                        }
                    }
                } else {
                    System.out.println("No tiene dos cadenas la línea: " + item);
//       Si no tiene dos cadenas
                }
            } else {
                System.out.println("¡Vaya! Todavía no hay productos");
//       Si no contiene guion bajo
            }
        }
//       Para copiar todos los nuevos elementos del arraylist modificado por el .set
//        Para cada uno de los elementos de la lista de elementos, lo escribimos en el archivo y hacemos un salto de linea
        FileWriter fileWriter = new FileWriter(inventarioLugar);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String elemento : listaElementos) {
            bufferedWriter.write(elemento);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Operación Finalizada con exito. Redirigiendo al menú de tu inventario------->");
    }

    public static void restarCantidadElemento(String lugar, ArrayList<String> listaElementos, Scanner scanner) throws IOException {
//         Es lo mismo que el metodo sumarCantidadElemento pero con resta en la operacion y con diferencia en la condicion de resta.
        listaElementos.clear();
        String inventarioLugar = "Inventario" + lugar;
        FileReader reader = new FileReader(inventarioLugar);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String linea;
        while ((linea = bufferedReader.readLine()) != null) {
            listaElementos.add(linea);
        }
        bufferedReader.close();

        for (int i = 0; i < listaElementos.size(); i++) {
            String item = listaElementos.get(i);
            if (item.contains("_")) {
                String[] partes = item.split("_");
                if (partes.length == 2) {
                    String parte1 = partes[0];
                    int parte2 = Integer.parseInt(partes[1]);
                    System.out.println("Restar la cantidad a " + parte1);
                    boolean numCorrecto2=false;
                    while (!numCorrecto2) {
                        try {
                            int parte2Resta = scanner.nextInt();
                            scanner.nextLine();
                            if (parte2Resta >= 0) {
                                if (parte2Resta <= parte2) {
                                    parte2 -= parte2Resta;
                                    listaElementos.set(i, parte1 + "_" + parte2);
                                    System.out.println("Ahora " + parte1 + " tiene: " + parte2);
                                    numCorrecto2=true;
                                } else {
                                    System.out.println("No puede ser mayor que " + parte2);
                                }
                            } else {
                                System.out.println("Tiene que ser mayor que cero. Vuelve a intentarlo");
                            }
                        } catch (Exception e) {
                            System.out.println("Tienes que introducir un número. Intenta de nuevo");
                            scanner.nextLine();
                        }
                    }
                } else {
                    System.out.println("No tiene dos cadenas la línea: " + item);
                }
            } else {
                System.out.println("¡Vaya! Todavía no hay productos");
            }
        }

        FileWriter fileWriter = new FileWriter(inventarioLugar);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String elemento : listaElementos) {
            bufferedWriter.write(elemento);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Operación Finalizada con exito. Redirigiendo al menú de tu inventario------->");
    }
}