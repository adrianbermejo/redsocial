

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
    private EntradaFoto entradaF1;
    private EntradaFoto entradaF2;
    private EntradaTexto entradaT1;
    private EntradaTexto entradaT2;

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
        entradaF1 = new EntradaFoto("1", "1", "1");
        entradaF2 = new EntradaFoto("12", "12", "12");
        entradaT1 = new EntradaTexto("12", "12");
        entradaT2 = new EntradaTexto("12123", "asdqqwe");
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
