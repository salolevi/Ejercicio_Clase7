import java.util.HashMap;

public class ArbolFactory {

    private static final HashMap<String, Arbol> map = new HashMap<>();

    public static Arbol getArbol(String color) {
        Arbol arbol = map.get(color);

        if (arbol != null) return arbol;

        if (color.equals("verde")) {
            arbol = new Arbol(200, 400, color);
        } else if (color.equals("rojo")) {
            arbol = new Arbol(500, 300, color);
        } else if (color.equals("celeste")) {
            arbol = new Arbol(100, 200, color);
        }

        map.put(color, arbol);
        return arbol;
    }
}
