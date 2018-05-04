import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Una entrada con texto.
 * 
 * Pertenece a la aplicacion '0971 - red social'.
 * 
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor y un contenido.
 */

public class EntradaEvento extends Entrada
{

    // Contenido de la entrada.
    private String mensaje;

    /**
     * Constructor - Construye entradas a partir de un autor y un contenido.
     * Las entradas se crean sin ningun ' me gusta'.
     * La fecha de publicacion coincide con el momento en el que se crea la entrada.
     * @param autor Autor de la entrada.
     * @param mensaje Contenido de la entrada.
     */
    public EntradaEvento (String autor, String texto)
    {
        super(autor);

        mensaje = texto;

    }

    /**
     * Devuelve el contenido de la entrada.
     * @return Devuelve el contenido de la entrada.
     */
    public String getMensaje()
    {
        return mensaje;
    }

    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString()
    {
        String aDevolver = "";
        aDevolver += super.toString();
        aDevolver += mensaje + "\n";

        return aDevolver;
    }

    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String html()
    {
        String aDevolver = "";
        aDevolver += super.html();
        aDevolver +="<tr>"+"<td colspan=\"3\">"+ mensaje +"</td>"+"</tr>";

        return aDevolver;
    }

    @Override
    public void toStringExclusivo()
    {
        String aDevolver = "";
        aDevolver += mensaje + "\n";
        System.out.println( aDevolver);
    }

    public void mostrar(){

        System.out.println(this);
    }

}