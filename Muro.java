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
    private ArrayList <Entrada> mensajes;
  
    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro()
    {
        //Inicializa mensajes ,fotos y eventos .
        mensajes = new ArrayList<>();
        
    }
    
    /**
     * Anade una entrada de texto al muro.
     * @param entrada La entrada de texto a anadir.
     */
    public void addEntrada(Entrada entrada)
    {
        mensajes.add(entrada);
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
        for (Entrada entrada : mensajes) {
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