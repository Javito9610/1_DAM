import java.io.BufferedReader;
import java.io.FileReader;

public class LecturaArchivo {
    public static void main(String[] args) {
// podemos llamar igual a varias funciones, cambiando sus variables y ya dejaria de ser la misma.
//        en sout \n salta de linea y \t tabula.
//        El return termina las funciones y retorna valores.
//        .equals es de los strings
//        nos puede servir para los ifs : if (esUnString.equals("hola"))
//        tambien existe .toLowerCase() que lo pasa a minusculas . Es lo mismo que el string == a lo que sea.
//        tambien existe .toUpperCase() lo pasa a mayusculas.
//        un archivo es persistente. No se borra cuando se cierra el programa.
//        todas las variables van a la ram, pero el archivo va a la rom.
//        en un archivo se puede o leer o plasmar o modificar
//         para plasmar un archivo es import java.io.File;
//        aunque nosotros solo queremos el contenido del archivo o el buffer.
//         el buffer es como un tunel
//         siempre cuando acabemos se cierra archivo para que éste no se corrompa
        String ruta = "ejemplo.txt";
//        para invocar un archivo
        try{
//            me abro un lector de file.
            FileReader fileReader = new FileReader(ruta);
//            me abro un buffer de escritura. dicho buffer requiere de un archivo file
            BufferedReader reader = new BufferedReader(fileReader);
            boolean comprobado = false;
            while(!comprobado){
                String texto = reader.readLine();

                if (texto==null || texto.equals("salir")){
                    comprobado = true;
                }else{
                    System.out.println(texto);
                }
            }
            fileReader.close();
            reader.close();
        }catch(Exception e){
            System.out.println("Ups...fallo");
        }
    }
}
