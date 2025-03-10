/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

/**
 *
 * @author Carlos
 */
public class Seleccion {
    public void ordenar(int[] arr) {
        int n = arr.length; //1
        for (int i = 0; i < n - 1; i++) { //(n - 1) + (n - 1)
            int minIndex = i; //(n - 1)
            for (int j = i + 1; j < n; j++) { // Suma total: (n(n-1))/2 comparaciones
                if (arr[j] < arr[minIndex]) { // (n(n-1))/2 comparaciones
                    minIndex = j; // (n(n-1))/2 asignaciones
                }
            }
            // Intercambiar el mínimo encontrado con arr[i]
            int temp = arr[i]; // (n - 1) asignaciones
            arr[i] = arr[minIndex]; // (n - 1) asignaciones
            arr[minIndex] = temp; // (n - 1) asignaciones
        }
    }
}