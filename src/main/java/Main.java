public class Main {
    public static void main(String[] args) throws ColorIncorrectoException {

        Bosque bosque = new Bosque();

        for (int i = 0; i < 500000; i++) {
            Arbol arbolVerde = ArbolFactory.getArbol("verde");
            Arbol arbolRojo = ArbolFactory.getArbol("rojo");
            bosque.plantarArbol(arbolVerde);
            bosque.plantarArbol(arbolRojo);
        }
        bosque.mostrarArboles();
        System.out.println(bosque.cantidadArboles());

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}
