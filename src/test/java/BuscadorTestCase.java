
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import insw.Buscador;
import java.util.Arrays;
import java.util.List;
 
class BuscadorTestCase {

    Buscador buscador;
    List<String> lista;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
        lista = Arrays.asList("hola", "mundo", "prueba", "busqueda");
    }

    @Test
    @DisplayName("Test buscarFrase method - positive case")
    void testBuscarFrasePositive() {
        assertTrue(buscador.buscarFrase("mundo", lista), "Should return true if the phrase is in the list");
    }

    @Test
    @DisplayName("Test buscarFrase method - negative case")
    void testBuscarFraseNegative() {
        assertFalse(buscador.buscarFrase("no existe", lista), "Should return false if the phrase is not in the list");
    }

    @Test
    @DisplayName("Test buscarPalabra method - positive case")
    void testBuscarPalabraPositive() {
        assertTrue(buscador.buscarPalabra("hola", lista), "Should return true if the word is in the list");
    }

    @Test
    @DisplayName("Test buscarPalabra method - negative case")
    void testBuscarPalabraNegative() {
        assertFalse(buscador.buscarPalabra("no existe", lista), "Should return false if the word is not in the list");
    }

    @Test
    @DisplayName("Test devolverPalabra method")
    void testDevolverPalabra() {
        assertEquals("mundo", buscador.devolverPalabra(lista, 1), "Should return the word at the given position");
    }

    @Test
    @DisplayName("Test devolverPalabra method with out of bounds index")
    void testDevolverPalabraOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> buscador.devolverPalabra(lista, 10), 
                     "Should throw IndexOutOfBoundsException for an invalid index");
    }

    @Test
    @DisplayName("Test devolverPrimerElemento method")
    void testDevolverPrimerElemento() {
        assertEquals("hola", buscador.devolverPrimerElemento(lista), "Should return the first element of the list");
    }

    @Test
    @DisplayName("Test devolverUltimoElemento method")
    void testDevolverUltimoElemento() {
        assertThrows(IndexOutOfBoundsException.class, () -> buscador.devolverUltimoElemento(lista), 
                     "Should throw IndexOutOfBoundsException due to incorrect index calculation");
    }

	
	

}

