import java.util.ArrayList;

/**
 * El muro de nuestra red social.
 * 
 * Pertenece a la aplicacion '0971 - red social'.
 * 
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 */
 public class Muro 
 {
    // Entradas de texto.
    private ArrayList <EntradaTexto> mensajes;
    // Entradas con imagenes.
    private ArrayList <EntradaFoto> fotos;
     // Entradas con eventos.
    private ArrayList <EntradaEvento> eventos;
    
    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro()
    {
        //Inicializa mensajes ,fotos y eventos .
        mensajes = new ArrayList<>();
        fotos = new ArrayList<>();
        eventos = new ArrayList<>();
    }
    
    /**
     * Anade una entrada de texto al muro.
     * @param entrada La entrada de texto a anadir.
     */
    public void addEntradaTexto(EntradaTexto entrada)
    {
        mensajes.add(entrada);
    }
    
    /**
     * Anade una entrada de imagen al muro.
     * @param entradaFoto La entrada de imagen a anadir.
     */
     public void addEntradaFoto(EntradaFoto entradaFoto)
     {
         fotos.add(entradaFoto);
     }
     
      /**
     * Anade una entrada de texto al muro.
     * @param entrada La entrada de texto a anadir.
     */
    public void addEntradaEvento(EntradaEvento entrada)
    {
       eventos.add(entrada);
    }
    
    
    /**
     * Devuelve una cadena con toda la informacion del muro.
     * @return Devuelve una cadena con toda la informacion del muro.
     */
    @Override
    public String toString()
    {
        String aDevolver = "";
        
        // Buscamos todas las entradas de texto.
        for (EntradaTexto entrada : mensajes) {
            aDevolver += entrada + "\n\n";
        }
        
        // Buscamos todas las entradas con foto.
        for (EntradaFoto entrada : fotos) {
            aDevolver += entrada + "\n\n";
        }
        
         // Buscamos todas las entradas con eventos.
        for (EntradaEvento entrada : eventos) {
            aDevolver += entrada + "\n\n";
        }
        
        return aDevolver;
    }
    
    /**
     * Muestra el muro por la terminal de texto.
     */
    public void mostrarMuro() 
    {
        System.out.println(this);
    }
 }