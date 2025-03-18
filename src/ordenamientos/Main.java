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
        int[] arr2 = arr1.clone(); // Copia del arreglo original
        int[] arr3 = arr1.clone(); // Otra copia para inserción

        // Crear instancias de las clases de ordenamiento
        Seleccion seleccion = new Seleccion();
        Burbuja burbuja = new Burbuja();
        Insercion insercion = new Insercion(); // Nueva instancia de Insercion
        
        // Ordenar con selección
        seleccion.ordenar(arr1);
        System.out.print("Ordenado con Seleccion: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea

        // Ordenar con burbuja
        burbuja.ordenar(arr2);
        System.out.print("Ordenado con Burbuja: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea

        // Ordenar con inserción
        insercion.ordenar(arr3);
        System.out.print("Ordenado con Insercion: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea
    }
}
