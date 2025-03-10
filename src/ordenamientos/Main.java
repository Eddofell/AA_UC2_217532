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
        int[] arr = {10, 4, 24, 3, 8, 12};

        // Crear una instancia de la clase Burbuja
        Burbuja burbuja = new Burbuja();
        
        // Ordenar el arreglo
        burbuja.ordenar(arr);
        
        // Imprimir el arreglo ordenado
        System.out.print("Arreglo ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
