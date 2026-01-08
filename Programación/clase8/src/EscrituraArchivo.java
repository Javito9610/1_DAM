import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class EscrituraArchivo {
    public static void main(String[] args) {
        String ruta = "manolo.txt";
        try{
            FileWriter writer = new FileWriter(ruta);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hola mar te quiero mucho.");
//            Thread.sleep(20000);
            bufferedWriter.close();
            writer.close();
//            siempre se cierra el buffered antes que el writer

        } catch (Exception e) {
            System.out.println("fallo");
        }
    }
}
