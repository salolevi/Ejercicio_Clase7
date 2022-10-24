import java.util.ArrayList;
import java.util.List;

public class Bosque {
    private final List<Arbol> arboles = new ArrayList<>();

    public void plantarArbol(Arbol arbol) {
        this.arboles.add(arbol);
    }

    public void mostrarArboles() {
        if (this.arboles.size() == 0) System.out.println("El bosque esta vacio");
        else {
            for (Arbol a: this.arboles) {
                System.out.println("Arbol de color " + a.getColor() + " de alto " + a.getAlto() + " y de ancho " + a.getHorizontal());
            }
        }
    }

    public Integer cantidadArboles() {
        return this.arboles.size();
    }
}
