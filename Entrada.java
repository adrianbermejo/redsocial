import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Write a description of class Entrada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Entrada
{
    // Usuario que crea la entrada.
    private String usuario;
    // Fecha de publicacion de la entrada.
    private LocalDateTime momentoPublicacion;
    // Numero de 'me gusta' de la entrada.
    private int cantidadMeGusta;
    // Comentarios de la entrada.
    private ArrayList<String> comentarios;

    public Entrada (String autor)
    {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
    }

    /**
     * Anade un 'me gusta' a la entrada.
     */
    public void meGusta()
    {
        cantidadMeGusta += 1;
    }

    

    /**
     * Devuelve la fecha de publicacion.
     * @return Devuelve la fecha de publicacion.
     */
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }

    public String getUsuario(){
        return  "Usuario: " + usuario + "\n";  
    }

    public String getCantidadMeGusta(){
        return  "Likes: " + cantidadMeGusta + "\n";  
    }

   

}