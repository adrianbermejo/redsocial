import java.util.ArrayList;
import java.io.*;
import java.nio.file.*;
import java.awt.Desktop;
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

        for (Entrada entrada : mensajes){
            entrada.mostrar();
        }
    }

    /**
     * Muestra los datos de las entradas que le digamos
     * @param el tipo de entrada que quieras imprimir
     */
    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada)
    {
        for (Entrada entrada : mensajes) {
            if (entrada.getClass().getSimpleName().equals(tipoEntrada) || tipoEntrada == null) {
                switch(entrada.getClass().getSimpleName()){
                    case "EntradaTexto":
                    ((EntradaTexto) entrada).toStringExclusivo(); 
                    break;
                    case "EntradaFoto":
                    ((EntradaFoto) entrada).toStringExclusivo();
                    break;
                    case "EntradaEvento":
                    ((EntradaEvento) entrada).toStringExclusivo();
                    break;
                }
            }
        }
    }

    public void mostrarMuroPorElBuscador(){
        // Obtenemos una referencia a una ruta donde estará el archivo
        Path rutaArchivo = Paths.get("output.html");
            File objetofile = new File ("output.html");
        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una

        try{
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
             
            Desktop.getDesktop().open(objetofile);
            
              archivo.write("<!DOCTYPE html><html lang= \"es\" ><head><meta charset=\"UTF-8\"><title>Ejercicio 3.11</title><style type=\"text/css\">");
              archivo.write("");
              archivo.write("table, tr,th, td {border: 1px solid black;background-image: url(\"https://www.planwallpaper.com/static/images/violet-vector-leaves-circles-backgrounds-for-powerpoint_PdfkI4q.jpg); body{ background-image: url(\"https://www.planwallpaper.com/static/images/violet-vector-leaves-circles-backgrounds-for-powerpoint_PdfkI4q.jpg);}");
    

               archivo.write("li a {color: black;text-decoration: none;}</style></head><body><h1 style=\"text-align:center;\">muro faceboook</h1><table >");
			
			
			
			 // Buscamos todas las entradas de texto.
        for (Entrada entrada : mensajes) {
            archivo.write( entrada.html() );
        }

               archivo.write("</table></body></html>");
       
       
           
            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
              

            System.out.println(excepcion.toString());
        }      
    }
    // public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada){
    // for (Entrada entrada : mensajes){
    // switch (tipoEntrada) {

    // case "EntradaTexto":
    // if (entrada instanceof EntradaTexto){

    // EntradaTexto a = (EntradaTexto)entrada;
    // a.toStringExclusivo();
    // }
    // break;

    // case "EntradaFoto":
    // if (entrada instanceof EntradaFoto){

    // EntradaFoto a = (EntradaFoto)entrada;
    // a.toStringExclusivo();
    // }
    // break;
    // case "EntradaEvento":
    // if (entrada instanceof EntradaEvento){

    // EntradaEvento a = (EntradaEvento)entrada;
    // a.toStringExclusivo();
    // }
    // break;
    // case "null":
    // if (entrada instanceof EntradaTexto){

    // EntradaTexto a = (EntradaTexto)entrada;
    // a.toStringExclusivo();
    // }
    // if (entrada instanceof EntradaFoto){

    // EntradaFoto a = (EntradaFoto)entrada;
    // a.toStringExclusivo();
    // }
    // if (entrada instanceof EntradaEvento){

    // EntradaEvento a = (EntradaEvento)entrada;
    // a.toStringExclusivo();
    // }
    // }
    // }
    // }
}