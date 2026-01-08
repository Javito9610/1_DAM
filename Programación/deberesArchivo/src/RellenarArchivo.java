import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class RellenarArchivo {
    public static void main(String[] args) {
        System.out.println("Bienvenido.");
        System.out.println("Podrás rellenar tu archivo hasta que escribas la palabra: Salir.");
        System.out.println(".........................Comencemos.............................");
        String ruta = "rellenable.txt";
        try{
            Scanner scanner = new Scanner(System.in);
            FileWriter writer = new FileWriter(ruta, true);
//            He puesto true para que el archivo se quede anexado y toda la información que plasme en el archivo persista en el tiempo, sin que se sobrescriba cada vez que se ejecute el programa.
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            boolean terminarDeEscribir = false;
            while(!terminarDeEscribir){
                String texto = scanner.nextLine();
                bufferedWriter.write(texto);
                if (texto.equalsIgnoreCase("Salir.")){
                    bufferedWriter.newLine();
                    terminarDeEscribir = true;
                }else{
                    bufferedWriter.newLine();
                    terminarDeEscribir = false;
                }

            }
            bufferedWriter.close();
            writer.close();


        }catch (Exception e){
            System.out.println("Fallo...");
        }
    }
}
