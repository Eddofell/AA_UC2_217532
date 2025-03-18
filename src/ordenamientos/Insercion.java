/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

/**
 *
 * @author Carlos
 */
public class Insercion {
    public void ordenar(int[] arr) {
        int n = arr.length;  // 1 operación (asignación)
        
        for (int i = 1; i < n; i++) { // (n - 1) comparaciones + (n - 1) asignaciones
            int key = arr[i];  // (n - 1) asignaciones
            int j = i - 1;  // (n - 1) asignaciones

            // Mover elementos mayores a la derecha
            while (j >= 0 && arr[j] > key) { // Máximo (n(n-1))/2 comparaciones
                arr[j + 1] = arr[j]; // Máximo (n(n-1))/2 asignaciones
                j--; // Máximo (n(n-1))/2 decrementos
            }

            arr[j + 1] = key;  // (n - 1) asignaciones
        }
    }
}
