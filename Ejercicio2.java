/*
Escribir un programa que pida tu nombre, lo guarde en una 
variable y lo muestre por pantalla.
*/
package Guia2Encuentros2y3;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String []args){
        Scanner teclado=new Scanner(System.in);
        
        String nombre;
        System.out.print("Ingrese Su Nombre: ");
        nombre = teclado.next();
        
        System.out.println("El Nombre Ingresado es: "+nombre);
        teclado.close();
    }
}
