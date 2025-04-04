/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

/**
 *
 * @author Carlos
 */
public class Mergesort {

    /**
     // Pseudocódigo
      MERGE-SORT(A, inicio, fin)
        Si inicio < fin entonces
	medio ← (inicio + fin) / 2
	MERGE-SORT(A, inicio, medio)
	MERGE-SORT(A, medio+1, fin)
	MERGE(A, inicio, medio, fin)
     */
    
    public static void mergeSort(int[] arr, int izquierda, int derecha){
        // Caso base
        if (izquierda < derecha){
            int medio = (izquierda + derecha) / 2;
            
            // Llamada recursiva del lado izquierdo
            mergeSort(arr, izquierda, medio);
            
            // Lamada recursiva del lado derecho;
            mergeSort(arr, medio + 1 , derecha);
            
            merge(arr, izquierda, medio, derecha);
        }
    }
    
    public static void merge(int[] arr, int izquierda, int medio, int derecha){
        
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;
        
        // Arreglos temporales
        int[] izquierdaArr = new int[n1];
        int[] derechaArr = new int[n2];
        
        // Copiar los datos al arreglo izquierdo
        for (int i = 0; i < n1; i++){
            izquierdaArr[i] = arr[izquierda + i];
        }
        
        // COpiar los datos al lado derecho
        for (int j = 0; j < n2; j++){
            derechaArr[j] = arr[medio + 1 + j];
        }
        
        int i = 0;
        int j = 0;
        int k = izquierda;
        
        // Mezclar los arreglos temporales con arreglo
        while (i < n1 && j < n2){
            if (izquierdaArr[i] <= derechaArr[j]){ // Esto hace que MergeSort sea un algoritmo estable
                arr[k] = izquierdaArr[i];
                i++;
            } else {
                arr[k] = derechaArr[j];
                j++;
            }
            k++;
        }
        
        // Agrega cualquier elemento sobrante de la parte izquierda
        while (i < n1) {
            arr[k] = izquierdaArr[i];
            i++;
            k++;
        }
        
        // Agrega cualquier elemento sobrante de la parte derecha
        
        while (j < n2 ){
            arr[k] = derechaArr[j];
            j++;
            k++;
        }
        
    }
    
    public static void imprimirArreglo(int[] arr){
        for (int num: arr){
            System.out.print(num + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] arreglo = {20, 10, 40, 90, 80, 70, 30};
        
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);
        
        
        mergeSort(arreglo, 0, arreglo.length -1);
        
        System.out.println("Arreglo ordenado");
        imprimirArreglo(arreglo);
    }
    
}
