import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArbolFactoryTest {

    @Test
    @DisplayName("Se decide crear un arbol ornamental")
    public void test1() throws ColorIncorrectoException {
//        GIVEN
        String color = "verde";
//        WHEN
        Arbol arbol = ArbolFactory.getArbol(color);
        Arbol arbol2 = ArbolFactory.getArbol(color);
//        THEN
        assertSame(arbol, arbol2);
    }

    @Test
    @DisplayName("Se decide crear un arbol frutal")
    public void test2() throws ColorIncorrectoException {
//        GIVEN
        String color = "rojo";
//        WHEN
        Arbol arbol = ArbolFactory.getArbol(color);
        Arbol arbol2 = ArbolFactory.getArbol(color);
//        THEN
        assertSame(arbol, arbol2);
    }

    @Test
    @DisplayName("Se decide crear un arbol floral")
    public void test3() throws ColorIncorrectoException {
//        GIVEN
        String color = "celeste";
//        WHEN
        Arbol arbol = ArbolFactory.getArbol(color);
        Arbol arbol2 = ArbolFactory.getArbol(color);
//        THEN
        assertSame(arbol, arbol2);
    }

    @Test
    @DisplayName("Se intenta crear un arbol de color violeta")
    public void test4() {
//    GIVEN
        String color = "violeta";
//        WHEN

//        THEN
        assertThrows(ColorIncorrectoException.class, ()-> ArbolFactory.getArbol(color));
    }
}
