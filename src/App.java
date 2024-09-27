

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Metodos de ordenamiento Short");
        MetodosDeOrdenamiento metOs = new MetodosDeOrdenamiento();
        
        int[] arreglo = {9, 4, 6, 2, 7, 5};
        metOs.sortBySeleccion(arreglo, true);
        metOs.printArreglo(arreglo);
        System.out.println("\n----------\n");

        metOs.sortBySeleccion(arreglo, false);
        metOs.printArreglo(arreglo);
        System.out.println("\n----------\n");
    }
}
