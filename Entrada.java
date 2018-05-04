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
 

    public Entrada (String autor)
    {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
     
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
        return  usuario;  
    }

    public int getCantidadMeGusta(){
        return  cantidadMeGusta;  
    }

    
    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString()
    {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + cantidadMeGusta + "\n";        
        
        // Calculamos el numero de segundos que han pasado desde la fecha de publicacion.
        long numeroSegundos = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        aDevolver += "Escrito hace ";

        // Comprobamos si debemos expresar el tiempo en segundos o minutos.
        if(numeroSegundos > 59){
            aDevolver += numeroSegundos / 60 + " minutos";
        }
        else {
            aDevolver += numeroSegundos + " segundos";
        }
             

        return aDevolver;
    }
   
    
    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    public String html()
    {
        String aDevolver = "";
        aDevolver += "<tr>" + "<td>"+"Usuario: " + usuario  + "</td>";
        aDevolver +="<td>"+ "Likes: " + cantidadMeGusta + "</td>";        
        
        // Calculamos el numero de segundos que han pasado desde la fecha de publicacion.
        long numeroSegundos = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        aDevolver += "<td>" + "Escrito hace ";

        // Comprobamos si debemos expresar el tiempo en segundos o minutos.
        if(numeroSegundos > 59){
            aDevolver += numeroSegundos / 60 + " minutos";
        }
        else {
            aDevolver += numeroSegundos + " segundos";
        }
           aDevolver +=  "</td>"+"</tr>";

        return aDevolver;
    }
   public void mostrar(){
       
    }
    
     public void toStringExclusivo()
    {
    }
}