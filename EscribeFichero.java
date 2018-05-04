import java.io.*;
import java.nio.file.*;
public class EscribeFichero
{
    public void mostrarMuroPorElBuscador(){
        // Obtenemos una referencia a una ruta donde estará el archivo
        Path rutaArchivo = Paths.get("G:/dam1/java/red-social/README.txt");;

        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una

        try{
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write("Hola!!\n");
            archivo.write("Adios!!\n");
            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }      
    }
}
