

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private Muro muro1;
    private EntradaFoto entradaF1;
    private EntradaFoto f2;
    private EntradaTexto t1;
    private EntradaTexto entradaT1;
    private EntradaEvento e1;
    private EntradaEvento entradaE1;
    private EntradaFoto entradaF2;
    private EntradaFoto entradaF3;

    
    
    
    
    
    
    

    
    
    
    

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        muro1 = new Muro();
        entradaF1 = new EntradaFoto("luis", "https://www.google.es/search?biw=1536&bih=759&tbm=isch&sa=1&ei=PxLsWtuIO4efgAaanbvYBg&q=ramdon&oq=ramdon&gs_l=psy-ab.3..0i10k1l2j0i5i30k1j0i5i10i30k1j0i5i30k1j0i5i10i30k1j0i10i24k1l4.2900.8323.0.8783.7.7.0.0.0.0.99.565.6.7.0....0...1c.1.64.psy-ab..0.6.562.0..0j0i67k1j0i10i30k1.85.CsnPjZYMQWU#imgrc=GqsrQUxDcG8MxM:", "ramdom");
        f2 = new EntradaFoto("fernando", "https://www.google.es/search?biw=1536&bih=759&tbm=isch&sa=1&ei=dxLsWpGhKofegAb4-5OQDw&q=linux+memes&oq=linux+memes&gs_l=psy-ab.3..0j0i5i30k1l3.4185.8652.0.8783.6.6.0.0.0.0.133.620.3j3.6.0....0...1c.1.64.psy-ab..0.6.619...0i67k1j0i30k1j0i8i30k1.0.pw2wRTY5awc#imgrc=0YtDgeMlSWg5RM:", "linux");
        t1 = new EntradaTexto("luis", "Un Anillo para gobernarlos a todos. Un Anillo para encontrarlos, un Anillo para atraerlos a todos y atarlos en las tinieblas");
        entradaT1 = new EntradaTexto("pepe", "el dia que me muera yo quiero mi cajon pintado azul y blanco como mi corazon");
        e1 = new EntradaEvento("hulio", "e encontrado a mi perro mis tetas");
        entradaE1 = new EntradaEvento("heronima", " te has unido a fans de mojinos escocios");
        muro1.addEntrada(f2);
        muro1.addEntrada(t1);
        muro1.addEntrada(e1);
        muro1.addEntrada(entradaF1);
        muro1.addEntrada(entradaT1);
        muro1.addEntrada(entradaE1);
        entradaF1.html();
        entradaF2 = new EntradaFoto("luis", "https://img.memecdn.com/windows-vs-linux_o_2886569.jpg", "linux");
        entradaF3 = new EntradaFoto("jorge", "https://ih0.redbubble.net/image.233855322.1016/flat,800x800,075,f.jpg", "wolololo");
        muro1.addEntrada(entradaF2);
        muro1.addEntrada(entradaF3);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
