public class MetodosDeOrdenamiento {

    public int[] sortBySeleccion(int[] arreglo, boolean asendente){
        int tamanio = arreglo.length;

        //Recorrer el arreglo
        for(int i = 0; i<tamanio ; i++){
            int indice = i;
            for(int j = i+1; j<tamanio ; j ++){
                if (asendente? arreglo[j] < arreglo[indice] : arreglo[j] > arreglo[indice]){
                    indice = j;
                }
            }
            // Intercambio del indice encontrado por el primero
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

    public void printArreglo(int[]arreglo){
        
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
