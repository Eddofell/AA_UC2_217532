/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamientos;

/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {10, 4, 24, 3, 8, 12};
        int[] arr2 = arr1.clone(); // Copia del arreglo original para Burbuja
        int[] arr3 = arr1.clone(); // Copia para Inserción
        int[] arr4 = arr1.clone(); // Copia para QuickSort

        // Crear instancias de las clases de ordenamiento
        Seleccion seleccion = new Seleccion();
        Burbuja burbuja = new Burbuja();
        Insercion insercion = new Insercion();
        Quicksort quickSort = new Quicksort(); // Nueva instancia de QuickSort

        // Ordenar con selección
        seleccion.ordenar(arr1);
        System.out.print("Ordenado con Seleccion: ");
        imprimirArreglo(arr1);

        // Ordenar con burbuja
        burbuja.ordenar(arr2);
        System.out.print("Ordenado con Burbuja: ");
        imprimirArreglo(arr2);

        // Ordenar con inserción
        insercion.ordenar(arr3);
        System.out.print("Ordenado con Insercion: ");
        imprimirArreglo(arr3);

        // Ordenar con QuickSort
        quickSort.ordenar(arr4, 0, arr4.length - 1);
        System.out.print("Ordenado con QuickSort: ");
        imprimirArreglo(arr4);
    }

    // Método para imprimir un arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
