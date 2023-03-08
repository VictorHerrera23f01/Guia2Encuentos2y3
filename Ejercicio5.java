/*
 Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el doble, el triple y la raíz cuadrada 
de ese número. 

Nota: investigar la función Math.sqrt().

 */
package Guia2Encuentros2y3;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int num;
        System.out.print("Ingrese Un Numero: ");
        num = teclado.nextInt();
        
        System.out.println("El Doble: " + num*2);
        System.out.println("El Triple: " + num*3);
        System.out.println("La Raiz Cuadrada: " + Math.sqrt(num));
        teclado.close();
    }
}
