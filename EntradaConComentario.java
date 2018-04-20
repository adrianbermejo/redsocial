import java.util.ArrayList;

/**
 * Write a description of class Comentario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EntradaConComentario extends Entrada
{
    // Comentarios de la entrada.
    private ArrayList<String> comentarios;

    public EntradaConComentario(String autor){
        super(autor);
        comentarios = new ArrayList<>();
    }
    
    /**
     * Anade un comentario a a la entrada.
     * @param text El comentario a anadir.
     */
    public void addComentario(String text)
    {
        comentarios.add(text);
    }
    
     public String getcomentarios(){
        String aDevolver ="";
        // Comprobamos si hay comentarios. Si hay los mostramos, si no, mostramos un mensaje indicandolo.
        if (comentarios.size() == 0)         {
            aDevolver += "No hay comentarios\n";
        }
        else {
            aDevolver += "Comentarios: \n";
            for(String comentarioActual : comentarios){
                aDevolver += comentarioActual + "\n";
           }
        }
        return aDevolver;
    }
}
