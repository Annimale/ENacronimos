/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proyecto_acronimos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ivamar
 */
public class AcronimosTest {

    public AcronimosTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Iniciando test");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Test finalizado");
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testObtenerAcronimoCumpliendoDentroFor_If1_CumpliendoIF2() {
        System.out.println("obtenerAcronimo");
        String cadena = "Hola me llamo Pepe";
        Acronimos instance = new Acronimos();
        String expResult = "H.m.l.P.";
        String result = instance.obtenerAcronimo(cadena);
        assertEquals(expResult, result);

    }

    @Test
    public void testAcronimoCadenaVacia() {
        System.out.println("testAcronimoCadenaVacia");
        String cadena = "";
        Acronimos instance = new Acronimos();
        String expResult = "";
        String result = instance.obtenerAcronimo(cadena);
        assertEquals(expResult, result);

    }

    @Test
    public void testAcronimoifElseif() {
        System.out.println("testAcronimoifElseif");
        String cadena = " holaquetal";
        Acronimos instance = new Acronimos();
        String expResult = "h.";
        String result = instance.obtenerAcronimo(cadena);
        assertEquals(expResult, result);

    }
    /* ACABADO*/
}
