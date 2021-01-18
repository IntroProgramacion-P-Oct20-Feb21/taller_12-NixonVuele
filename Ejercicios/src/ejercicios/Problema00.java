/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema00 {

    public static void main(String[] args) {
        int[] datos = {10, 2, 4, 1};
        System.out.printf("%d\n", misterio(datos, datos.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }
}
/*
En este codigo la salida va a ser 17, debido a que es un codigo que recorre un 
arreglo de tipo entero llamado datos, y mientras recorre los arreglos desde la 
posicion 0 hasta la n todos los datos de todas las posiciones son sumados para 
al final mostral la suma total de todos los elementos del arreglo datos
*/